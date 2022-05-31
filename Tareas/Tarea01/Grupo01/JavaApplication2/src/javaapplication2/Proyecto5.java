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
public class Proyecto5 {

    public static void main(String[] args) {

        //Variables
        Scanner scaner = new Scanner(System.in);
        int horasTrabajadas, horasExtras;
        double pagoxHoras, pagoInicial, pagoExtra, sueldoBruto, descuentoxImpuesto, sueldoNeto;

        //Lecturas
        System.out.print("Horas trabajadas: ");
        horasTrabajadas = scaner.nextInt();
        System.out.print("Pago por horas: ");
        pagoxHoras = scaner.nextDouble();

        //Procesos
        horasExtras = horasExtras(horasTrabajadas);
        pagoInicial = pagoInicial(horasTrabajadas,pagoxHoras);
        pagoExtra = pagoExtra(horasTrabajadas, pagoxHoras);
        sueldoBruto = sueldoBruto(pagoxHoras, horasTrabajadas);
        descuentoxImpuesto = descuentoXImpuesto(pagoxHoras, horasTrabajadas);
        sueldoNeto = sueldoNeto(pagoxHoras, horasTrabajadas);

        //Salida
        System.out.println("Su horas extras fueron:  " + horasExtras);
        System.out.println("Su pago inicial fue de: " + pagoInicial + " soles");
        System.out.println("Su pago extra fue de: " + pagoExtra + " soles");
        System.out.println("Su sueldo bruto fue de: " + sueldoBruto + " soles");
        System.out.println("Se le aplicó un descuento de: " + descuentoxImpuesto + " soles");
        System.out.println("Su suedo neto es de: " + sueldoNeto + " soles");

    }

    private static int horasExtras(int horasTrabajadas) {
        int horasExtras=0;
        if(horasTrabajadas>40){
            horasExtras = horasTrabajadas - 40;
        }
        return horasExtras;
    }

    private static double pagoInicial(int horasTrabajadas,double pagoxHoras) {
        double pagoInicial;
        if(horasTrabajadas>40){
            pagoInicial= 40*pagoxHoras;
        }else pagoInicial = horasTrabajadas*pagoxHoras;
        return pagoInicial;
    }

    private static double pagoExtra(int horasTrabajadas, double pagoxHoras) {
        double pagoxExcederHoras = 0.0;
        if (horasTrabajadas > 40) {
            pagoxExcederHoras = pagoxHoras * 0.5;
        }
        return (pagoxHoras + pagoxExcederHoras) * horasExtras(horasTrabajadas);
    }

    private static double sueldoBruto(double pagoxHoras, int horasTrabajadas) {
        return pagoInicial(horasTrabajadas,pagoxHoras) + pagoExtra(horasTrabajadas, pagoxHoras);
    }

    private static double descuentoXImpuesto(double pagoxHoras, int horasTrabajadas) {
        double sueldo = sueldoBruto(pagoxHoras, horasTrabajadas);
        double descuento = 0;
        if (sueldo > 2000.0) {
            descuento = sueldo * 0.08;
        }
        return descuento;
    }

    private static double sueldoNeto(double pagoxHoras, int horasTrabajadas) {
        return sueldoBruto(pagoxHoras, horasTrabajadas) - descuentoXImpuesto(pagoxHoras, horasTrabajadas);
    }

}
