package com.igh.aplica01.service;

public class AppService {
	
	public long factorial(int n) {
		long f = 1;
		while(n>0) {
			f *= n--;
		}
		return f;
	}

}
