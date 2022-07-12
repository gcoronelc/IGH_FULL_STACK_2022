package com.igh.liskovsubstitutionprinciple.prueba;

import com.igh.liskovsubstitutionprinciple.service.Animal;
import com.igh.liskovsubstitutionprinciple.service.Elefante;

/**
 * @author A.A.Abad
 */
public class Prueba01 {

    public static void main(String[] args) {
        /* El principio nos dice que si reemplazamos new Animal() 
           con new cualquiera de sus clases hijas, deberia seguir 
           funcionando sin problemas.
         */
        Animal animal = new Animal();
        System.out.println("Un animal " + animal.saltar());
    }
}
