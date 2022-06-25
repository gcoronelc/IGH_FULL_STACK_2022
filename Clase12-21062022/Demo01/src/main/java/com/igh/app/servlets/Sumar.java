package com.igh.app.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Sumar")
public class Sumar extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Variables
		int num1, num2, suma;
		// Datos
		num1 = Integer.parseInt(request.getParameter("num1"));
		num2 = Integer.parseInt(request.getParameter("num2"));
		// Proceso
		suma = num1 + num2;
		// Reporte
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.println("<HTML><HEAD><TITLE>Leyendo parámetros</TITLE></HEAD>");
		pw.println("<BODY");
		pw.println("<H1>SUMA</H1>");
		pw.println("<p>Número 1: " + num1 + "</p>");
		pw.println("<p>Número 2: " + num2 + "</p>");
		pw.println("<p>Suma: " + suma + "</p>");
		pw.println("<p><a href='suma.html'>Otra suma</a></p>");
		pw.println("</BODY></HTML>");
		pw.close();
	}

}
