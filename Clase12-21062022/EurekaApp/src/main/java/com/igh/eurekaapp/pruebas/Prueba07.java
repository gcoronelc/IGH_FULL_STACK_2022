package com.igh.eurekaapp.pruebas;

import com.igh.eurekaapp.model.ClienteModel;
import com.igh.eurekaapp.service.CrudClienteService;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware
 * @cursos gcoronelc.github.io
 */
public class Prueba07 {

	public static void main(String[] args) {
		try {
			// Datos
			String codigo = "00003";
			// Proceso
			CrudClienteService clienteService = new CrudClienteService();
			ClienteModel model = clienteService.read(codigo);
			System.out.println("Hola " + model.getNombre());
			model.setNombre("Julio");
			clienteService.update(model);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
	}
	
}
