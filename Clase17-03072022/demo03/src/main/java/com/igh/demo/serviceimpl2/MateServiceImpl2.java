package com.igh.demo.serviceimpl2;

import java.util.Arrays;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.igh.demo.service.MateServiceSpec;

@Service
public class MateServiceImpl2  implements MateServiceSpec{

	@PostConstruct
	public void initBean() {
		System.out.println("Bean 2 creado.");
	}
	
	@Override
	public int promediar(int nota1, int nota2, int nota3) {
		int[] arreglo = {nota1, nota2, nota3};
		Arrays.sort(arreglo);
		int pr = (nota1 + nota2 + nota3 - arreglo[0]) / 2;
		return pr;
	}

}
