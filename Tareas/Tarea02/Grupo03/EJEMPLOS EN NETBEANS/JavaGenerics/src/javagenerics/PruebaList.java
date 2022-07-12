/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javagenerics;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USER
 */
public class PruebaList {

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("abc");
        //Error en tiempo de compilacon
        list.add(new Integer(5)); //OK

        for (Object obj : list) {
            //type casting leading to ClassCastException at runtime
            String str = (String) obj;
        }
        
        //Especificamos el tipo de de elemento que soportara la Lista 
         List<String> list1 = new ArrayList<String>(); //
        list1.add("abc");
        //Error en tiempo de compilacion
        //list1.add(new Integer(5)); //compiler error
        
        for (String str : list1) {
        
        }
    }
}
