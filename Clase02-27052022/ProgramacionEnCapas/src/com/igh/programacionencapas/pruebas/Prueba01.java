package com.igh.programacionencapas.pruebas;

import com.igh.programacionencapas.service.MateService;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware
 * @cursos gcoronelc.github.io
 */
public class Prueba01 {

	public static void main(String[] args) {
		// Variables
		int num1, num2, suma;
		// Datos
		num1 = 67;
		num2 = 30;
		// Proceso
		MateService mateService = new MateService();
		suma = mateService.sumar(num1, num2);
		// Reporte
		System.out.println("Suma: " + suma);
	}

}
