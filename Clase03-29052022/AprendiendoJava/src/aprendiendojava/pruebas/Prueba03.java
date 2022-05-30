package aprendiendojava.pruebas;

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
		
		int[][] datos1;
		int[][] datos2 = new int[4][5];
		int[][] datos3 = {{54,65,23},{54,78,},{23,76,34,65},{12,45,67,32}};
		
		datos1 = new int[][]{{54,65,23},{54,78,},{23,76,34,65},{12,45,67,32}};
		
		// Recorrido tipo indexado
		for (int i = 0; i < datos3.length; i++) {
			int[] fila = datos3[i];
			for (int j = 0; j < fila.length; j++) {
				int dato = fila[j];
				System.out.print("\t" + dato);
			}
			System.out.println("");
		}
		
		// Recorrido tipo colección
		System.out.println("---------------------------------------");
		for (int[] fila : datos3) {
			for (int dato : fila) {
				System.out.print("\t" + dato);
			}
			System.out.println("");
		}
		
	}
	
	
}
