package pe.egcc.ventaapp.prueba;

import pe.egcc.ventaapp.newservice.Service2Impl;
import pe.egcc.ventaapp.newservice.spec.Service3Spec;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware
 * @cursos gcoronelc.github.io
 */
public class Prueba05 {

	public static void main(String[] args) {
		Service3Spec obj = new Service2Impl();
		obj.operacion1();
		obj.operacion2();
		obj.operacion3();
	}
}
