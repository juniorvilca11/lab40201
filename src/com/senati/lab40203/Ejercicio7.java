package com.senati.lab40203;
import java.util.Scanner;
public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.out.println(" Bienvenido");
		System.out.println(" Ingrese sus notas");
		System.out.println(" -----------------");
		
		Scanner nota1 = new Scanner(System.in);
		System.out.print("\n Nota 1: ");
		double n1 = nota1.nextDouble();
		Scanner nota2 = new Scanner(System.in);
		System.out.print(" Nota 2: ");
		double n2 = nota2.nextDouble();
		Scanner nota3 = new Scanner(System.in);
		System.out.print(" Nota 3: ");
		double n3 = nota3.nextDouble();
		Scanner nota4 = new Scanner(System.in);
		System.out.print(" Nota 4: ");
		double n4 = nota4.nextDouble();
		
		
		
		if(n1<n2 && n1<n3 && n1<n4){
			System.out.println("Su promedio es: "+((n2+n3+n4)/3));
		}else if(n2<n1 && n2<n3 && n2<n4) {
			System.out.println("Su promedio es: "+((n1+n3+n4)/3));
		}else if(n3<n1 && n3<n2 && n3<n4) {
			System.out.println("Su promedio es: "+((n1+n2+n4)/3));
		}else {
			System.out.println("Su promedio es: "+((n1+n2+n3)/3));
		}
		
		
	}

}
