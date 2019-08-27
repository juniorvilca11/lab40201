package com.senati.lab40201;
import java.util.Scanner;
public class TestNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Numero Onum = new Numero();
			Scanner Leer = new Scanner(System.in);
			System.out.print("\n Ingrese el numero: ");
			double n = Leer.nextDouble();
			Onum.Num = n;
			System.out.print(""+Onum.Primo());
			System.out.print(""+Onum.Perfecto());
			System.out.print("Factorial "+Onum.Factorial());
		}catch (Exception ex) {
			
		}
	}

}
