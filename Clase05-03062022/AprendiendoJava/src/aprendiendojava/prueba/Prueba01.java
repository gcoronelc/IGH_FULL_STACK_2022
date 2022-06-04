package aprendiendojava.prueba;

import aprendiendojava.service.DemoService;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware
 * @cursos gcoronelc.github.io
 */
public class Prueba01 {
	
	public static void main(String[] args) {
		DemoService service = new DemoService();
		//service.procesarAlgo("Gana PERU", null, null);
		//service.procesarAlgo(null, 234.56, null);
		service.procesarAlgo(null, null, 567);
	}

}
