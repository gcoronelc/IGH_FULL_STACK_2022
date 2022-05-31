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
        double importexEnvio, pesoPaquete, distancia;

        //Lectura
        System.out.print("Ingrese el peso del paquete en kilogramos: ");
        pesoPaquete = datos.nextDouble();
        System.out.print("Ingrese la distancia en kilometros: ");
        distancia = datos.nextDouble();

        //Procesos
        importexEnvio = importeFinal(pesoPaquete, distancia);

        //Salida
        System.out.println("El importe por el envío de paquee sería: " + importexEnvio +" soles");

    }

    private static double importeFinal(double pesoPaquete, double distancia) {
        double importeFinal = 0;
        importeFinal = (pesoPaquete >= 1 && pesoPaquete < 5) ? 8 * distancia : importeFinal;
        importeFinal = (pesoPaquete >= 5 && pesoPaquete < 10) ? 6 * distancia : importeFinal;
        importeFinal = (pesoPaquete >= 10) ? 4 * distancia : importeFinal;
        return importeFinal;
    }

}
