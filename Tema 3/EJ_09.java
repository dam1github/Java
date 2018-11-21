package ej_9;

import java.util.Scanner;

public class EJ_9 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduzca un numero...");
		
		int num = scan.nextInt();
		if(num % 2 == 0) {
			System.out.println("El numero " + num + " es par");
		} else {
			System.out.println("El numero " + num + " es impar");
		}
	}
}