package com.igh.aplica01.controller;

import java.io.IOException;

import com.igh.aplica01.service.AppService;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet( urlPatterns =  {"/Promedio","/FactorialController","/McdMcm"})
public class AppController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
       
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String path = request.getServletPath();
		switch(path) {
		case "/FactorialController":
			factorialController(request, response);
			break;
		}
	}


	private void factorialController(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Variables
		int numero;
		long factorial;
		// Datos
		numero = Integer.parseInt(request.getParameter("numero"));
		// Proceso
		AppService service = new AppService();
		factorial = service.factorial(numero);
		// Reporte
		request.setAttribute("numero", numero);
		request.setAttribute("factorial", factorial);
		RequestDispatcher rd = request.getRequestDispatcher("factorial.jsp");
		rd.forward(request, response);
	}

}
