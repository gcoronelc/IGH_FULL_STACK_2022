package com.igh.proyectosconsola;

import java.util.Scanner;
/*
 * AUTOR: LEÓN SÁNCHEZ FRANSUA MIJAIL
 * Desarrollar un programa para encontrar la suma de los números pares e impares 
 * comprendidos entre 1 y N.
 */

public class Proyecto1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, sum_pares = 0, sum_impares = 0;
        //Lectura de datos
        System.out.println("Ingrese el numero N:");
        n = sc.nextInt();
        //Proceso
        for (int i = 2; i <= n; i += 2) {
            sum_pares += i;
        }
        for (int i = 1; i <= n; i += 2) {
            sum_impares += i;
        }
        //Salida de datos
        System.out.println("La suma de los números pares comprendidos entre 1 y " + n + " es: " + sum_pares);
        System.out.println("La suma de los números impares comprendidos entre 1 y " + n + " es: " + sum_impares);
    }
}
