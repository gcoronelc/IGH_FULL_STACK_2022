package com.igh.eurekaapp.pruebas;

import com.igh.eurekaapp.model.ClienteModel;
import com.igh.eurekaapp.service.CrudClienteService;
import com.igh.eurekaapp.util.Mensaje;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware
 * @cursos gcoronelc.github.io
 */
public class Prueba05 {
	
	public static void main(String[] args) {
		
		try {
			// Variables
			ClienteModel cliente;
			CrudClienteService service = new CrudClienteService();
			// Datos
			cliente = new ClienteModel(null, "Algo", "Otra cosa", "Juan", "45348734", "Lima", "Mi Casa", "555555555", "algo@gmail.com");
			service.insert(cliente);;
			// Reporte
			Mensaje.info(null, "Codigo: " + cliente.getCodigo());
		} catch (Exception e) {
			Mensaje.error(null, e.getMessage());
		}
				
		
	}

}
