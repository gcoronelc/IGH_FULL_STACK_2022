package aprendiendojava.ejemplos;

import java.util.Random;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware
 * @cursos gcoronelc.github.io
 */
public class Ejemplo04 {
	
	public static void main(String[] args) {
		  
		Random rnd = new Random();
		int a, b, c;
		
		a = rnd.nextInt(50) + 1;
		b = rnd.nextInt(3);
		
		new ArithmeticException("Error chevere.");
		
		c = a /b;
		
		System.out.println("b = " + b);
	}

}
