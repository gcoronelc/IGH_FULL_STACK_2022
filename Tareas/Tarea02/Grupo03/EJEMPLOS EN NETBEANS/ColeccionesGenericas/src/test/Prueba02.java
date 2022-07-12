/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import java.util.ArrayList;
import java.util.List;
import test.service.Colecciones;

/**
 *
 * @author 51946
 */
public class Prueba02 {
    public static void main(String[] args) {
        
        List<Integer> miListaEdades = new ArrayList<>();
        List<String> miListaNombres = new ArrayList<>();
    
        miListaEdades.add(12);
        miListaEdades.add(15);
        miListaEdades.add(18);
        
        miListaNombres.add("Juan");
        miListaNombres.add("Jorge");
        miListaNombres.add("Isaac");
         
       // Colecciones.imprimirRestringido(miListaEdades);
        
        System.out.println("=============================");
        Colecciones.imprimirRestringido(miListaNombres);
        System.out.println("=============================");
        
    }
}
