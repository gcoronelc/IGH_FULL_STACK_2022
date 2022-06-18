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
public class Prueba06 {

	public static void main(String[] args) {
		try {
			// Dato
			ClienteModel model = new ClienteModel();
			model.setCodigo(null);
			model.setPaterno("LEN");
			model.setMaterno(null);
			model.setNombre("HU");
			// Proceso
			CrudClienteService clienteService = new CrudClienteService();
			List<ClienteModel> lista = clienteService.readAll(model);
			// Reporte
			for (ClienteModel cliente : lista) {
				System.out.println(cliente.getCodigo() + cliente.getPaterno() + "-" + cliente.getNombre());
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
	}
	
}
