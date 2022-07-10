package com.igh.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.igh.app.domain.Empleado;
import com.igh.app.repository.EmpleadoRepository;
import com.igh.app.service.EmpleadoService;

@Service
public class EmpleadoServiceImpl implements EmpleadoService{
	
	@Autowired
	private EmpleadoRepository empleadoRepository;

	@Override
	public List<Empleado> listarTodos() {
		return (List<Empleado>) empleadoRepository.findAll();
	}

	@Override
	public Empleado buscarPorId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Empleado grabar(Empleado empleado) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminar(Long id) {
		// TODO Auto-generated method stub
		
	}

}
