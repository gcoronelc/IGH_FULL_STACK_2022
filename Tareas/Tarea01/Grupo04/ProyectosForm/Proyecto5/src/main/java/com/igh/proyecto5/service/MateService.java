package com.igh.proyecto5.service;
/*
 * AUTOR: CUIZANO CAUTIVO SILVIA YULISA
 */
public class MateService {
    public int calcularPremio(int nota){
        int premio=0;
        if (nota <= 5) {
            premio += nota * 50;
        } else {
            if (nota <= 12) {
                premio += 250 + (nota - 5) * 80;
            } else {
                if (nota <= 17) {
                    premio += 810 + (nota - 12) * 120;
                } else {
                    premio += 1410 + (nota - 17) * 500;
                }
            }
        }
        return(premio);
    }
}
