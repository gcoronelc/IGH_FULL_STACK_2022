package com.igh.eurekaapp.controller;

import com.igh.eurekaapp.model.ClienteModel;
import com.igh.eurekaapp.model.EmpleadoModel;
import com.igh.eurekaapp.service.CrudClienteService;
import com.igh.eurekaapp.service.CrudServiceSpec;
import com.igh.eurekaapp.util.Eureka;
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

	public void procesar(String estado, ClienteModel bean) {
		switch(estado){
      case Eureka.CRUD_NUEVO:
        crudService.insert(bean);
        break;
      case Eureka.CRUD_EDITAR:
        crudService.update(bean);
        break;
      case Eureka.CRUD_ELIMINAR:
        crudService.delete(bean.getCodigo());
        break;        
    }
	}
}
