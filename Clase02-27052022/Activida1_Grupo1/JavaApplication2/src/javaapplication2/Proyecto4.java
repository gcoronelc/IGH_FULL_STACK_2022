/*Participantes:
	 Maria del Rosario Huaroto Cardenas
	 Ronaldo Zanabria Roman
	 Brayam Hurtado Yalico
	 Jeanfranco Navarro Vargas
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author Jeanfranco
 */
public class Proyecto4 {

	public static void main(String[] args) {
		//Variables
		Scanner datos = new Scanner(System.in);
		double costoF = 0, peso, km;
		//Lectura
		System.out.println("Ingrese el peso del paquete: ");
		peso = datos.nextDouble();
		System.out.println("Ingrese la distancia en km: ");
		km = datos.nextDouble();

		//Procesos
		costoF = CostoFinal(peso, km, costoF);

		//Salida
		System.out.println("Su costo de envío sería: " + costoF);

	}

	private static double CostoFinal(double peso, double km, double cf) {
		cf = (peso >= 1 && peso < 5) ? 8 * km : cf;
		cf = (peso >= 5 && peso < 10) ? 6 * km : cf;
		cf = (peso >= 10) ? 4 * km : cf;
		return cf;
	}

}
