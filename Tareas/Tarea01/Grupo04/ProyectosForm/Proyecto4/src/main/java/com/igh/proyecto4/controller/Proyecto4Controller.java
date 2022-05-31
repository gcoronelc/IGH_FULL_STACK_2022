package com.igh.proyecto4.controller;

import com.igh.proyecto4.service.Proyecto4Service;

/*
 * AUTOR: BENAVENTE VALDEZ PERCY JUSTO
 */
public class Proyecto4Controller {
    private final Proyecto4Service proyecto4Service;

    public Proyecto4Controller() {
        this.proyecto4Service = new Proyecto4Service();
    }
    public int[] descomponerDinero(int dinero){
        return this.proyecto4Service.descomponerDinero(dinero);
    }
}
