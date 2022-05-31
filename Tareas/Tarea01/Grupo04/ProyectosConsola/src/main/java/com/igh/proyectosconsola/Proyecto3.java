package com.igh.proyectosconsola;

/*
 * Tabla de Multiplicar de un Número 
 */
import java.util.Scanner;

/*
 * AUTOR: HUAYLINOS SUÁREZ BRUNO ANTONIO
 * Desarrollar un programa que permita mostrar la tabla de multiplicar 
 * de un número.
 */
public class Proyecto3 {

    public static void main(String[] args) {

        Scanner lectura = new Scanner(System.in);

        boolean comprobar = true;
        int n;

        while (comprobar == true) {
            //Lectura de datos
            System.out.println("Ingrese un número: ");
            n = lectura.nextInt();
            // Validación
            if (n < 0) {
                System.out.println("El número ingresado no es correcto. "
                        + "Inténtelo nuevamente.");
                continue;
            }
            //Proceso y Salida de datos

            System.out.println("Tabla del " + n);

            for (int i = 0; i <= 10; i++) {

                System.out.println(n + " x " + i + " = " + n * i);

            }
            comprobar = false;
        }

    }

}