package com.igh.proyectosconsola;

import java.util.Scanner;
/*
 * AUTOR: CUIZANO CAUTIVO SILVIA YULISA
 * Un padre con la intensión de motivar el estudio en su hijo, le dice que será 
 * compensado según su promedio final del ciclo. La compensación es monetaria, 
 * según el cuadro adjunto. Desarrollar un programa que permita al Padre 
 * calcular la compensación del hijo.
 *      
 *  RANGO NOTA    FACTOR A MULTIPLICAR
 *    0 - 5                50
 *    6 - 12               80
 *   13 - 17              120
 *   18 - 20              500
 */
public class Proyecto5 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //Lectura
        int nota, premio = 0;
        System.out.println("Digite la nota: ");
        nota = entrada.nextInt();
        while (nota < 0 || nota > 20) {
            System.out.println("Ingrese una nota valida");
            nota = entrada.nextInt();
        }
        //proceso
        if (nota <= 5) {
            premio += nota * 50;
        } else {
            if (nota <= 12) {
                premio += 250 + (nota - 5) * 80;
            } else {
                if (nota <= 17) {
                    premio += 810 + (nota - 12) * 120;
                } else {
                    premio += 1410 + (nota - 17) * 500;
                }
            }
        }
        //salida
        System.out.println("El premio es " + premio);
    }
}