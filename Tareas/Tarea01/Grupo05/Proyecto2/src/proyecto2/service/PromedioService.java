/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto2.service;


import java.util.Arrays;
import java.util.Arrays;

/**
 *
 * @author thein
 */
public class PromedioService {
    
    public double promedio(double notas[]) {
        double suma = 0, promedio;
        Arrays.sort(notas);
        // 1 2 3 4 5 6
        for (int j = 2; j < notas.length; j++) {
            suma = suma + notas[j];
        }
        promedio = suma / (notas.length - 2);
        return promedio;
	}
}
