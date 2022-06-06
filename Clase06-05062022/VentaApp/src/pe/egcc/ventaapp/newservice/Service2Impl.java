package pe.egcc.ventaapp.newservice;

import pe.egcc.ventaapp.newservice.spec.Service1Spec;
import pe.egcc.ventaapp.newservice.spec.Service2Spec;
import pe.egcc.ventaapp.newservice.spec.Service3Spec;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware
 * @cursos gcoronelc.github.io
 */
public class Service2Impl implements Service3Spec {

	@Override
	public void operacion1() {
		System.out.println("Proceso 1 ejecutado");
	}

	@Override
	public void operacion2() {
		System.out.println("Proceso 1 ejecutado");
	}

	@Override
	public void operacion3() {
		System.out.println("Proceso 1 ejecutado");
	}

}
