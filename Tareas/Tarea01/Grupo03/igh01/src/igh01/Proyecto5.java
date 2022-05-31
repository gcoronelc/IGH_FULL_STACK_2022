/*
 * INTEGRANTES
 * Isaac Duberli Mogrovejo Tucto
 * Jorge Ventura Retuerto
 * Juan Vilca Yarasca
 */
package igh01;

import java.util.Scanner;

/*
 *Crear un programa que calcular el Sueldo Neto a pagar a un trabajador, considerando los siguientes puntos:
 *El número de horas trabajadas.
 *El pago por hora.
 *Al trabajador se le debe retener el 5% del total de ingresos por concepto de impuesto.
 */
public class Proyecto5 {

    public static void main(String[] args) {
        //ENTRADA
        Scanner sc = new Scanner(System.in);

        double sueldoBruto, sueldoNeto, pagoHora, retencion;
        int numeroHorasTrabajadas;

        final double impuesto = 0.05;

        System.out.print("Ingrese Numero de Horas Trabajadas: ");
        numeroHorasTrabajadas = sc.nextInt();

        System.out.print("Ingrese Pago Por Hora: ");
        pagoHora = sc.nextDouble();

        sueldoBruto = calcularSueldoNeto(numeroHorasTrabajadas, pagoHora);

        retencion = calcularRetencionImpuesto(impuesto, sueldoBruto);

        sueldoNeto = calcularTotal(sueldoBruto, retencion);

        //SALIDA
        System.out.println("Sueldo bruto: " + sueldoBruto);
        System.out.println("Impuesto a Pagar: " + retencion);
        System.out.println("Sueldo neto: " + sueldoNeto);
    }

    private static double calcularSueldoNeto(int numeroHorasTrabajadas, double pagoHora) {
        return (numeroHorasTrabajadas * pagoHora);
    }

    private static double calcularRetencionImpuesto(double impuesto, double sueldoBruto) {
        return sueldoBruto * impuesto;
    }

    private static double calcularTotal(double sueldoNeto, double retencion) {
        return sueldoNeto - retencion;
    }
}
