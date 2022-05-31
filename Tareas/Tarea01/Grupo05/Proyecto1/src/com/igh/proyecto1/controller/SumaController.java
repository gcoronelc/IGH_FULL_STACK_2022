package com.igh.proyecto1.controller;

import com.igh.proyecto1.service.SumaService;

/**
 *
 * @author LENOVO
 */
public class SumaController {

    private SumaService sumaService;

    public SumaController() {
        sumaService = new SumaService();
    }

    public int[] sumar(int [] num1, int []num2) {
        return sumaService.sumar(num1,num2);
    }
}
