package com.igh.proyecto1.pruebas;

import com.igh.proyecto1.service.SumaService;
import java.util.Arrays;

/**
 *
 * @author LENOVO
 */
public class Prueba1 {
    // Variables

    public static void main(String[] args) {
       
        int []suma=new int[10];
        // Datos
        int arreglo1[]={1,2,3,4,5,6,7,8,9,10};
        int arreglo2[]={10,9,8,7,6,5,4,3,2,1};
        
// Proceso
        
        SumaService sumaService = new SumaService();
        suma=sumaService.sumar(arreglo1,arreglo2);
        //suma = sumaService.sumar(num1, num2);
        // Reporte
        System.out.println("Arreglo 3: "+ Arrays.toString(suma));
        
    }

}
