package aprendiendojava.prueba;

import aprendiendojava.service.Clase2;
import aprendiendojava.service.Clase4;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware
 * @cursos gcoronelc.github.io
 */
public class Prueba06 {

	public static void main(String[] args) {
		
		Clase2 objX = new Clase2();
		
		Clase4 objY = (Clase4) objX; // DownCasting, en este caso hay un error.
		
	}
	
	
}
