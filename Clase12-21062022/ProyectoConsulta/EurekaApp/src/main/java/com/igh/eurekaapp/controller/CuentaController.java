package com.igh.eurekaapp.controller;

import com.igh.eurekaapp.dto.EmpleadoDto;
import com.igh.eurekaapp.service.CuentaService;
import com.igh.eurekaapp.service.impl.CuentaServiceImpl;
import com.igh.eurekaapp.util.Session;
import java.util.List;
import java.util.Map;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware
 * @cursos gcoronelc.github.io
 */
public class CuentaController {
	
	private CuentaService cuentaService;

	public CuentaController() {
		cuentaService = new CuentaServiceImpl();
	}
	
	public void procRetiro(String cuenta, Double importe, String clave) {
		EmpleadoDto dto = (EmpleadoDto) Session.get("USUARIO");
		cuentaService.procRetiro(cuenta, importe, clave, dto.getCodigo());
	}

	public void procDeposito(String cuenta, Double importe) {
		EmpleadoDto dto = (EmpleadoDto) Session.get("USUARIO");
		cuentaService.procDeposito(cuenta, importe, dto.getCodigo());
	}
	
	public List<Map<String,?>> conMovimientos(String cuenta){
		return cuentaService.conMovimientos(cuenta);
	}

}
