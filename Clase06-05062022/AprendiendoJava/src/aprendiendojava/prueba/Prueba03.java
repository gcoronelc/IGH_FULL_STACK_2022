package aprendiendojava.prueba;

import aprendiendojava.service.AbstrcatMateService;
import aprendiendojava.service.MateService;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware
 * @cursos gcoronelc.github.io
 */
public class Prueba03 {
	
	public static void main(String[] args) {
		AbstrcatMateService service = new MateService();
		System.out.println("7 + 5 = " + service.sumar(7, 5));
	}

}
