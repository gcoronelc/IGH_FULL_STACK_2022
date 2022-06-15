package com.igh.eurekaapp.service;

import com.igh.eurekaapp.db.AccesoDB;
import com.igh.eurekaapp.model.EmpleadoModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware
 * @cursos gcoronelc.github.io
 */
public class LogonService {

	public EmpleadoModel validarUsuario(String usuario, String clave) {
		EmpleadoModel model = null;
		Connection cn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		String sql = "select chr_emplcodigo, vch_emplpaterno, vch_emplmaterno, "
				  + "vch_emplnombre, vch_emplciudad, vch_empldireccion, "
				  + "vch_emplusuario, '*******' vch_emplclave "
				  + "from empleado "
				  + "where vch_emplusuario=? and vch_emplclave=?";
		try {
			cn = AccesoDB.getConnection();
			pstm = cn.prepareStatement(sql);
			pstm.setString(1, usuario);
			pstm.setString(2, clave);
			rs = pstm.executeQuery();
			if(rs.next()){
				model = new EmpleadoModel();
				model.setCodigo(rs.getString("chr_emplcodigo"));
				model.setPaterno(rs.getString("vch_emplpaterno"));
				model.setMaterno(rs.getString("vch_emplmaterno"));
				model.setNombre(rs.getString("vch_emplnombre"));
				model.setCiudad(rs.getString("vch_emplciudad"));
				model.setDireccion(rs.getString("vch_empldireccion"));
				model.setUsuario(rs.getString("vch_emplusuario"));
				model.setClave(rs.getString("vch_emplclave"));
			}
			rs.close();
			pstm.close();
			if(model == null){
				throw new SQLException("Error, datos incorrectos.");
			}
		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage());
		} catch (Exception e) {
			throw new RuntimeException("Error en el proceso, intentelo mas tarde.");
		}finally {
			try {
				cn.close();
			} catch (Exception e) {
			}
		}
		return model;
	}

}
