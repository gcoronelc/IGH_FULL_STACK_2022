/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.igh.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/** 
 * @author Silvia Cuizano Cautivo
 */

public class StreamApp {

    private List<String> nombres;
    private List<String> numeros;

    public StreamApp() {
        nombres = new ArrayList<>();
        nombres.add("Silvia");
        nombres.add("Luis");
        nombres.add("Jaime");
        nombres.add("Jack");
        nombres.add("Zara");
        nombres.add("Zara");

        numeros = new ArrayList<>();
        numeros.add("1");
        numeros.add("2");
        numeros.add("3");
        numeros.add("4");
        numeros.add("5");
        numeros.add("6");
    }

    public void filtrar() {
        nombres.stream().filter(x -> x.startsWith("J")).forEach(System.out::println);
    }

    public void ordenar() {
        //nombres.stream().sorted().forEach(System.out::println);
        numeros.stream().sorted((x, y) -> y.compareTo(x)).forEach(System.out::println);
        //nombres.stream() .sorted(Comparator.comparing(String::length)).forEach(System.out::println);
        //numeros.stream().sorted().forEach(System.out::println);       
    }

    public void transformar() {
        nombres.stream().map(String::toUpperCase).forEach(System.out::println);
        numeros.stream().map(x -> Integer.parseInt(x) + 1).forEach(System.out::println);
        /*for(String x:numeros){
            int num=Integer.parseInt(x)+1;
            System.out.println(num);
        }*/
    }

    public void limitar() {
        numeros.stream().limit(3).forEach(System.out::println);
        nombres.stream().limit(3).forEach(System.out::println);
    }

    public void contar() {
        long x = nombres.stream().count();
        System.out.println(x);
    }

    public void Nduplicados() {
        nombres.stream().distinct().forEach(System.out::println);
    }
}
