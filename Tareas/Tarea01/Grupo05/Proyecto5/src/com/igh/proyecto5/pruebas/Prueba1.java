/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.igh.proyecto5.pruebas;

import com.igh.proyecto5.service.MatrizService;

/**
 *
 * @author jahir
 */
public class Prueba1 {

    public static void main(String[] args) {
        //variables
        int[][] matriz;
        int[] suma = new int[3];
        int aux = 0;
        int fila, columna;

        fila = 4;
        columna = 3;

        MatrizService matrizService = new MatrizService();
        matriz = matrizService.Matriz(fila, columna);
        suma = matrizService.SumaC(matriz, fila, columna);
        for (int i = 0; i < 4; i++) {
            System.out.println((matriz[i][0] + "\t" + matriz[i][1] + "\t" + matriz[i][2]));
        }
        System.out.println(("\n" + suma[0] + "\t" + suma[1] + "\t" + suma[2]));
    }
}
