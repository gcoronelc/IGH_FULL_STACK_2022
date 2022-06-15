package com.igh.eurekaapp.controller;

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
public class LogonController {

	public void validarUsuario(String usuario, String clave){
		LogonService logonService = new LogonService();
		logonService.validarUsuario(usuario, clave);
	}
}
