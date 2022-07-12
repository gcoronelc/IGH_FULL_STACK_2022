/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test.service;

import java.util.*;

/**
 *
 * @author 51946
 */
public class Colecciones<T> {
        
    public <T> void imprimir(Collection<T> coleccion){
        coleccion.forEach(elemento->{
        System.out.println("Elemento: "+elemento);
    });
    }
    
   public static <T> void imprimirRestringido(Collection<String> coleccion){
        coleccion.forEach(elemento->{
        System.out.println("Elemento: "+elemento);
    });
    }
}
