package ej_02;
import java.util.*;

public class EJ_02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int canastas[] = new int[10];
		
		// Apartado 1. Introducir las canastas de los jugadores
		for(int i = 0; i < canastas.length; i++) {
			System.out.println("Introduzca las canastas del jugador " + (i + 1));
			try {
				canastas[i] = scan.nextInt();
				while(canastas[i] < 0) {
					System.out.println("El numero tiene que ser 0 o mayor");
					canastas[i] = scan.nextInt();
				}
			} catch (Exception e) {
				System.out.println("Introduzca solo numeros enteros. Vuelva a empezar.");
				return;
			}
		}
		
		// Apartado 2. Imprimir por pantalla las canastas de los 10 jugadores
		for(int j = 0; j < canastas.length; j++)
			System.out.println("Jugador " + (j) + " | Canastas: " + canastas[j]);
		
		// Apartado 3. Imprimir las canastas de los jugadores entre determinadas posiciones (ambas incluidas)
		int minRange = 0, maxRange = 0; // Lo he inicializado a cero simplemente para que no me lo subraye en rojo. Se le da un valor en el try-catch.
		try {
			System.out.println("Desde que posicion quiere buscar?");
			minRange = scan.nextInt();
			while(minRange < 0 || minRange > canastas.length) {
				System.out.println("Tiene que estar comprendido entre 0 y " + (canastas.length - 1));
				minRange = scan.nextInt();
			}
			
			System.out.println("Hasta que posicion quiere buscar?");
			maxRange = scan.nextInt();
			while(maxRange < 0 || maxRange > canastas.length) {
				System.out.println("Tiene que estar comprendido entre 0 y " + (canastas.length - 1));
				maxRange = scan.nextInt();
			}
		} catch (Exception e) {
				System.out.println("Introduzca solo numeros enteros. Vuelva a empezar.");
				return;
		}
		String separator = "";
		
		for(int k = minRange; k <= maxRange; k++) {
			if(k == maxRange)
				separator = "\n";
			else
				separator = "-";
			
			System.out.print(canastas[k] + separator);
		}
		
		// Apartado 4. Ranking de los 5 mejores jugadores, duplicamos el array canastas y lo ordenamos
		int canastas2[] = canastas;
		int temp;
		for(int l = 0; l < canastas2.length - 1; l++) {
			for(int m = 0; m < canastas2.length - l - 1; m++) {
				if(canastas2[m + 1] > canastas2[m]) {
					temp = canastas2[m];
					canastas2[m] = canastas2[m + 1];
					canastas2[m + 1] = temp;
				}
			}
		}
		// Imprimimos mediante un loop
		for(int n = 0; n < 5; n++)
			System.out.println("Jugador " + n + " | Canastas: " + canastas2[n]);
		
		// Apartado 5. Decir si todas son multiplo de 4 o no
		boolean isMultiple = true;
		for(int o = 0; o < canastas.length; o++) {
			if(canastas[o] % 4 != 0) {
				isMultiple = false;
				break;
			}
		}
		if(isMultiple)
			System.out.println("Todas son multiplos de 4");
		else
			System.out.println("Alguna o ninguna canasta es multiplo de 4");
	}
}