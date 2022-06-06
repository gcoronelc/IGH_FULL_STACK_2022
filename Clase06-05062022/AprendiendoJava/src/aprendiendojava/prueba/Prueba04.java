package aprendiendojava.prueba;

import aprendiendojava.service.Clase1;
import aprendiendojava.service.Clase2;

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
		
		Clase1 objA = new Clase1("Gustavo");
		
		Clase2 objB;
		if(! (objA instanceof Clase2)){
			System.err.println("No es posible");
			return;
		}
		objB = (Clase2) objA;
		System.out.println("Si es posible");
		
	}

}
