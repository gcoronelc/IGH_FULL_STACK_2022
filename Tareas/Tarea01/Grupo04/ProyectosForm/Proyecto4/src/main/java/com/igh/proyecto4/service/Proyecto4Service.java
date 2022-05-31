package com.igh.proyecto4.service;
/*
 *AUTOR: BENAVENTE VALDEZ PERCY JUSTO
 */
public class Proyecto4Service {
    public int[] descomponerDinero(int importe){
            int[] cambio= new int[8];
        
            int cant200,cant100,cant50,cant20,cant10,cant5,cant2,cant1;
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
            
            cambio[0]=cant200;
            cambio[1]=cant100;
            cambio[2]=cant50;
            cambio[3]=cant20;
            cambio[4]=cant10;
            cambio[5]=cant5;
            cambio[6]=cant2;
            cambio[7]=cant1;
            
            return cambio;
    }
}
