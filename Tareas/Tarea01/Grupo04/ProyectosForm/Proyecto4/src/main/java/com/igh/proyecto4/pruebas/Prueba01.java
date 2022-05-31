package com.igh.proyecto4.pruebas;

/*
 * AUTOR: BENAVENTE VALDEZ PERCY JUSTO
 */
public class Prueba01 {
    
    public static void main(String args[]){
    int importe=1357;
       
        
        
        int cant200,cant100,cant50,cant20,cant10,cant5,cant2,cant1;
        
            System.out.println("Ingrese Cantidad a cambiar: "+ importe);
            
            
            cant200=(importe>=200)? (importe/200):(0);
            importe=(cant200>0) ? (importe%200):(importe);
            cant100=(importe>=100)? (importe/100):(0);
            importe=(cant100>0) ? (importe%100):(importe);
            cant50=(importe>=50)? (importe/50):(0);
            importe=(cant50>0) ? (importe%50):(importe);
            cant20=(importe>=20)? (importe/20):(0);
            importe=(cant20>0) ? (importe%20):(importe);
            cant10=(importe>=10)? (importe/10):(0);
            importe=(cant10>0) ? (importe%10):(importe);
            cant5=(importe>=5)? (importe/5):(0);
            importe=(cant5>0) ? (importe%5):(importe);
            cant2=(importe>=2)? (importe/2):(0);
            importe=(cant2>0) ? (importe%2):(importe);
            cant1=importe;
            
            
      
        
        System.out.println("\nReporte: \n");
        System.out.println("Billetes de 200: "+cant200);
        System.out.println("Billetes de 100: "+cant100);
        System.out.println("Billetes de 50: "+cant50);
        System.out.println("Billetes de 20: "+cant20);
        System.out.println("Billetes de 10: "+cant10);
        System.out.println("Monedas de 5  : "+cant5);
        System.out.println("Monedas de 2  : "+cant2);
        System.out.println("Monedas de 1  : "+cant1);
    }
}
