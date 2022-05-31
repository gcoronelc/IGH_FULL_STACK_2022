package com.igh.proyecto2.service;
/*
 * AUTOR: ABAD MENDIZABAL ALESSANDRA ANGELA
 */
public class HexaService {

    public String convertirHex(int numDecimal) {
        int resta;
        String numHexa = "";
        Boolean esNegativo = false;
        char[] simbolos = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        
        if (numDecimal < 0) {
            numDecimal=numDecimal*-1;
            esNegativo = true;
        }

        while (numDecimal > 0) {
            resta = numDecimal % 16;
            numHexa = Character.toString(simbolos[resta]) + numHexa;
            numDecimal = numDecimal / 16;
        }
        return (esNegativo) ? "-" + numHexa : numHexa;        
    }
}
