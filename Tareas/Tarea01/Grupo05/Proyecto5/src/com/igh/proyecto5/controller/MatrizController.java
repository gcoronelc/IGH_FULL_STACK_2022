/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.igh.proyecto5.controller;

import com.igh.proyecto5.service.MatrizService;

/**
 *
 * @author jahir
 */
public class MatrizController {
     private MatrizService matrizService;
     
     public MatrizController(){
         matrizService = new MatrizService();
     }
     
     public int[][] Matriz(int f , int c){
         return matrizService.Matriz(f,c);
     }
     public int [] SumarC(int[][] matriz ,int f, int c ){
         return matrizService.SumaC(matriz,f, c);
     }
}
