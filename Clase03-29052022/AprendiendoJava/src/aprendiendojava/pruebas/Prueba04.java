package aprendiendojava.pruebas;

import aprendiendojava.model.MonedaModel;
import aprendiendojava.service.MonedaService;

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
		MonedaService service = new MonedaService();
		MonedaModel lista[] =service.convertir(1259);
		for (MonedaModel obj : lista) {
			if(obj.getCantidad() != 0){
				System.out.println(obj);
			}
		}
	}

}
