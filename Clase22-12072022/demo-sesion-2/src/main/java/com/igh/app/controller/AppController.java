package com.igh.app.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes({ "listado" })
public class AppController {

	@ModelAttribute("listado")
	public List<String> getListado() {
		List<String> lista = new ArrayList<>();
		return lista;
	}

	@GetMapping({ "/", "/home" })
	public String home(@ModelAttribute("listado") List<String> listado) {
		listado.add("Gustavo Coronel");
		listado.add("César Bustamante");
		listado.add("Sergio Matsukawa");
		return "home";
	}
	

	@PostMapping("/grabar")
	public String grabar(String nombre, @ModelAttribute("listado") List<String> listado) {
		listado.add(nombre);
		return "home";
	}
	
}
