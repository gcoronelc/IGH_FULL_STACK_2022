package com.igh.demo;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.igh.demo.service.MateServiceSpec;

@SpringBootApplication
public class Demo03Application implements CommandLineRunner	{
	
	@Autowired
	@Resource(name="mateServiceImpl2")
	private MateServiceSpec mateService;

	public static void main(String[] args) {
		SpringApplication.run(Demo03Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("(10,12,14) = " + mateService.promediar(10, 12, 14));
	}

}
