package com.senati.lab40203;
import java.util.Scanner;
public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Leer1 = new Scanner(System.in);
		System.out.print("\n Ingrese x: ");
		double n = Leer1.nextDouble();
		Scanner Leer2 = new Scanner(System.in);
		System.out.print("\n Ingrese y: ");
		double m = Leer2.nextDouble();
		System.out.println(" --------------");
		System.out.println(" X="+n+" y Y="+m);
		System.out.println(" Ahora cambiaran de lugar");
		System.out.println(" X="+m+" y Y="+n);
	}

}
