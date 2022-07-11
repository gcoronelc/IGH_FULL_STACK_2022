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
		// listarTodos();
		// buscarPorId();
		// grabarNuevo();
		// eliminarEmpleado(2001L);
		buscarEmpleados("LA", 2);
	}

	
	private void listarTodos() {
		List<Empleado> lista = empleadoService.listarTodos();
		for (Empleado bean : lista) {
			System.out.println(bean.getNombre() + " - " + bean.getApellido());
		}
	}
	
	private void buscarPorId() {
		Empleado bean = empleadoService.buscarPorId(1002L);
		System.out.println("Nombre: " + bean.getNombre());
		System.out.println("Apellido: " + bean.getApellido());
	}
	
	private void grabarNuevo() {
		Empleado bean = new Empleado();
		bean.setId(null);
		bean.setNombre("GUSTAVO");
		bean.setApellido("CORONEL");
		bean.setTelefono("999666555");
		bean.setEmail("gustavo@alfa.com");
		empleadoService.grabar(bean);
		System.out.println("Id del empleado: " + bean.getId());
	}
	
	private void eliminarEmpleado(Long id) {
		empleadoService.eliminar(id);
		System.out.println("Empleado eliminado.");
	}
	
	private void buscarEmpleados(String nombre, int caso) {
		List<Empleado> lista = empleadoService.buscarPorNombre(nombre, caso);
		for (Empleado bean : lista) {
			System.out.println(bean.getNombre() + " - " + bean.getApellido());
		}
	}
}
