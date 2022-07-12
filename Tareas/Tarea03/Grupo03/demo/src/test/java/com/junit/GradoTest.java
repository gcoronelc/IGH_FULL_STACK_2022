package com.junit;

import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GradoTest {

	@Test
	void validarGradoF() {
		Grado grado= new Grado();
		assertEquals('F', grado.determineLetterGrade(59));
		
	}
	
	@Test
	void validarGradoD() {
		Grado grado = new Grado();
		assertEquals('D', grado.determineLetterGrade(69));
	}
	@Test
	void validarGradoInvalido() {
		Grado grado = new Grado();
		Exception e= assertThrows(IllegalArgumentException.class,()->grado.determineLetterGrade(-1));

		
		
		assertEquals("Grado invalido", e.getMessage());
	}
	
	@Test
	void validarGradoC() {
		Grado grado = new Grado();
		assertEquals('C', grado.determineLetterGrade(79));
		
	}
	
	
	@Test
	void validarGradoB() {
		Grado grado = new Grado();
		assertEquals('B', grado.determineLetterGrade(89));
	}
	@Test
	void validarGradoA() {
		Grado grado = new Grado();
		assertEquals('A', grado.determineLetterGrade(100));
	}
}
