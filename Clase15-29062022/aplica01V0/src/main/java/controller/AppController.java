package controller;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import service.AppService;

@WebServlet({ "/PromedioController", "/FactorialController", "/McdMcm" })
public class AppController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String path = request.getServletPath();
		switch (path) {
		case "/FactorialController":
			factorialController(request, response);
			break;
		case "/PromedioController":
			promedioController(request, response);
			break;
		}
	}

	private void promedioController(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// variables
		int num1, num2, num3, prom;
		// Datos
		num1 = Integer.parseInt(request.getParameter("num1"));
		num2 = Integer.parseInt(request.getParameter("num2"));
		num3 = Integer.parseInt(request.getParameter("num3"));
		// Proceso
		AppService service = new AppService();
		prom = service.promediar(num1, num2, num3);
		// Reporte
		request.setAttribute("num1", num1);
		request.setAttribute("num2", num2);
		request.setAttribute("num3", num3);
		request.setAttribute("prom", prom);
		RequestDispatcher rd = request.getRequestDispatcher("promedio.jsp");
		rd.forward(request, response);
	}

	private void factorialController(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
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
