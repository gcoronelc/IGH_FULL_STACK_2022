/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.igh.expregulares.pruebas;

import com.igh.expregulares.service.ValidarService;

/**
 *
 * @author Kevyn VA
 */
public class Prueba1 {
    public static void main(String[] args) {
        String correo="kevynvalverde@gmail.com",dni="71653755";
        Boolean salida1,salida2;
        ValidarService validarService = new ValidarService();
        salida1=validarService.validarcorreo(correo);
        salida2=validarService.validardni(dni);
        
        
        System.out.println("Verificación: " + salida1);
        System.out.println("Verificación: " + salida2);
    }
}
