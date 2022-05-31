
package com.igh.proyecto5.pruebas;

import com.igh.proyecto5.service.MateService;

/*
 * AUTOR: CUIZANO CAUTIVO SILVIA YULISA
 */
public class prueba01 {
    public static void main(String[] args){
        //variables
        int nota,premio;
        //datos
        nota=13;
        //proceso
        MateService mateService=new MateService();
        premio=mateService.calcularPremio(nota);
        //reporte
        System.out.println("El premio es "+premio);
    }
}
