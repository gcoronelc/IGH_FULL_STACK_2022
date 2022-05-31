package aplicandolambda.prueba;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware
 * @cursos gcoronelc.github.io
 */
public class Prueba {
	
	public static void main(String[] args) {
		
		int[][] datos3 = {{54,65,23},{54,78,},{23,76,34,65},{12,45,67,32}};
		
		// Recorrido tipo indexado
		for (int[] fila : datos3) {
			for (int j = 0; j < fila.length; j++) {
				int dato = fila[j];
				System.out.print("\t" + dato);
			}
			System.out.println("");
		}
		
	}

}
