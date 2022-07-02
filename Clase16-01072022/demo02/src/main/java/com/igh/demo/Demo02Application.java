package com.igh.demo;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.igh.demo.service.MateService;
import com.igh.demo.service.NotasService;

@SpringBootApplication
public class Demo02Application implements CommandLineRunner{

	
	private MateService mateService;
	
	@Inject
	private NotasService notasService;
	
	public static void main(String[] args) {
		SpringApplication.run(Demo02Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("5 + 4 = " + mateService.sumar(5, 4));
		System.out.println("Promedio: " + notasService.calcPromedio(15,18,20));
	}

	@Autowired
	public void setMateService(MateService mateService) {
		this.mateService = mateService;
	}
}
