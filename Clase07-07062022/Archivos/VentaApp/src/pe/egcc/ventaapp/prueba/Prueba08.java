package pe.egcc.ventaapp.prueba;

import pe.egcc.ventaapp.service.ArchivoService;
import pe.egcc.ventaapp.service.VentaService;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class Prueba08 {

	public static void main(String[] args) {
		VentaService ventaService = new VentaService();
		ArchivoService archivoService = new ArchivoService();
		System.out.println("Existe: " + archivoService.existe("VENTAS.TXT"));
		//archivoService.creaArchivoVentas();
		archivoService.cargarVentas();
		System.out.println(ventaService.getVentas());
	}
}
