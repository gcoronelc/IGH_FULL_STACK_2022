package com.igh.proyecto1.service;

/**
 *
 * @author LENOVO
 */
public class SumaService {
    public int[] sumar(int []num1, int[] num2) {
        int []num3=new int[10];
	for(int i=0;i<num1.length;i++){
            num3[i] = num1[i] + num2[i];
        }	
            return (num3);
                
	}
}
