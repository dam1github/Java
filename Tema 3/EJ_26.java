package ej_26;
import java.util.*;

public class EJ_26 {
	public static void main(String[] args) {
		int base, exponente;
		Scanner scan = new Scanner(System.in);

		System.out.println("Introduzca una base...");
		base = pedir_Numero();

		System.out.println("Introduzca un exponente...");
		exponente = pedir_Numero();

		while(exponente <= 0) {
			System.out.println("El exponente tiene que ser mayor que 0, porque no queremos dividir...");
			exponente = pedir_Numero();
		}

		int potencia = calcular_potencia(base, exponente);
		System.out.println("La potencia de " + base + " ^ " + exponente + " es: " + potencia);
	}
	
	public static int calcular_potencia(int base, int exponente) {
		int temp_base = 1;
		
		for(int i = 0; i < exponente; i++) {
			temp_base *= base;
		}
		return temp_base;
	}
	
	public static int pedir_Numero() {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		return num;
	}
}