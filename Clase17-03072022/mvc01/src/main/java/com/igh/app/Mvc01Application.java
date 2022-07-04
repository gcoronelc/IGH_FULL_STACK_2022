package com.igh.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Mvc01Application {

	@Autowired
	private Environment environment;	
	
	@Value("${app.saludo}")
	private String mensaje;
	
	@Value("#{'${lista.correos}'.split(',')}")
	private List<String> correos;
	
	public static void main(String[] args) {
		SpringApplication.run(Mvc01Application.class, args);
	}

	
	@RequestMapping("/saludo")
	public String saludo() {
		return environment.getProperty("app.saludo");
	}
	
	@RequestMapping("/ruta")
	public String ruta() {
		return environment.getProperty("path");
	}
	
	
	@RequestMapping("/mensaje")
	public String mensaje() {
		return mensaje;
	}

	@RequestMapping("/correos")
	public String correos() {
		String texto = "";
		for (String correo : correos) {
			texto += correo + "<br/>";
		}
		return texto;
	}
	
}
