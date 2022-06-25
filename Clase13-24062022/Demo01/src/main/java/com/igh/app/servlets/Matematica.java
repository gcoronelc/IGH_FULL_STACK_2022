package com.igh.app.servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet({ "/Sumar2", "/McmMcd" })
public class Matematica extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String path = request.getServletPath();
		switch (path) {
		case "/Sumar2":
			sumar(request, response);
			break;
		case "/McmMcd":
			mcmMcd(request, response);
			break;
		}
	}

	private void mcmMcd(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		// Variables
		int num1, num2, mcm, mcd;
		// Datos
		num1 = Integer.parseInt(request.getParameter("num1"));
		num2 = Integer.parseInt(request.getParameter("num2"));
		// Proceso
		int num1a, num2a;
		num1a = num1;
		num2a = num2;
		while (num1a != num2a) {
			if (num1a > num2a) {
				num1a -= num2a;
			} else {
				num2a -= num1a;
			}
		}
		mcd = num1a;
		mcm = num1 * num2 / mcd;
		// Reporte
		request.setAttribute("mcm", mcm);
		request.setAttribute("mcd", mcd);
		RequestDispatcher rd = request.getRequestDispatcher("mcm_mcd2.jsp");
		rd.forward(request, response);
		
		/*
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.println("<HTML><HEAD><TITLE>Leyendo parámetros</TITLE></HEAD>");
		pw.println("<BODY");
		pw.println("<H1>MCD y MCM</H1>");
		pw.println("<p>Número 1: " + num1 + "</p>");
		pw.println("<p>Número 2: " + num2 + "</p>");
		pw.println("<p>MCD: " + mcd + "</p>");
		pw.println("<p>MCM: " + mcm + "</p>");
		pw.println("<p><a href='mcm_mcd.html'>Otra operación</a></p>");
		pw.println("</BODY></HTML>");
		pw.close();
		*/
	}

	private void sumar(HttpServletRequest request, HttpServletResponse response) throws IOException {
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
