package com.igh.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.igh.app.domain.Empleado;
import com.igh.app.service.EmpleadoService;

@SpringBootApplication
public class SpringDataJpaApplication implements CommandLineRunner{

	@Autowired
	private EmpleadoService empleadoService;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		listarTodos();
	}

	
	private void listarTodos() {
		List<Empleado> lista = empleadoService.listarTodos();
		for (Empleado bean : lista) {
			System.out.println(bean.getNombre() + " - " + bean.getApellido());
		}
	}
}
