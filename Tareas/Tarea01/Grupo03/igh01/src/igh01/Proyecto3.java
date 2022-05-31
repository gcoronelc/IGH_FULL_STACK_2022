/*
 * INTEGRANTES
 * Isaac Duberli Mogrovejo Tucto
 * Jorge Ventura Retuerto
 * Juan Vilca Yarasca
 */
package igh01;

import java.util.Scanner;

/**
 * AUTORES: ISaac Mogrovejo, Jorge Ventura, Juan Vilca
  *Desarrollar un programa para calcular el importe de una venta, los datos son el 
  *precio del producto y la cantidad. El precio del producto incluye el 18% correspondiente 
  *al impuesto de ley. Se debe calcular el importe de la venta, el impuesto de ley y el total de la venta
 */

public class Proyecto3 {

    public static void main(String[] args) {

        //ENTRADA
        Scanner sc = new Scanner(System.in);
        double precioUnitario = 0;

        int cantidad = 0;
        double subtotal = 0;
        double impuestoLey = 0;
        double total = 0;
        
        final double impuestoIGV = 0.18;

        System.out.print("Ingrese Precio Producto unitario: ");
        precioUnitario = sc.nextDouble();

        System.out.print("Ingrese cantidad de Producto:");
        cantidad = sc.nextInt();

        //PROCESO
        total = calcularTotalVenta(precioUnitario, cantidad);

        impuestoLey = calcularImpuestoLey(total, impuestoIGV);

        subtotal = calcularSubtotal(total, impuestoLey);

        //SALIDA
        System.out.println("Sub total : " + subtotal);

        System.out.println("Impuesto de Ley : " + impuestoLey);

        System.out.println("Total de la Venta : " + total);

    }

    private static double calcularTotalVenta(double precioUnitario, int cantidad) {
        return precioUnitario * cantidad;
    }

    private static double calcularImpuestoLey(double total, double impuestoIGV) {

        return total * impuestoIGV;
    }

    private static double calcularSubtotal(double total, double impuestoLey) {
        return total - impuestoLey;
    }
}
