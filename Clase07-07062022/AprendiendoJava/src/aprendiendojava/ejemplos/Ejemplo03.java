package aprendiendojava.ejemplos;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware
 * @cursos gcoronelc.github.io
 */
public class Ejemplo03 {
	
	public static void main(String[] args) {
		  
		Map<String,Integer> personas = new HashMap<>();
		
		personas.put("Angel", 24);
		personas.put("Pedro", 35);
		personas.put("Carlos", 40);
		personas.put("Carla", 35);
		personas.put("Alondra", 40);
		
		Set<String> claves = personas.keySet();
		
		for (String clave : claves) {
			System.out.println(clave + "==>> " + personas.get(clave));
		}
		
	}

}
