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
public class Proyecto2 {

	public static void main(String[] args) {
		//Variables
		Scanner datos = new Scanner(System.in);
		int puntaje;
		String escuela = "";
		//Lectura
		System.out.print("Ingrese el puntaje obtenido: ");
		puntaje = datos.nextInt();

		//Procesos
		/*escuela = (puntaje<50)? "No alcanzó puntaje":escuela;
        escuela = (puntaje>=50 && puntaje<60)? "Ingresó a Mecánica":escuela;
        escuela = (puntaje>=60 && puntaje<70)? "Ingresó a Industrial":escuela;
        escuela = (puntaje>=70 && puntaje<80)? "Ingresó a Electrónica":escuela;
        escuela = (puntaje>=80)? "Ingresó a Sistemas":escuela;*/
		escuela = Escuela(puntaje);

		//Salida
		System.out.println("Usted " + escuela);

	}

	private static String Escuela(int puntaje) {
		String escuela = "No alcanzó puntaje";
		escuela = (puntaje >= 50 && puntaje < 60) ? "Ingresó a Mecánica" : escuela;
		escuela = (puntaje >= 60 && puntaje < 70) ? "Ingresó a Industrial" : escuela;
		escuela = (puntaje >= 70 && puntaje < 80) ? "Ingresó a Electrónica" : escuela;
		escuela = (puntaje >= 80) ? "Ingresó a Sistemas" : escuela;
		return escuela;
	}
}
