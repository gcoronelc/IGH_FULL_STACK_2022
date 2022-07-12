package test;

import java.util.*;
import test.service.Colecciones;

public class Prueba01 {

    public static void main(String[] args) {
        
        List<String> miLista = new ArrayList<>();
        List miListaTradicional = new ArrayList();
        Set<String> miSet = new HashSet<>();
        Map<String, String> miMapa = new HashMap<>();

        //Agregando datos a la lista
        
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        
        miListaTradicional.add(1);
        miListaTradicional.add("dos");
        miListaTradicional.add(3);

        //Agregando datos al set
        miSet.add("Enero");
        miSet.add("Febrero");
        miSet.add("Marzo");
        miSet.add("Abril");
        miSet.add("Mayo");

        //Agregando datos al mapa
        miMapa.put("Valor1", "Juan");
        miMapa.put("Valor2", "Karla");
        miMapa.put("Valor3", "Rosario");

        Colecciones coleccion =new Colecciones();
        coleccion.imprimir(miLista);
        
        System.out.println("=========================");
        
        coleccion.imprimir(miSet);
        System.out.println("=========================");
        
        coleccion.imprimir(miMapa.keySet());
        System.out.println("=========================");
        
        coleccion.imprimir(miMapa.values());
        
        System.out.println("==========================");
        coleccion.imprimir(miListaTradicional);
       
       //Integer numero =   miListaTradicional.get(0);
        String elemento = miLista.get(0);
        

     
        
        
        
        
        
        

    }

}
