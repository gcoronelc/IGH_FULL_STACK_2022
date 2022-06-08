package aprendiendojava.ejemplos;

import java.io.FileNotFoundException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware
 * @cursos gcoronelc.github.io
 */
public class Ejemplo05 {

	public static void main(String[] args) {

		try {
			Random rnd = new Random();
			int a, b, c;
			a = rnd.nextInt(50) + 1;
			b = rnd.nextInt(3);
			generaError();
			c = a / b;
			System.out.println("b = " + b);
		} catch (FileNotFoundException ex) {
			Logger.getLogger(Ejemplo05.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

	
	static void generaError() throws FileNotFoundException{
		throw new FileNotFoundException();
	}
}
