/*
 * INTEGRANTES
 * Isaac Duberli Mogrovejo Tucto
 * Jorge Ventura Retuerto
 * Juan Vilca Yarasca
 */
package igh01;

import java.util.Scanner;

/**
 * Desarrollar un programa para calcular la suma de los N primeros números 
 * Suma= (N * (N+1))/2
 */
public class Proyecto2 {

    public static void main(String[] args) {
        //ENTRADA
        Scanner sc = new Scanner(System.in);
        int suma = 0;
        int numero;

        System.out.print("Ingresar Limite de numero que quiere Sumar: ");
        numero = sc.nextInt();

        //PROCESO
        suma = sumaN(numero);

        //SALIDA
        System.out.println("La suma de los " + numero + " primeros numeros es Igual a: " + suma);
    }

    private static int sumaN(int numero) {
        return (numero * (numero + 1)) / 2;
    }
}
