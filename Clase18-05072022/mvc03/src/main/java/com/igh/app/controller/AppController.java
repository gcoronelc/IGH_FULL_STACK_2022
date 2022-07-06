package com.igh.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.igh.app.model.MateModel;
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

		model.addAttribute("op", 1);

		return "index";
	}

	@GetMapping("/calculadora")
	public String calcular(Model model) {
		MateModel mate = new MateModel(0, 0);
		model.addAttribute("titulo", "CALCULADORA BASICA");
		model.addAttribute("mate", mate);
		return "calculadora";
	}

	@PostMapping("/procesar")
	public String procesar(@ModelAttribute MateModel mate, Model model) {
		// Proceso
		mate.setSuma(mate.getNum1() + mate.getNum2());
		mate.setProducto(mate.getNum1() * mate.getNum2());
		// Reporte
		model.addAttribute("titulo", "CALCULADORA BASICA");
		model.addAttribute("resultado", "LOS RESULTADOS");
		model.addAttribute("mate", mate);
		return "calculadora";
	}
	
	@GetMapping("/demoPlantilla")
	public String demoPlantilla(Model model) {
		return "demo_plantilla";
	}

}
