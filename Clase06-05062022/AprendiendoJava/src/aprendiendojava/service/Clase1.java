package aprendiendojava.service;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware
 * @cursos gcoronelc.github.io
 */
public class Clase1 {
	
	protected String profesor = "Gustavo Coronel";

	public Clase1(String nombre) {
		System.out.println("Hola " + nombre + " desde Clase1");
	}

	public int sumar(int n1, int n2){
		return (n1+n2);
	}
	
	public double sumar(double n1, double n2) {
		return (n1+n2);
	}

}
