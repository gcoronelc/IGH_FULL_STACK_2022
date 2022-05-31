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
        String resultado;

        //Lectura
        System.out.print("Ingrese el puntaje obtenido: ");
        puntaje = datos.nextInt();

        //Procesos
        resultado = reporte(puntaje);

        //Salida
        System.out.println("Usted " + resultado);

    }

    private static String reporte(int puntaje) {
        String resultado = "no alcanzó puntaje";
        resultado = (puntaje >= 50 && puntaje < 60) ? "ingresó a Mecánica" : resultado;
        resultado = (puntaje >= 60 && puntaje < 70) ? "ingresó a Industrial" : resultado;
        resultado = (puntaje >= 70 && puntaje < 80) ? "ingresó a Electrónica" : resultado;
        resultado = (puntaje >= 80) ? "ingresó a Sistemas" : resultado;
        return resultado;
    }
}
