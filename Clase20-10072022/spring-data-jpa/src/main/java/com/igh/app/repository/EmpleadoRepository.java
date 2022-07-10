package com.igh.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.igh.app.domain.Empleado;

@Repository
public interface EmpleadoRepository extends CrudRepository<Empleado, Long>{

}
