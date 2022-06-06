package aprendiendojava.service;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware
 * @cursos gcoronelc.github.io
 */
public class Clase2 extends Clase1{
	
	protected  String profesor = "Girafales";

	public Clase2() {
		super("Gustavo");
		System.out.println("Hola profesor " + super.profesor);
	}

	@Override
	public int sumar(int n1, int n2) {
		return super.sumar(n1, n2)*(n1-n2);
	}
	
	
	
	public int restar(int n1, int n2){
		return (n1-n2);
	}

}
