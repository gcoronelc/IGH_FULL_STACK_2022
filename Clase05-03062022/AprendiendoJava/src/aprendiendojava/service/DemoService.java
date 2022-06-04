package aprendiendojava.service;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware
 * @cursos gcoronelc.github.io
 */
public class DemoService {

	public void procesar(double value1, int value2){
		
	}
	
	public void procesar(int value2, double value1){
		
	}
	
	public void procesarAlgo(String algo1, Double algo2, Integer algo3){
		if(algo1!=null){
			System.out.println("Se proceso algo 1");
		} else if(algo2!=null){
			System.out.println("Se proceso algo 2");
		} else if(algo3!=null){
			System.out.println("Se proceso algo 3");
		}
	}
	
	public void procesarAlgo(String algo){
		System.out.println("Se proceso un String");
	}
	
	public void procesarAlgo(Double algo){
		System.out.println("Se proceso un Double");
	}
	
	public void procesarAlgo(Integer algo){
		System.out.println("Se proceso un Integer");
	}
}
