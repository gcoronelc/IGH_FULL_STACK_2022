package com.igh.eurekaapp.service;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware
 * @cursos gcoronelc.github.io
 */
public class ToolBox {

	private ToolBox() {
	}
	/**
	 * Evalua un dato y se le añade el simbolo % para consultar a la BD
	 * @param dato Valor que se debe analizar.
	 * @return Retorn el dato nulo o con el simbolo %.
	 */
	public static String llenarPorcentaje(String dato){
		if(dato==null){
			return dato;
		}
		dato = '%' + dato.trim() + "%";
		return dato;
	}

}
