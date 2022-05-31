package test;

import service.ContarParImparService;

/**
 *
 * @author Bryan
 */
public class Prueba1 {
    public static void main(String[] args) {
        //variables
        ContarParImparService contarParImparService = new ContarParImparService();
        int imparContador;
        int parContador;
        int arreglo[];
        
        //Datos
        arreglo = contarParImparService.generarArreglo();
        
        //Proceso -> Conteo de pares e impares
        imparContador = contarParImparService.contarImpares(arreglo);
        parContador = contarParImparService.contarPares(arreglo);
        
        //Reporte
        System.out.println("Numeros del arreglo:");
        for(int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i]);
        }
        System.out.println("Pares: " + parContador);
        System.out.println("Impares: " + imparContador);
    }
}
