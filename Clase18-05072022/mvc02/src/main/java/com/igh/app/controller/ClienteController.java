package com.igh.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/clientes")
public class ClienteController {
	
	@RequestMapping(value = "/listado", method = RequestMethod.GET)
	public String listado(Model model) {
		model.addAttribute("titulo", "LISTADO DE CLIENTES");
		return "listado";
	}

}
