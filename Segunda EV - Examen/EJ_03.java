package ej_03;
import java.util.*;

public class EJ_03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String nombre[] = new String[5];
		int edad[] = new int[nombre.length]; // Para que tengan siempre la misma longitud
		
		// Apartado 1. Introduce el nombre de las personas
		for(int i = 0; i < nombre.length; i++) {
			System.out.println("Introduce el nombre de la persona " + i);
			nombre[i] = scan.nextLine();
		}
		
		// Apartado 2. Introduce la edad de las personas
		for(int j = 0; j < edad.length; j++) {
			System.out.println("Introduce la edad de " + nombre[j]);
			
			try {
				edad[j] = scan.nextInt();
			} catch (Exception e) {
				System.out.println("Introduzca solo numeros enteros. Comience de nuevo.");
				return;
			}
		}
		
		// Apartado 3. Imprimir el nombre de las personas
		for(int k = 0; k < nombre.length; k++)
			System.out.print(k + " (" + nombre[k] + ") ");
		System.out.println();
		
		// Apartado 4. Imprimir la edad de las personas
		for(int l = 0; l < edad.length; l++)
			System.out.print(l + " (" + edad[l] + ") ");
		System.out.println(); System.out.println();
		
		// Apartado 5. Imprimir a la vez el nombre y la edad
		for(int m = 0; m < nombre.length; m++)
			System.out.println("Persona: " + m + " " + nombre[m] + " " + edad[m] + " años.");
		System.out.println();
		
		// Apartado 6. Imprimir en consola las personas que son mayores de edad
		for(int n = 0; n < edad.length; n++)
			if(edad[n] >= 18)
				System.out.println("Persona: " + n + " " + nombre[n] + " " + edad[n] + " años.");
			
		System.out.println();
		
		// Apartado 7. Imprimir por consola las personas que son menores de edad
		for(int o = 0; o < edad.length; o++)
			if(edad[o] < 18)
				System.out.println("Persona: " + o + " " + nombre[o] + " " + edad[o] + " años.");
			
		
	}
}