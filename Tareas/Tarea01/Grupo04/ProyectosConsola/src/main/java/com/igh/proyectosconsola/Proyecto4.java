package com.igh.proyectosconsola;

import java.util.Scanner;

/*
 * AUTOR: BENAVENTE VALDEZ PERCY JUSTO
 * Desarrollar un programa que descomponga
 * un importe de soles en billetes de 200, 100, 
 * 50, 20 y 10 Soles, el resto lo debe
 * descompones en monedas 5, 2 y 1 sol
 */

public class Proyecto4 {

    public static void main(String[] args) {

        int importe;
        Scanner sc = new Scanner(System.in);

        int cant200, cant100, cant50, cant20, cant10, cant5, cant2, cant1;

        //LECTURA DE DATOS
        System.out.println("Ingrese Cantidad a cambiar: ");
        importe = sc.nextInt();

        //PROCESO   
        cant200 = (importe >= 200) ? (importe / 200) : (0);
        importe = (cant200 > 0) ? (importe % 200) : (importe);
        cant100 = (importe >= 100) ? (importe / 100) : (0);
        importe = (cant100 > 0) ? (importe % 100) : (importe);
        cant50 = (importe >= 50) ? (importe / 50) : (0);
        importe = (cant50 > 0) ? (importe % 50) : (importe);
        cant20 = (importe >= 20) ? (importe / 20) : (0);
        importe = (cant20 > 0) ? (importe % 20) : (importe);
        cant10 = (importe >= 10) ? (importe / 10) : (0);
        importe = (cant10 > 0) ? (importe % 10) : (importe);
        cant5 = (importe >= 5) ? (importe / 5) : (0);
        importe = (cant5 > 0) ? (importe % 5) : (importe);
        cant2 = (importe >= 2) ? (importe / 2) : (0);
        importe = (cant2 > 0) ? (importe % 5) : (importe);
        cant1 = importe;

        //SALIDA
        System.out.println("Reporte: \n");
        System.out.println("Billetes de 200: " + cant200);
        System.out.println("Billetes de 100: " + cant100);
        System.out.println("Billetes de 50: " + cant50);
        System.out.println("Billetes de 20: " + cant20);
        System.out.println("Billetes de 10: " + cant10);
        System.out.println("Monedas de 5  : " + cant5);
        System.out.println("Monedas de 2  : " + cant2);
        System.out.println("Monedas de 1  : " + cant1);

    }

}
