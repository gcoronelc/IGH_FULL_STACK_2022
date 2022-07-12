package com.igh.expregulares.controller;

import com.igh.expregulares.service.ValidarService;

/**
 *
 * @author Kevyn VA
 */
public class ValidarController {

    private ValidarService validarService;

    public ValidarController() {
        validarService = new ValidarService();
        
    }

    public Boolean validarcorreo(String texto) {
        return validarService.validarcorreo(texto);
    }
    public Boolean validardni(String texto) {
        return validarService.validardni(texto);
    }
    public Boolean validarcodalumno(String texto) {
        return validarService.validarcodigo(texto);
    }
    public Boolean validarpostal(String texto) {
        return validarService.validarcodpostal(texto);
    }

}
