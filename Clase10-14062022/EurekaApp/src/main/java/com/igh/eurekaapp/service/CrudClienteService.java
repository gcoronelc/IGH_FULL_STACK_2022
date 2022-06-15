package com.igh.eurekaapp.service;

import com.igh.eurekaapp.db.AccesoDB;
import com.igh.eurekaapp.model.ClienteModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware
 * @cursos gcoronelc.github.io
 */
public class CrudClienteService implements CrudServiceSpec<ClienteModel>, RowMapper<ClienteModel> {

	private final String SQL_SELECT_BASE = "SELECT CHR_CLIECODIGO codigo, VCH_CLIEPATERNO paterno,"
			  + "VCH_CLIEMATERNO materno, VCH_CLIENOMBRE nombre, CHR_CLIEDNI dni, VCH_CLIECIUDAD ciudad, "
			  + "VCH_CLIEDIRECCION direccion, VCH_CLIETELEFONO telefono, VCH_CLIEEMAIL email "
			  + "FROM EUREKA.CLIENTE ";

	@Override
	public ClienteModel read(String codigo) {
		ClienteModel model = null;
		Connection cn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		String sql = SQL_SELECT_BASE + " where CHR_CLIECODIGO = ?";
		try {
			cn = AccesoDB.getConnection();
			pstm = cn.prepareStatement(sql);
			pstm.setString(1, codigo);
			rs = pstm.executeQuery();
			if (rs.next()) {
				model = mapRow(rs);
			}
			rs.close();
			pstm.close();
			if (model == null) {
				throw new SQLException("Error, datos incorrectos.");
			}
		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage());
		} catch (Exception e) {
			throw new RuntimeException("Error en el proceso, intentelo mas tarde.");
		} finally {
			try {
				cn.close();
			} catch (Exception e) {
			}
		}
		return model;
	}

	@Override
	public List<ClienteModel> readAll() {
		List<ClienteModel> lista = null;
		Connection cn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		String sql = SQL_SELECT_BASE;
		try {
			cn = AccesoDB.getConnection();
			pstm = cn.prepareStatement(sql);
			rs = pstm.executeQuery();
			lista = new ArrayList<>();
			while (rs.next()) {
				ClienteModel model = mapRow(rs);
				lista.add(model);
			}
			rs.close();
			pstm.close();
		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage());
		} catch (Exception e) {
			throw new RuntimeException("Error en el proceso, intentelo mas tarde.");
		} finally {
			try {
				cn.close();
			} catch (Exception e) {
			}
		}
		return lista;
	}

	/*
	 * Datos de consulta: codigo, paterno, materno, nombre
	*/
	@Override
	public List<ClienteModel> readAll(ClienteModel model) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public void insert(ClienteModel model) {
		Connection cn = null;
		try {
			// Variables
			String sql, codigo;
			ResultSet rs;
			PreparedStatement pstm;
			Statement stm;
			int cont, longitud;
			// Inicio de tx
			cn = AccesoDB.getConnection();
			cn.setAutoCommit(false); // Inicia la Tx
			// Obtener contador de sucursal
			sql = "select int_contitem, int_contlongitud from contador "
							+ "where vch_conttabla = 'Cliente' for update";
			stm = cn.createStatement();
			rs = stm.executeQuery(sql);
			rs.next();
			cont = rs.getInt("int_contitem") + 1;
			longitud = rs.getInt("int_contlongitud");
			rs.close();
			// Crear codigo
			String formato = "";
			for (int i = 1; i <= longitud; i++) {
				formato += "0";
			}
			DecimalFormat df = new DecimalFormat(formato);
			codigo = df.format(cont);
			// Insertar cliente
			sql = "insert into cliente(chr_cliecodigo,vch_cliepaterno,vch_cliematerno,"
							+ "vch_clienombre,chr_cliedni,vch_clieciudad,vch_cliedireccion,"
							+ "vch_clietelefono,vch_clieemail) values(?,?,?,?,?,?,?,?,?)";
			pstm = cn.prepareStatement(sql);
			pstm.setString(1, codigo);
			pstm.setString(2, model.getPaterno());
			pstm.setString(3, model.getMaterno());
			pstm.setString(4, model.getNombre());
			pstm.setString(5, model.getDni());
			pstm.setString(6, model.getCiudad());
			pstm.setString(7, model.getDireccion());
			pstm.setString(8, model.getTelefono());
			pstm.setString(9, model.getEmail());
			pstm.executeUpdate();
			pstm.close();
			// Actualizar contador
			sql = "update contador set int_contitem = int_contitem + 1 "
							+ "where vch_conttabla='Cliente'";
			stm.executeUpdate(sql);
			stm.close();
			cn.commit(); // Confirma Tx
			model.setCodigo(codigo);
		} catch (SQLException e) {
			try {
				cn.rollback();
			} catch (Exception e1) {
			}
			throw new RuntimeException(e.getMessage()); // Propaga el error a la siguiente capa.
		} catch (Exception e) {
			try {
				cn.rollback();
			} catch (Exception e1) {
			}
			throw new RuntimeException("Error en proceso de creación de cuenta."); // Propaga el error a la siguiente capa.
		} finally {
			try {
				cn.close();
			} catch (Exception e) {
			}
		}
	}

	@Override
	public void update(ClienteModel model) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public void delete(String codigo) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public ClienteModel mapRow(ResultSet rs) throws SQLException {
		ClienteModel model = new ClienteModel();
		model.setCodigo(rs.getString("codigo"));
		model.setPaterno(rs.getString("paterno"));
		model.setMaterno(rs.getString("materno"));
		model.setNombre(rs.getString("nombre"));
		model.setDni(rs.getString("dni"));
		model.setCiudad(rs.getString("ciudad"));
		model.setDireccion(rs.getString("direccion"));
		model.setTelefono(rs.getString("telefono"));
		model.setEmail(rs.getString("email"));
		return model;
	}

}
