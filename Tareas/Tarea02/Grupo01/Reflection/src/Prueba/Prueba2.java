package Prueba;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

import modelo.Lavadora;
import modelo.Ordenador;

/**
 * 
 * @author aless
 */

public class Prueba2 {

    public static void main(String[] args) {
        ArrayList<Ordenador> lista1 = new ArrayList<>();

        Ordenador o01 = new Ordenador("A1", "Ordenador Gaming", 5);
        Ordenador o02 = new Ordenador("B1", "Ordenador ofimatica", 2);

        lista1.add(o01);

        lista1.add(o02);

        ArrayList<Lavadora> lista2 = new ArrayList<>();

        Lavadora l01 = new Lavadora("L1", "Standard", "Lavadora Normal");
        Lavadora l02 = new Lavadora("L2", "VIP", "Lavadora avanzada");

        lista2.add(l01);

        lista2.add(l02);
        
        imprimirListaCualquiera(lista1);
        imprimirListaCualquiera(lista2);
    }

    public static void imprimirListaCualquiera(ArrayList<?>  Listas){
     
        for (Object c : Listas) {
           
            Method[] metodos = c.getClass().getMethods();
            
            for (Method metodo : metodos) {
               //System.out.println(""+ metodo);
                
                if (metodo.getName().equals("getId") || metodo.getName().equals("getDescripcion")){
                    try {
                            String cadena = (String)  metodo.invoke(c, (Object[]) null);
                        System.out.println(""+cadena);
                    } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
                    }
                    
                }
            }
        }
        
    } 
    
}
