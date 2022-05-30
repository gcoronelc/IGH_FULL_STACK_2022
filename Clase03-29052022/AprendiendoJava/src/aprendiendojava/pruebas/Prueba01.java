package aprendiendojava.pruebas;

import java.util.Arrays;

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

		int[] notas1;
		int[] notas2 = new int[5];
		int[] notas3 = {42, 23, 45, 87, 18, 45};

		notas1 = new int[5];

		// Recorrido indexado
		for (int i = 0; i < notas3.length; i++) {
			int j = notas3[i];
			System.out.print("\t" + j);
		}
		System.out.println("");

		// Recorrido tipo colección
		for (int nota : notas3) {
			System.out.print("\t" + nota);
		}
		System.out.println("");

		Arrays.sort(notas3);
		
		// Recorrido tipo colección
		for (int nota : notas3) {
			System.out.print("\t" + nota);
		}
		System.out.println("");
		
		int notas4[] = new int[10];
		System.arraycopy(notas3, 1, notas4, 3, 2);
		
		// Recorrido tipo colección
		for (int nota : notas4) {
			System.out.print("\t" + nota);
		}
		System.out.println("");
		
	}

}
