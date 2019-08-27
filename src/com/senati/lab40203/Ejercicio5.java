package com.senati.lab40203;
import java.util.Scanner;
public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double d1=0.1;
		double d2=0.05;
		double d3=0.03;
		int sueldo;
		
		
		System.out.println("------Bienvenido------");
		Scanner sueldo1 = new Scanner(System.in);
		System.out.print("\n Ingrese su sueldo: ");
		double n = sueldo1.nextDouble();
		System.out.println("Se le haran tres descuentos a su sueldo");
		System.out.println("Gobierno = "+n*d1);
		System.out.println("Seguro   = "+n*d2);
		System.out.println("Pobreza  = "+n*d3);
		double n1=n*d1;
		double n2=n*d2;
		double n3=n*d3;
		System.out.println("Su sueldo neto sera de: "+(n-(n1+n2+n3)));
	
	}

}
