package com.igh.proyecto4.pruebas;

import com.igh.proyecto4.service.OperacionService;
import java.util.Arrays;

/**
 *
 * @author LENOVO
 */
public class Prueba1 {
    // Variables

    public static void main(String[] args) {

        double media,mediana;
        // Datos
        int arreglo[] = {8, 5, 25, 12};
        int cantidad = arreglo.length;

        OperacionService operacionService = new OperacionService();
        media = operacionService.media(arreglo, cantidad);
        mediana=operacionService.mediana(arreglo);
        
        System.out.println(Arrays.toString(arreglo));
        System.out.println("Media: " + media);
        System.out.println("Mediana :" + mediana);
    }

}
