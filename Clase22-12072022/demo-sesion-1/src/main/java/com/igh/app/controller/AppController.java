package com.igh.app.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AppController {
	
	@GetMapping({"/","/home"})
	public String home(HttpSession session) {
		if(session.getAttribute("listado") == null) {
			List<String> listado = new ArrayList<>();
			listado.add("Gustavo Coronel");
			listado.add("César Bustamante");
			listado.add("Sergio Matsukawa");
			session.setAttribute("listado", listado);
		}
		return "home";
	}
	
	@PostMapping("/grabar")
	public String grabar(String nombre, HttpSession session) {
		List<String> listado = (List<String>) session.getAttribute("listado");
		listado.add(nombre);		
		return "home";
	}
	
	@GetMapping("/resetear")
	public String resetear(HttpSession session) {
		session.invalidate();
		return "redirect:/home";
	}
	
	
	@GetMapping("/eliminar1/{nombre}")
	public String eliminar1(@PathVariable("nombre") String nombre, HttpSession session) {
		List<String> listado = (List<String>) session.getAttribute("listado");
		listado.remove(nombre);
		return "home";
	}
	
	@GetMapping("/eliminar2/{indice}")
	public String eliminar2(@PathVariable("indice") Integer indice, HttpSession session) {
		List<String> listado = (List<String>) session.getAttribute("listado");
		listado.remove(indice.intValue());
		return "home";
	}
}
