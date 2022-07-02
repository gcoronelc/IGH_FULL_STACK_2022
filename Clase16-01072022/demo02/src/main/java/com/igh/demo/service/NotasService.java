package com.igh.demo.service;

import javax.inject.Named;

@Named
public class NotasService {

	public int calcPromedio(int nota1, int nota2, int nota3) {
		int pr = (nota1 + nota2 + nota3) / 3;
		return pr;
	}

}
