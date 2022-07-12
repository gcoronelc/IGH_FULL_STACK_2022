package com.junit;

public class Grado {
	
	public char determineLetterGrade(int gradoNumero) {
		if(gradoNumero<0) {
			throw new IllegalArgumentException("Grado invalido");
		}else if(gradoNumero<60) {
			return 'F';
		}else if(gradoNumero<70) {
			return 'D';
			
		}else if(gradoNumero<80) {
			return 'C';
		}else if(gradoNumero<90) {
			return 'B';
		}else {
			return 'A';
		}
		
	}
}
