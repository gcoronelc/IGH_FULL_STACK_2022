/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.igh.proyecto5.service;

/**
 *
 * @author jahir
 */
public class MatrizService {

    

    public int[][] Matriz(int f, int c) {// f = fila , c=Columna 
        int[][] matriz = new int[f][c];

        //proceso
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                matriz[i][j] = (int) (Math.random() * 21 + 10);
            }
        }
        return (matriz);
    }

    public int[] SumaC(int[][] matriz, int f, int c) {
        int aux = 0;
        int[] suma = new int[c];
        for (int j = 0; j < c; j++) {
            aux = 0;
            for (int i = 0; i < f; i++) {
                aux = aux + matriz[i][j];
            }
            suma[j] = aux;
        }
        return (suma);
    }

}
