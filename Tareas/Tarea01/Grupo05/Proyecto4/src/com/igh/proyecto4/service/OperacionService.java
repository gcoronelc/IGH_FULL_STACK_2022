package com.igh.proyecto4.service;

import java.util.Arrays;

/**
 *
 * @author LENOVO
 */
public class OperacionService {
    public int[] sumar(int []num1, int[] num2) {
        int []num3=new int[10];
	for(int i=0;i<num1.length;i++){
            num3[i] = num1[i] + num2[i];
        }	
            return (num3);
                
    }
    public double media(int []arreglo,int cantidad){
        double promedio,suma=0;
        for (int j = 0; j < arreglo.length; j++) {
            suma = suma + arreglo[j];
        }
        promedio = suma/cantidad;
        return promedio;
    }
    public double mediana(int []arreglo){
       int mitad;
       double mediana;
        Arrays.sort(arreglo);
        mitad = arreglo.length/2;
        if (arreglo.length % 2 == 0) {
            mediana = (arreglo[mitad -1]+ arreglo[mitad])/2;
        } else {
            mediana = arreglo[mitad];
        }
        return mediana;
    }
}
