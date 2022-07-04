package com.igh.demo.service.impl1;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.igh.demo.service.MateServiceSpec;

@Service
public class MateServiceImpl1  implements MateServiceSpec{
	
	@PostConstruct
	public void initBean() {
		System.out.println("Bean 1 creado.");
	}

	@Override
	public int promediar(int nota1, int nota2, int nota3) {
		int pr = (nota1 + nota2 + nota3) / 3;
		return pr;
	}
	
	
}
