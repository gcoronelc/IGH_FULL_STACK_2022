package com.igh.aplica01.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.igh.aplica01.service.AppService;

@WebServlet({"/Promedio","/FactorialController","/McdMcm"})
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
