package aprendiendojava.service;

import aprendiendojava.model.MonedaModel;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware
 * @cursos gcoronelc.github.io
 */
public class MonedaService {
	
	public MonedaModel[] convertir(int importe){
		// Preparar datos
		MonedaModel[] lista = {
			new MonedaModel("Billetes de 200 Soles", 200, 0),
			new MonedaModel("Billetes de 100 Soles", 100, 0),
			new MonedaModel("Billetes de 50 Soles", 50, 0),
			new MonedaModel("Billetes de 20 Soles", 20, 0),
			new MonedaModel("Billetes de 10 Soles", 10, 0),
			new MonedaModel("Monedas de 5 Soles", 5, 0),
			new MonedaModel("Monedas de 2 Soles", 2, 0),
			new MonedaModel("Monedas de 1 Soles", 1, 0),
		};
		// Proceso
		for (int i = 0; i < lista.length; i++) {
			MonedaModel obj = lista[i];
			obj.setCantidad(importe / obj.getValor());
			importe = importe % obj.getValor();
		}
		// Reporte
		return lista;
	}

}
