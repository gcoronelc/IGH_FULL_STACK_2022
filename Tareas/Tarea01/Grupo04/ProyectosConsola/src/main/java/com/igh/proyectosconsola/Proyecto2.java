package com.igh.proyectosconsola;

import java.util.Scanner;
/*
 * AUTOR: ABAD MENDIZABAL ALESSANDRA ANGELA
 * Desarrollar un programa para convertir un número de base 10 a base 16.
 */

public class Proyecto2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int b10, resta;
        String b16 = "";

        //LECTURA DE DATOS
        System.out.print("Ingresar numero en base 10:");
        b10 = input.nextInt();

        //PROCESO        
        while (b10 > 0) {
            resta = b10 % 16;
            b16 = Character.toString(covertirHex(resta)) + b16;
            b10 = b10 / 16;
        }
        //SALIDA
        System.out.println("Base 16:" + b16);
    }

    private static char covertirHex(int resta) {
        char[] simbolos = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        return simbolos[resta];
    }
}
