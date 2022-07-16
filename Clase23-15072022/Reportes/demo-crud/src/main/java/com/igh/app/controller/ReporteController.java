package com.igh.app.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.igh.app.service.ReporteService;

import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.JasperRunManager;
import net.sf.jasperreports.engine.data.JRMapCollectionDataSource;

@Controller
@RequestMapping("/reportes")
public class ReporteController {

	@Autowired
	private ReporteService reporteService;

	@Autowired
	private ResourceLoader resourceLoader;

	@GetMapping("/pagCategorias")
	public String paginaCategorias() {
		return "reportes/categorias";
	}

	@GetMapping("/pagProductos")
	public String paginaProductos() {
		return "reportes/productos";
	}

	@GetMapping("categorias1")
	public void getCategoriasPDF(HttpServletResponse response) {
		try {
			// Data
			List<Map<String, ?>> lista = reporteService.traerCategorias();
			JRMapCollectionDataSource data = new JRMapCollectionDataSource(lista);
			// Objeto JasperReport
			String reporte = "classpath:reportes/Categorias.jrxml";
			String path = resourceLoader.getResource(reporte).getURI().getPath();
			JasperReport jasperReport = JasperCompileManager.compileReport(path);
			// Ejecutar el reporte
			byte[] bytes = JasperRunManager.runReportToPdf(jasperReport, null, data);
			// Enviar PDF
			UtilController.enviarPDF(response, bytes);
		} catch (Exception e) {
		}
	}

	@GetMapping("categorias2")
	public void getCategoriasPD2F(HttpServletResponse response) {
		try {
			// Data
			List<Map<String, ?>> lista = reporteService.traerCategorias();
			JRMapCollectionDataSource data = new JRMapCollectionDataSource(lista);
			// Objeto JasperReport
			String reporte = "classpath:reportes/Categorias.jrxml";
			String path = resourceLoader.getResource(reporte).getURI().getPath();
			JasperReport jasperReport = JasperCompileManager.compileReport(path);
			// Ejecutar el reporte
			byte[] bytes = JasperRunManager.runReportToPdf(jasperReport, null, data);
			// Enviar PDF
			UtilController.descargarPDF(response, bytes, "CATEGORIAS.PDF");
		} catch (Exception e) {
		}
	}

	@GetMapping("productos1")
	public void productos1(@RequestParam("categoria") Long categoria, HttpServletResponse response) {
		try {
			// Data
			List<Map<String, ?>> lista = reporteService.traerProductos(categoria);
			JRMapCollectionDataSource data = new JRMapCollectionDataSource(lista);
			// Objeto JasperReport
			String reporte = "classpath:reportes/Productos.jrxml";
			String path = resourceLoader.getResource(reporte).getURI().getPath();
			JasperReport jasperReport = JasperCompileManager.compileReport(path);
			// Ejecutar el reporte
			byte[] bytes = JasperRunManager.runReportToPdf(jasperReport, null, data);
			// Enviar PDF
			UtilController.enviarPDF(response, bytes);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@GetMapping("productos2")
	public void productos2(@RequestParam("categoria") Long categoria, HttpServletResponse response) {
		try {
			// Data
			List<Map<String, ?>> lista = reporteService.traerProductos(categoria);
			JRMapCollectionDataSource data = new JRMapCollectionDataSource(lista);
			// Objeto JasperReport
			String reporte = "classpath:reportes/Productos.jrxml";
			String path = resourceLoader.getResource(reporte).getURI().getPath();
			JasperReport jasperReport = JasperCompileManager.compileReport(path);
			// Ejecutar el reporte
			byte[] bytes = JasperRunManager.runReportToPdf(jasperReport, null, data);
			// Enviar PDF
			UtilController.descargarPDF(response, bytes, "productos.pdf");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
