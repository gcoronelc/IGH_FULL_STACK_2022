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
 *
 */
public class Proyecto1 {

	public static void main(String[] args) {
		
		//Variables
		Scanner datos = new Scanner(System.in);
		double costo, ganancia, venta, porc;
		String reporte;

		//Lectura
		System.out.print("Ingrese costo del producto: ");
		costo = datos.nextDouble();
		System.out.print("Ingrese precio de venta: ");
		venta = datos.nextDouble();

		//Procesos
		ganancia = venta - costo;
		porc = costo * 0.5;
		if (porc < ganancia) {
			reporte = "El producto se considera caro";
		} else {
			reporte = "El producto se considera barato";
		}

		//Salida
		System.out.println("Ganancia: " + ganancia);
		System.out.println("porc: " + porc);
		System.out.println("Reporte: " + reporte);
		
	}

}
