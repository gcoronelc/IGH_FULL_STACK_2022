package com.igh.app.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.igh.app.dto.DatosDto;

@RestController
@RequestMapping("/api/v1/app")
public class AppController {


	@GetMapping
	public String saludo() {
		return "Hola, este es un saludo por defecto";
	}
	
	
	@GetMapping("/saludo")
	public String saludo2() {
		return "Hola, estoy trabajando en la construcción de una API.";
	}
	
	
	@GetMapping("/saludo/{nombre}")
	public String saludo2( @PathVariable(name="nombre") String nombre) {
		return "Hola " + nombre + ", estoy trabajando en la construcción de una API.";
	}
	
	@PostMapping("/sumar")
	public String sumar(@RequestParam Integer num1, @RequestParam Integer num2) {
		int suma = num1 + num2;
		String respuesta = num1 + " + " + num2 + " =  " + suma; 
		return respuesta;
	}
	
	@CrossOrigin(origins = "http://127.0.0.1:5500")
	@PostMapping("/sumar2")
	public String sumar2(@RequestBody DatosDto datos) {
		int suma = datos.getNum1() + datos.getNum2();
		String respuesta = datos.getNum1() + " + " + datos.getNum2() + " =  " + suma; 
		return respuesta;
	}
	
}
