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
public class Proyecto3 {

	public static void main(String[] args) {
		//Variables
		Scanner datos = new Scanner(System.in);
		int cantidad;
		double costo, descuento = 0, precioF = 0;
		//Lectura
		System.out.print("Ingrese la cantidad de productos a llevar: ");
		cantidad = datos.nextInt();
		System.out.print("Ingrese costo del producto: ");
		costo = datos.nextDouble();

		//Procesos
		precioF = ImporteFinal(cantidad, costo);

		//Salida
		System.out.println("EL precio final sería: " + precioF);

	}

	private static double ImporteFinal(int cantidad, double costo) {
		double porcDcto = 0.0, PF;
		porcDcto = (cantidad >= 12 && cantidad < 24) ? 0.05 : porcDcto;
		porcDcto = (cantidad >= 24 && cantidad < 36) ? 0.10 : porcDcto;
		porcDcto = (cantidad >= 36) ? 0.15 : porcDcto;
		PF = costo - costo * porcDcto;
		return PF;
	}

}
