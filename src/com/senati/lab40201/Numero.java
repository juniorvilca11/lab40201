package com.senati.lab40201;

public class Numero {
	public double Num;

	public Numero() {
		super();
	}
	
	public Numero(double num) {
		super();
		Num = num;
	}

	public String Primo() {
		String men;
		int a=0;
		for(double i=1;i<=Num;i++) {
			if(Num % i == 0) {
				a++;
			}
		}
		if(a==2) {
			men="Numero es primo ";
		}else {
			men="Numero no es primo ";
		}
		return men;
	}
	public String Perfecto() {
		String men;
		double a=0;
		for(double i=1;i<=Num;i++) {
			if(Num % i == 0) {
				a = a+i;
			}
		}
		if(a==Num) {
			men="Numero es perfecto ";
		}else {
			men="Numero no es perfecto ";
		}
		return men;
	}
	public double Factorial() {
		double fac=1;
		while (Num !=0) {
			fac = fac*Num;
			Num--;
		}
		return fac;
	}
	
}
