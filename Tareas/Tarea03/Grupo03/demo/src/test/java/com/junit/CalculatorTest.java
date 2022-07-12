package com.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	
	@Test
	void dosMasDosEqualCuatro() {
		Calculator calculator = new Calculator();
		
		int numero1 = 2;
		int numero2 = 2;
	
		
		int result  =calculator.add(numero1, numero2);
		
		assertEquals(4, result);
	}
	@Test
	void tresMasSieteEqualDiez() {
		Calculator calculator = new Calculator();
		
		int numero1 = 3;
		int numero2 = 7;
	
		
		int result  =calculator.add(numero1, numero2);
		
		assertEquals(10, result);
	}
	
}
