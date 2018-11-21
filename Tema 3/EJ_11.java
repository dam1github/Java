package ej_11;

import java.util.Scanner;

public class EJ_11 {
	public static void main(String[] args) {
		String plus_minus;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduzca S para sumar o R para restar");
		plus_minus = scan.next();
		
		while(!plus_minus.equalsIgnoreCase("s") && !plus_minus.equalsIgnoreCase("r")) {
			System.out.println("Introduzca S para sumar o R para restar");
			plus_minus = scan.next();
		}
		
		System.out.println("Introduzca un numero...");
		double num_1 = scan.nextInt();
		System.out.println("Introduzca otro numero...");
		double num_2 = scan.nextInt();
		
		if(plus_minus.equalsIgnoreCase("s")) {
			System.out.println(num_1 + "+" + num_2 + " = " + (num_1 + num_2));
		} else if(plus_minus.equalsIgnoreCase("r")) {
			System.out.println(num_1 + "-" + num_2 + " = " + (num_1 - num_2));
		}
	}
}