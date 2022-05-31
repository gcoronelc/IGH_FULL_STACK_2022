
package com.igh.proyecto2.controller;

import com.igh.proyecto2.service.HexaService;
/*
 * AUTOR: ABAD MENDIZABAL ALESSANDRA ANGELA
 * Desarrollar un programa para convertir un número de base 10 a base 16.
 */
public class HexaController {

	private final HexaService hexaService;

	public HexaController() {
		hexaService = new HexaService();
	}

	public String convertirHex(int numDecimal) {
		return hexaService.convertirHex(numDecimal);
	}    
}
