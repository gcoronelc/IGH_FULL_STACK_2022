package com.igh.app.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		model.addAttribute("mensaje", "Hola GUSTAVO CORONEL.");
		return "home";
	}
	
	
	@RequestMapping(value = "/venta.proceso", method = RequestMethod.GET)
	public void venta(HttpServletRequest request, HttpServletResponse response)
	throws IOException {
	// Datos
	double precio = Double.parseDouble(request.getParameter("precio"));
	int cant = Integer.parseInt(request.getParameter("cant"));
	// Proceso
	double importe = precio * cant;
	// Reporte
	PrintWriter out = response.getWriter();
	response.setContentType("text/html");
	out.println("<h1>VENTA</h1>");
	out.println("<p>Precio: " + precio + "</p>");
	out.println("<p>Cant: " + cant + "</p>");
	out.println("<p>Importe: " + importe + "</p>");
	}

}
