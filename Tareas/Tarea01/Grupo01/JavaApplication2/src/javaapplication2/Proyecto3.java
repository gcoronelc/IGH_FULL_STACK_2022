/*Participantes:
    Maria del Rosario Huaroto Cardenas
    Ronaldo Zanabria Roman
    Brayam Hurtado Yalico
    Jeanfranco Navarro Vargas
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author Jeanfranco
 */
public class Proyecto3 {

    public static void main(String[] args) {
        //Variables
        Scanner datos = new Scanner(System.in);
        int cantidad;
        double precioBase, descuento, importeFinal;
        
        //Lectura
        System.out.print("Ingrese la cantidad de productos a llevar: ");
        cantidad = datos.nextInt();
        System.out.print("Ingrese costo del producto: ");
        precioBase = datos.nextDouble();

        //Procesos
        descuento = descuento(cantidad, precioBase);
        importeFinal = importeFinal(cantidad, precioBase);

        //Salida
        System.out.println("El precio base es de: " + precioBase);
        System.out.println("El descuento es de: " + descuento);
        System.out.println("El importe final de la venta sería: " + importeFinal);

    }

    private static double descuento(int cantidad, double precioBase) {
        double porcentajeParaDescuento = 0.0;
        porcentajeParaDescuento = (cantidad >= 12 && cantidad < 24) ? 0.05 : porcentajeParaDescuento;
        porcentajeParaDescuento = (cantidad >= 24 && cantidad < 36) ? 0.1 : porcentajeParaDescuento;
        porcentajeParaDescuento = (cantidad >= 36) ? 0.15 : porcentajeParaDescuento;

        return precioBase * porcentajeParaDescuento;
    }

    private static double importeFinal(int cantidad, double precioBase){
        return precioBase - descuento(cantidad, precioBase);
    }
}
