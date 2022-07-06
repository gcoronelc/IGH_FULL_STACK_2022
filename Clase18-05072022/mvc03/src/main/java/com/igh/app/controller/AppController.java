package com.igh.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.igh.app.model.ProductoModel;

@Controller
public class AppController {

	@GetMapping({ "/", "/home", "/index" })
	public String home(Model model) {
		model.addAttribute("titulo", "SALUDO");
		model.addAttribute("mensaje", "Bienvenido a Thymeleaf.");
		model.addAttribute("producto", new ProductoModel("Televisor", 4000.0, 55));
		
		List<ProductoModel> lista = new ArrayList<>();
		lista.add(new ProductoModel("Producto 1", 140, 8));
		lista.add(new ProductoModel("Producto 2", 180, 6));
		lista.add(new ProductoModel("Producto 3", 230, 7));
		model.addAttribute("lista", lista);
		
		return "index";
	}

}
