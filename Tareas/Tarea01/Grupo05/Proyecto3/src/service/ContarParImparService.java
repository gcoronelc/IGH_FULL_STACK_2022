package service;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class ContarParImparService {
    
    public int[] generarArreglo() {
        //Variables
        int i;
        int[] arreglo = new int[10];
        //proceso
        for(i = 0; i < arreglo.length; i++) {
            arreglo[i] = 20 + (int)(Math.random()*30+1);  //<20,50]
        } 
        
        return arreglo;
    }
    
    public int contarPares(int[] arreglo) {
        //Variables
        int i, parContador;
        
        //Datos
        parContador = 0;
        
        //proceso
        for(i = 0; i < arreglo.length; i++) {
            if(arreglo[i]%2 == 0) {
                parContador++;
            }
        }
        
        return parContador;
    }
    
    public int contarImpares(int[] arreglo) {
        //Variables
        int i, imparContador;
        
        //Datos
        imparContador = 0;
                
        //proceso
        for(i = 0; i < arreglo.length; i++) {
            if(arreglo[i]%2 != 0) {
                imparContador++;
            }
        }
        
        return imparContador;
    }
    
}
