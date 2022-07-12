
package Prueba;

import java.util.ArrayList;
import modelo.Lavadora;

import modelo.Ordenador;

/**
 *
 * @author aless
 */
public class Prueba1 {

    public static void main(String[] args) {

        ArrayList<Ordenador> lista = new ArrayList<>();

        Ordenador o1 = new Ordenador("A1", "Ordenador Gaming", 5);
        Ordenador o2 = new Ordenador("B1", "Ordenador ofimatica", 2);

        lista.add(o1);
        lista.add(o2);

        for (Ordenador ordenador : lista) {
            System.out.println(ordenador.getId());
            System.out.println(ordenador.getPotencia());
            System.out.println(ordenador.getDescripcion());
        }
        
        System.out.println("");

        
        ArrayList<Lavadora> lista2 = new ArrayList<>();

        Lavadora l1 = new Lavadora("L1", "Standard", "Lavadora Normal");
        Lavadora l2 = new Lavadora("L2", "VIP", "Lavadora avanzada");

        lista2.add(l1);
        lista2.add(l2);

        for (Lavadora lavadora : lista2) {
            System.out.println(lavadora.getId());
            System.out.println(lavadora.getModelo());
            System.out.println(lavadora.getDescripcion());
        }

    }

}
