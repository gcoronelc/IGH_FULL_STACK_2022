package com.igh.eurekaapp.pruebas;

import com.igh.eurekaapp.model.ClienteModel;
import com.igh.eurekaapp.service.CrudClienteService;
import java.util.List;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware
 * @cursos gcoronelc.github.io
 */
public class Prueba04 {

	public static void main(String[] args) {
		try {
			// Proceso
			CrudClienteService clienteService = new CrudClienteService();
			List<ClienteModel> lista = clienteService.readAll();
			// Reporte
			for (ClienteModel model : lista) {
				System.out.println("Hola " + model.getNombre());
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
	}
	
}
