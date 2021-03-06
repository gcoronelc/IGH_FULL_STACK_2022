package com.igh.app.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.igh.app.model.VentaModel;

@Controller
public class HomeController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		model.addAttribute("mensaje", "Hola GUSTAVO CORONEL.");
		return "home";
	}

	@RequestMapping(value = "/venta.proceso", method = RequestMethod.GET)
	public void venta(HttpServletRequest request, HttpServletResponse response) throws IOException {
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
	
	@RequestMapping(value = "/venta.proceso2", method = RequestMethod.GET)
	public String venta2(HttpServletRequest request, Model model) {
		// Datos
		double precio = Double.parseDouble(request.getParameter("precio"));
		int cant = Integer.parseInt(request.getParameter("cant"));
		// Proceso
		double importe = precio * cant;
		// Reporte
		model.addAttribute("precio",precio);
		model.addAttribute("cantidad",cant);
		model.addAttribute("importe", importe);
		return "venta2";
	}
	
	@RequestMapping(value = "/venta.proceso3", method = RequestMethod.GET)
	public ModelAndView venta3(HttpServletRequest request) {
		// La variables principal
		ModelAndView mav = new ModelAndView("venta2");
		// Datos
		double precio = Double.parseDouble(request.getParameter("precio"));
		int cant = Integer.parseInt(request.getParameter("cant"));
		// Proceso
		double importe = precio * cant;
		// Reporte
		mav.addObject("precio",precio);
		mav.addObject("cantidad",cant);
		mav.addObject("importe", importe);
		return mav;
	}
	
	@RequestMapping(value = "/venta.proceso4", method = RequestMethod.GET)
	public ModelAndView venta4(@RequestParam double precio, @RequestParam("cant") int cantidad) {
		// La variables principal
		ModelAndView mav = new ModelAndView("venta2");
		// Proceso
		double importe = precio * cantidad;
		// Reporte
		mav.addObject("precio",precio);
		mav.addObject("cantidad",cantidad);
		mav.addObject("importe", importe);
		return mav;
	}
	
	@RequestMapping(value = "/venta.proceso5", method = RequestMethod.GET)
	public ModelAndView venta5(@RequestParam double precio, @RequestParam(value="cant", required = false) Integer cantidad) {
		// La variables principal
		ModelAndView mav = new ModelAndView("venta2");
		// Proceso
		cantidad = (cantidad==null)?0:cantidad;
		double importe = precio * cantidad;
		// Reporte
		mav.addObject("precio",precio);
		mav.addObject("cantidad",cantidad);
		mav.addObject("importe", importe);
		return mav;
	}
	
	@RequestMapping(value = "/venta.proceso6", method = RequestMethod.GET)
	public ModelAndView venta6(@ModelAttribute VentaModel bean) {
		// La variables principal
		ModelAndView mav = new ModelAndView("venta3");
		// Proceso
		double importe = bean.getPrecio() * bean.getCantidad();
		bean.setImporte(importe);
		// Reporte
		mav.addObject("bean",bean);
		return mav;
	}

}
