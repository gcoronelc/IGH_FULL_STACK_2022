package com.igh.app.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.igh.app.bean.EmpleadoModel;

@Controller
public class AppController {


	@GetMapping({ "/"})
	public String home(@ModelAttribute("empleado") EmpleadoModel empleado) {
		return "home";
	}

	
	@PostMapping({ "/verificar" })
	public String verificar(@Valid @ModelAttribute("empleado") EmpleadoModel empleado, BindingResult bindingResult) {
		
		if(bindingResult.hasErrors()) {
			return "home";
		}
		
		return "resultado";
	}

}
