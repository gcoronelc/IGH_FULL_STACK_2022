package aprendiendojava.ejemplos;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware
 * @cursos gcoronelc.github.io
 */
public class Ejemplo01 {
	
	public static void main(String[] args) {
		  
		List lista = new ArrayList();
		
		lista.add(2345);
		lista.add(435.66);
		lista.add("Gustavo");
		lista.add(new Random());
		
		for (Object object : lista) {
			System.out.println(object);
		}
		
	}

}
