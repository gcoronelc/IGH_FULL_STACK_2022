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
public class Prueba07 {

	public static void main(String[] args) {
		
		Object objX = new Clase2();
		
		Clase2 objY =  (Clase2) objX; // DownCasting, este ejemplo no da errores.
		
		System.out.println("8 - 4 = " + objY.restar(8, 4));
	}
	
	
}
