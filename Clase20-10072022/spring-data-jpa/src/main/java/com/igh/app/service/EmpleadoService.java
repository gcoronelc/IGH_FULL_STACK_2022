package com.igh.app.service;

import java.util.List;

import com.igh.app.domain.Empleado;

public interface EmpleadoService {

	List<Empleado> listarTodos();
	
	Empleado buscarPorId(Long id);
	
	Empleado grabar(Empleado empleado);
	
	void eliminar(Long id);
	
}
