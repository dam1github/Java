package ej_11_char;
import java.util.Scanner;

public class EJ_11_Char {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduzca S para sumar o R para restar");
		char plus_minus = scan.next().charAt(0);
		
		while(plus_minus != 's' && plus_minus != 'S' && plus_minus != 'r' && plus_minus != 'R') {
			System.out.println("Introduzca S para sumar o R para restar");
			plus_minus = scan.next().charAt(0);
		}
		
		System.out.println("Introduzca un numero...");
		double num_1 = scan.nextInt();
		System.out.println("Introduzca otro numero...");
		double num_2 = scan.nextInt();
		
		if(plus_minus == 's' || plus_minus == 'S') {
			System.out.println(num_1 + "+" + num_2 + " = " + (num_1 + num_2));
		} else if(plus_minus == 'r' || plus_minus == 'R') {
			System.out.println(num_1 + "-" + num_2 + " = " + (num_1 - num_2));
		}
	}
}