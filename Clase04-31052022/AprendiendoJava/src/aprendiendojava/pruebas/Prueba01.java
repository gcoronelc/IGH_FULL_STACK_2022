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
public class Prueba01 {

	public static void main(String[] args) {
		//ProductoModel model = new ProductoModel();
		ProductoModel model = new ProductoModel(4356,"Algo",456.78,true);

		System.out.println("ID: " + model.getId());
		System.out.println("NOMBRE: " + model.getNombre());
		System.out.println("PRECIO: " + model.getPrecio());
		System.out.println("ACTIVO: " + model.isActivo());
	}

}
