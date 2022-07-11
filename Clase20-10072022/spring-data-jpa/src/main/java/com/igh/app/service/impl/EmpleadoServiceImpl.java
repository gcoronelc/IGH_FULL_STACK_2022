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
		return empleadoRepository.findById(id).orElse(null);
	}

	@Override
	public Empleado grabar(Empleado empleado) {
		return empleadoRepository.save(empleado);
	}

	@Override
	public void eliminar(Long id) {
		empleadoRepository.deleteById(id);
	}

	@Override
	public List<Empleado> buscarPorNombre(String nombre, int caso) {
		List<Empleado> lista;
		if(caso==1) {
			lista = empleadoRepository.findByNombreLike(nombre);
		} else {
			lista = empleadoRepository.findByNombreContaining(nombre);
		}
		return lista;
	}

}
