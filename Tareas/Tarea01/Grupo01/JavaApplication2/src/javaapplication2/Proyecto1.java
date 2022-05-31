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
 *
 */
public class Proyecto1 {

    public static void main(String[] args) {
        //Variables
        Scanner datos = new Scanner(System.in);
        double precioDeCosto, ganancia, precioDeVenta, validadorParaReporte;
        String reporte;
        //Lectura
        System.out.print("Ingrese costo del producto: ");
        precioDeCosto = datos.nextDouble();
        System.out.print("Ingrese precio de venta: ");
        precioDeVenta = datos.nextDouble();

        //Procesos
        ganancia = precioDeVenta - precioDeCosto;
        validadorParaReporte = precioDeCosto * 0.5;

        if (validadorParaReporte < ganancia) {
            reporte = "El producto se considera caro";
        } else {
            reporte = "El producto se considera barato";
        }

        //Salida
        System.out.println("Ganancia: " + ganancia);
        System.out.println("50% del precio de costo: " + validadorParaReporte);
        System.out.println("Reporte: " + reporte);

    }

}
