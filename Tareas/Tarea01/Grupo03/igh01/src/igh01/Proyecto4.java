/*
 * INTEGRANTES
 * Isaac Duberli Mogrovejo Tucto
 * Jorge Ventura Retuerto
 * Juan Vilca Yarasca
 */
package igh01;

import java.util.Scanner;

/**
 * Desarrollar un programa para calcular el área de un triángulo aplicando la
 * fórmula de Herón
 *
 */
public class Proyecto4 {

    public static void main(String[] args) {

        //ENTRADA
        Scanner sc = new Scanner(System.in);
        int ladoA = 0;
        int ladoB = 0;
        int ladoC = 0;
        double semiPerimetro = 0;
        double areaTriangulo = 0;

        System.out.print("Ingrese lado A: ");
        ladoA = sc.nextInt();

        System.out.print("Ingrese lado B: ");
        ladoB = sc.nextInt();

        System.out.print("Ingrese lado C: ");
        ladoC = sc.nextInt();

        //PROCESO
        semiPerimetro = calcularSemiPermitro(ladoA, ladoB, ladoC);

        areaTriangulo = formulaHeron(semiPerimetro, ladoA, ladoB, ladoC);

        //SALIDA
        System.out.println("Area de Triangulo : " + areaTriangulo + "cm2");

    }

    private static int calcularSemiPermitro(int a, int b, int c) {
        return (a + b + c) / 2;
    }

    private static double formulaHeron(double s, int ladoA, int ladoB, int ladoC) {
        return Math.sqrt(s * (s - ladoA) * (s - ladoB) * (s - ladoC));
    }
}
