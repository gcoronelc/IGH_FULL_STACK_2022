package com.igh.app.repository;

import org.springframework.data.repository.CrudRepository;

import com.igh.app.domain.Contador;

public interface ContadorRepository extends CrudRepository<Contador, String>{

}
