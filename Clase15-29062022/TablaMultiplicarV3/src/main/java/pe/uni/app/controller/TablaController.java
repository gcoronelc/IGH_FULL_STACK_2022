package pe.uni.app.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import pe.uni.app.dto.TablaDto;
import pe.uni.app.service.TablaService;


/**
 * Servlet implementation class TablaController
 */
@WebServlet("/TablaController")
public class TablaController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Dato
		int numero = Integer.parseInt(request.getParameter("numero"));
		// Proceso
		TablaService service = new TablaService();
		TablaDto[] tabla = service.procesar(numero);
		// Generar JSON
		Gson gson = new Gson();
		String datos = gson.toJson(tabla);
		// Respuesta
		PrintWriter out = response.getWriter();
		//response.setContentType("application/json");
		response.setContentType("text/plain");
		response.setCharacterEncoding("UTF-8");
		out.print(datos);
		out.flush();
	}

}
