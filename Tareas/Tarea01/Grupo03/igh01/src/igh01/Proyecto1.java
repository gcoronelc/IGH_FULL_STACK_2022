/*
 * INTEGRANTES
 * Isaac Duberli Mogrovejo Tucto
 * Jorge Ventura Retuerto
 * Juan Vilca Yarasca
 */
package igh01;

import java.util.Scanner;

/**
 * Crear un programa para encontrar el Área de un Círculo. S = area del circulo
 * R = radio D = diametro S = π R^2    S = (π D^2)/4
 */
public class Proyecto1 {

    public static void main(String[] args) {

        //ENTRADA DE DATOS 
        Scanner sn = new Scanner(System.in);
        final double pi = Math.PI;
        double S=0, R,D;
        int opcion;

        do {
            System.out.println("Opcion 1 : Calcular Area de Circulo Con  Radio");
            System.out.println("Opcion 2 : Calcular Area de Circulo Con Diametro");
            System.out.print("Elija una opción: ");
            opcion = sn.nextInt();

            //PROCESO
            switch (opcion) {

                case 1:
                    System.out.println("Ingrese un Radio");
                    R = sn.nextDouble();
                    S = calcularCirculoConRadio(R, pi);
                    break;

                case 2:
                    System.out.println("Ingrese un Diametro");
                    D = sn.nextDouble();
                    S = calcularCirculoConDiametro(D, pi);
                    break;

                default:
                    System.out.println("La opción ingresada es incorrecta");
                    break;

            }
        } while (opcion != 1 && opcion != 2);

        //SALIDA
        System.out.println("El área del circulo es: " + S);

    }

    //METODOS
    private static double calcularCirculoConRadio(double R, double pi) {
        return pi * (Math.pow(R, 2));
    }

    private static double calcularCirculoConDiametro(double D, double pi) {
        return pi * ((Math.pow(D, 2)) / 4);
    }
}
