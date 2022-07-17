package com.igh.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.igh.app.domain.Cliente;
import com.igh.app.repository.ClienteRepository;
import com.igh.app.repository.ContadorRepository;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;

	@Autowired
	private ContadorRepository contadorRepository;

	public List<Cliente> traerTodos() {
		return (List<Cliente>) clienteRepository.findAll();
	}

}
