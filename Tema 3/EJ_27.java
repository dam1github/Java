package ej_27;
import java.util.*;

public class EJ_27 {
	public static void main(String[] args) {
		System.out.println("Introduzca un numero...");
		int num = pedir_Numero();
		calcular_primo(num);
	}
	
	public static int pedir_Numero() {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		return num;
	}
	
	public static void calcular_primo(int num) {
		if(num == 0) {
			System.out.println("No se puede dividir entre 0");
		} else if(num == 1) {
			System.out.println("El numero 1 no es primo");
		} else if(num == 2) {
			System.out.println("El numero 2 es primo");
		} else {
			for(int i = 2; i < num; i++) {
				if(num % i == 0) {
					System.out.println("El numero " + num + " no es primo, es divisible entre " + i);
					i = num;
				}
				if(i == num - 1) {
					System.out.println("El numero " + num + " es primo");
				}
			}
		}
	}
}