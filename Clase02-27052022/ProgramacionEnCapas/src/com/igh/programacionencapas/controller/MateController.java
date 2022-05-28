package com.igh.programacionencapas.controller;

import com.igh.programacionencapas.service.MateService;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware
 * @cursos gcoronelc.github.io
 */
public class MateController {

	private MateService mateService;

	public MateController() {
		mateService = new MateService();
	}

	public int sumar(int num1, int num2) {
		return mateService.sumar(num1, num2);
	}

	public int multiplicar(int num1, int num2) {
		return mateService.multiplicar(num1, num2);
	}
}
