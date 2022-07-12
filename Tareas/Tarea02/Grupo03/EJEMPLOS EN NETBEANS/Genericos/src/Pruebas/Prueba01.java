package Pruebas;

import genericos.services.ClaseGenerica;

public class Prueba01 {

    public static void main(String[] args) {

        /**
         * ************************************************
         * NO ACEPTA TIPOS PRIMITIVOS
         * *************************************************
         */
        ClaseGenerica<Integer> objetoInt = new ClaseGenerica<>(14);
        ClaseGenerica<String> objetoString = new ClaseGenerica<>("hjbj");
        
        objetoInt.obtenerTipo();
        objetoString.obtenerTipo();

        System.out.println("=====================================");
        
        objetoInt.imprimirGenerico(14);
        objetoString.imprimirGenerico("dato generico");

    }

}
