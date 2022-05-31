
package com.igh.proyecto5.controller;

import com.igh.proyecto5.service.MateService;

/*
 * AUTOR: CUIZANO CAUTIVO SILVIA YULISA
 */
public class MateController {
    private final MateService mateService;
    
    public MateController(){
        mateService= new MateService();
    }
    
     public int calcularPremio(int nota){
         return mateService.calcularPremio(nota);
     }
    
}
