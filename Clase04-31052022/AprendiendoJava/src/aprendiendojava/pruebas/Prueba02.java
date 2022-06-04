package aprendiendojava.pruebas;

import aprendiendojava.model.ProductoModel;

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
		int i = 15;
		while(true){
			new ProductoModel(i++, "- Producto " + 1, 345.67, true);
		}
	}

}
