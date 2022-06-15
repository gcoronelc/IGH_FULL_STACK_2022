package com.igh.eurekaapp.pruebas;

import com.igh.eurekaapp.model.EmpleadoModel;
import com.igh.eurekaapp.service.LogonService;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware
 * @cursos gcoronelc.github.io
 */
public class Prueba02 {

	public static void main(String[] args) {
		try {
			// Datos
			String usuario = "aramos";
			String clave = "china";
			// Proceso
			LogonService logonService = new LogonService();
			EmpleadoModel model = logonService.validarUsuario(usuario, clave);
			// Reporte
			System.out.println("Hola " + model.getNombre());
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
	}
	
}
