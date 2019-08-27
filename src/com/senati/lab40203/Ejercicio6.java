package com.senati.lab40203;
import java.util.Scanner;
public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double extra=0.40;
		
		System.out.println(" Compañia de alquiler de autos");
		System.out.println(" -----------------------------");
		Scanner dias = new Scanner(System.in);
		System.out.print("\n Cuantos dias alquilara: ");
		double n = dias.nextDouble();
		Scanner kl = new Scanner(System.in);
		System.out.print("\n Cuantos kilometros recorrerá: ");
		double m = kl.nextDouble();
		
		System.out.println(" ---------------------");
		System.out.println(" Costo por dias: "+n*30);
		if(m>2000){
			System.out.println(" Pagara un extra de: "+m*extra);
		}else {
			System.out.println(" No pagas nada extra");
		}
	}

}
