package com.igh.proyecto4.controller;

import com.igh.proyecto4.service.OperacionService;

/**
 *
 * @author LENOVO
 */
public class OperacionController {

    private OperacionService operacionService;

    public OperacionController() {
        operacionService = new OperacionService();
    }

    public double media(int [] arreglo, int cantidad) {
        return operacionService.media(arreglo,cantidad);
    }
    public double mediana(int [] arreglo) {
        return operacionService.mediana(arreglo);
    }
    
}
