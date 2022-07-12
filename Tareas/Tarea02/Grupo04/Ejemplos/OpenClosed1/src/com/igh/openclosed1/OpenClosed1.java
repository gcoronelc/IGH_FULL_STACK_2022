package com.igh.openclosed1;

/*
 * Bruno Huaylinos Suárez
 */
public class OpenClosed1 {

    abstract class Coche {

        abstract int precioMedioCoche();
    }

    static class Renault extends Coche {

        @Override
        int precioMedioCoche() {
            return 18000;
        }
    }

    static class Audi extends Coche {

        @Override
        int precioMedioCoche() {
            return 25000;
        }
    }

    static class Mercedes extends Coche {

        @Override
        int precioMedioCoche() {
            return 27000;
        }
    }
    
    /*static class Peugot extends Coche {

        @Override
        int precioMedioCoche() {
            return 21000;
        }
    }*/

    public static void main(String[] args) {

        Coche[] arrayCoches = {
            new Renault(),
            new Audi(),
            new Mercedes(),
            //new Peugot()  
        };

        imprimirPrecioMedioCoche(arrayCoches);
    }

    public static void imprimirPrecioMedioCoche(Coche[] arrayCoches) {
        for (Coche coche : arrayCoches) {
            System.out.println(coche.precioMedioCoche());
        }
    }
}
