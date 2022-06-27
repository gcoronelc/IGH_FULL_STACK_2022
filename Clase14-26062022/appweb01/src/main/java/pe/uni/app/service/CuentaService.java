package pe.uni.app.service;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


import pe.uni.app.db.AccesoDB;
import pe.uni.app.specification.CuentaSpecification;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware
 * @cursos gcoronelc.github.io
 */
public class CuentaService implements CuentaSpecification {

	@Override
	public void procRetiro(String cuenta, Double importe, String clave, String empleado) {
		// Variables
		int contMov, filas;
		Double saldo;
		Connection cn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		String sql;
		// Proceso
		try {
			// Acceso al objeto Connection
			cn = AccesoDB.getConnection();
			// Inicia Tx
			cn.setAutoCommit(false);
			// Paso 1: Leer datos de la cuenta
			sql = "select dec_cuensaldo, int_cuencontmov from eureka.cuenta "
					  + "where chr_cuencodigo = ? for update ";
			pstm = cn.prepareStatement(sql);
			pstm.setString(1, cuenta);
			rs = pstm.executeQuery();
			if (!rs.next()) {
				rs.close();
				pstm.close();
				throw new SQLException("Datos incorrectos.");
			}
			saldo = rs.getDouble("DEC_CUENSALDO");
			contMov = rs.getInt("INT_CUENCONTMOV");
			rs.close();
			pstm.close();
			// Varificar saldo
			if (saldo < importe) {
				throw new SQLException("Saldo insificiente.");
			}
			// Actualizar valores
			saldo -= importe;
			contMov++;
			sql = "update eureka.cuenta "
					  + "set dec_cuensaldo = ?, int_cuencontmov = ? "
					  + "where chr_cuencodigo = ? and chr_cuenclave = ?";
			pstm = cn.prepareStatement(sql);
			pstm.setDouble(1, saldo);
			pstm.setInt(2, contMov);
			pstm.setString(3, cuenta);
			pstm.setString(4, clave);
			filas = pstm.executeUpdate();
			pstm.close();
			if (filas == 0) {
				throw new Exception("No se puede actualizar la cuenta.");
			}
			// Registrar movimiento
			sql = "insert into eureka.movimiento(chr_cuencodigo,int_movinumero,dtt_movifecha,chr_emplcodigo,"
					  + "chr_tipocodigo,dec_moviimporte) values(?,?,SYSDATE,?,'004',?)";
			pstm = cn.prepareStatement(sql);
			pstm.setString(1, cuenta);
			pstm.setInt(2, contMov);
			pstm.setString(3, empleado);
			pstm.setDouble(4, importe);
			pstm.executeUpdate();
			pstm.close();
			// Confirmar Tx
			cn.commit();
		} catch (Exception e) {
			try {
				// Cancela Tx
				cn.rollback();
			} catch (Exception e1) {
			}
			String mensaje = "Error en el Proceso, intentelo mas tarde.";
			if (e.getMessage() != null && !e.getMessage().isEmpty()) {
				mensaje += " " + e.getMessage();
			}
			throw new RuntimeException(mensaje);
		} finally {
			try {
				cn.close();
			} catch (Exception e) {
			}
		}
	}

	@Override
	public void procDeposito(String cuenta, Double importe, String empleado) {
		Connection cn = null;
		try {
			// Obtener el objeto connection
			cn = AccesoDB.getConnection();
			// Cancelar el control de transacciones
			// La Tx se controla en el SP
			cn.setAutoCommit(true);
			// Proceso
			String sql = "{call eureka.usp_egcc_deposito(?,?,?)}";
			CallableStatement cstm = cn.prepareCall(sql);
			cstm.setString(1, cuenta);
			cstm.setDouble(2, importe);
			cstm.setString(3, empleado);
			cstm.executeUpdate();
			cstm.close();
		} catch (SQLException e) {
			// Propagar excepcion
			throw new RuntimeException(e.getMessage());
		} catch (Exception e) {
			// Propagar excepcion
			throw new RuntimeException("Error en el proceso, intentelo mas tarde.");
		} finally {
			try {
				if (cn != null) {
					cn.close();
				}
			} catch (Exception e) {
			}
		}
	}

	@Override
	public List<Map<String, ?>> conMovimientos(String cuenta) {
		List<Map<String, ?>> lista = new ArrayList<>();
		Connection cn = null;
		PreparedStatement pstm;
		ResultSet rs;
		String sql = "select sucucodigo, sucunombre, cliecodigo, cliepaterno, "
				  + "cliematerno, clienombre, cuencodigo, cuensaldo,"
				  + "cuenestado, movinumero, movifecha, moviimporte,"
				  + "cuenreferencia, tipocodigo, tiponombre, tipoaccion, "
				  + "monecodigo, monenombre from EUREKA.v_movimientos where cuencodigo = ? ";
		try {
			cn = AccesoDB.getConnection();
			pstm = cn.prepareStatement(sql);
			pstm.setString(1, cuenta);
			rs = pstm.executeQuery();
			lista = JdbcUtil.rsToList(rs);
			rs.close();
			pstm.close();
		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage());
		} catch (Exception e) {
			throw new RuntimeException("Error en el proceso, intentelo nuevamente.");
		} finally {
			try {
				cn.close();
			} catch (Exception e) {
			}
		}
		return lista;
	}

}
