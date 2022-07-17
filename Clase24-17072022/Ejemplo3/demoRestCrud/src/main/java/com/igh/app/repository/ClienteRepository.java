package com.igh.app.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.igh.app.domain.Cliente;

public interface ClienteRepository  extends CrudRepository<Cliente, String>{

	List<Cliente> findByPaternoContainingIgnoreCase(String paterno);
	
}
