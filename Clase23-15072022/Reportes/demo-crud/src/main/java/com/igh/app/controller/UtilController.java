package com.igh.app.controller;

import java.io.IOException;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

final class UtilController {

	private UtilController() {
	}

	static void enviarPDF(HttpServletResponse response, byte[] bytes) throws IOException {
		response.setContentType("application/pdf");
		response.setContentLength(bytes.length);
		ServletOutputStream out = response.getOutputStream();
		out.write(bytes, 0, bytes.length);
		out.flush();
		out.close();
	}

	static void descargarPDF(HttpServletResponse response, byte[] bytes, String nombre) throws IOException {
		response.setContentType("application/x-download");
		response.setHeader("Content-Disposition", "attachment; filename=\"" + nombre + "\"");
		response.setContentLength(bytes.length);
		ServletOutputStream out = response.getOutputStream();
		out.write(bytes, 0, bytes.length);
		out.flush();
		out.close();
	}

}
