package aprendiendojava.pruebas;

import java.util.Arrays;
import java.util.List;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware
 * @cursos gcoronelc.github.io
 */
public class Prueba02 {

	public static void main(String[] args) {
		
		String[] nombres = new String[5];
		int[] edades = new int[5];
		
		for (int i = 0; i < nombres.length; i++) {
			String n = nombres[i];
			int e = edades[i];
			System.out.println(n + "\t" + e);
		}

		List<String> listaNombres = Arrays.asList(nombres);
		for (String nombre : listaNombres) {
			System.out.println(nombre);
		}
		
	}

}
