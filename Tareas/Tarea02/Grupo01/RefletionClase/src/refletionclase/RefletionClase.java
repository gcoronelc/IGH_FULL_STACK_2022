/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package refletionclase;

import Prueba.Clase1;
import java.lang.reflect.Modifier;

/**
 *
 * @author aless
 */
public class RefletionClase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        //crtear una objeto de la clase Clase1.class
        Class<Clase1> clase1Obj = Clase1.class;
        
        //Imprime el nombre de la Clase
        System.out.println("Nombre de La Clase: "+clase1Obj.getName());
        System.out.println("");
        // Imprime el nombre de la Super Clase
        
        System.out.println("Nombre de la super clase:  "+ clase1Obj.getSuperclass().getName());
        System.out.println("");
       
        
//Lee una lista de Interfaces implementados wn una forma de Array de clase usando el metod getInterface().
        Class[] clase1InterfaceLista = clase1Obj.getInterfaces();
   
        //Imprime las interfaces implementadas usando un loop foreach
        
        System.out.println("Las Interfaces Implementadas son: ");
        for (Class class1 : clase1InterfaceLista) {
            System.out.println("- "+class1.getName());
        }
        
        System.out.println("");
        
        //leer los modificadors de acceso usando el método getModifiers() 
        //y el método getString de la clase java.lang.reflect.Modifier
        
        
        int clase1ModAcceso = clase1Obj.getModifiers();
        
        System.out.println("Los modificadores de Acceso de la Clase "+clase1Obj.getName()+ " Son: "+Modifier.toString(clase1ModAcceso));
        
        
    }
    
}
