package aprendiendojava.prueba;

import pe.edutec.app.lib.MateService;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware
 * @cursos gcoronelc.github.io
 */
public class Prueba04 {

	public static void main(String[] args) {
		MateService service = new MateService();
		
		System.out.println("Promedio: " + service.promediar(15, 12, 14,18));
	}
}
