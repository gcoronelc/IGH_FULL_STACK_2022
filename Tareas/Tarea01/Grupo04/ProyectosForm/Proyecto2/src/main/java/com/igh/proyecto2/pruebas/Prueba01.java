
package com.igh.proyecto2.pruebas;

import com.igh.proyecto2.service.HexaService;
/*
 * AUTOR: ABAD MENDIZABAL ALESSANDRA ANGELA
 */
public class Prueba01 {

    	public static void main(String[] args) {
		// Variables
		int numDecimal;
                String numHexa;
		// Datos
		numDecimal = 67545;		
		// Proceso
		HexaService hexaService = new HexaService();
		numHexa = hexaService.convertirHex(numDecimal);
		// Reporte
		System.out.println("Número convertido a hexadecimal: " + numHexa);
	}    
}
