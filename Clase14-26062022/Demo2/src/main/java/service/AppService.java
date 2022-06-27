package service;

public class AppService {
	public long factorial(int n) {
		long f = 1;
		while (n > 0) {
			f *= n--;
		}
		return f;
	}

	public int promediar(int num1, int num2, int num3) {
		int prom = (num1 + num2 + num3)/3;
		return prom;
	}
}
