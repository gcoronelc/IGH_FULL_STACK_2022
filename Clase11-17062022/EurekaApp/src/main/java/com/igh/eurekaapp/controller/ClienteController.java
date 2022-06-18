package com.igh.eurekaapp.controller;

import com.igh.eurekaapp.model.ClienteModel;
import com.igh.eurekaapp.model.EmpleadoModel;
import com.igh.eurekaapp.service.CrudClienteService;
import com.igh.eurekaapp.service.CrudServiceSpec;
import java.util.List;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware
 * @cursos gcoronelc.github.io
 */
public class ClienteController {
	
	private CrudServiceSpec<ClienteModel> crudService;

	public ClienteController() {
		crudService = new CrudClienteService();
	}
	
	public List<ClienteModel> readAll(ClienteModel model) {
		return crudService.readAll(model);
	}
}
