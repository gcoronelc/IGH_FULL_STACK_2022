package com.igh.expregulares.service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Kevyn VA
 */
public class ValidarService {

    public Boolean validarcorreo(String texto) {
        Pattern entrada = Pattern.compile("[\\w-.]+@gmail.com");
        Matcher compara = entrada.matcher(texto.toLowerCase());
        return (compara.matches());
    }

    public Boolean validardni(String texto) {
        Pattern entrada = Pattern.compile("[0-9]{8}");
        Matcher compara = entrada.matcher(texto);
        return compara.matches();
    }

    public Boolean validarcodigo(String texto) {
        Pattern entrada = Pattern.compile("^[0][0-9]{9}+");
        Matcher compara = entrada.matcher(texto);
        return compara.matches();
    }

    public Boolean validarcodpostal(String texto) {
        Pattern entrada = Pattern.compile("01[0-9]{6}+");
        Matcher compara = entrada.matcher(texto);
        return compara.matches();
    }
}
