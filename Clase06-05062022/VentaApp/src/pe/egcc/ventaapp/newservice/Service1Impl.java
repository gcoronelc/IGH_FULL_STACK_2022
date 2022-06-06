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
public class Service1Impl implements Service3Spec {

	@Override
	public void operacion1() {
		System.out.println("Operacion 1 ejecutada");
	}

	@Override
	public void operacion2() {
		System.out.println("Operacion 2 ejecutada");
	}

	@Override
	public void operacion3() {
		System.out.println("Operacion 3 ejecutada");
	}

}
