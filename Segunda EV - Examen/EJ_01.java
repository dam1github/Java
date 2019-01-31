package ej_01;
import java.util.*;

public class EJ_01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Introduzca la primera cadena...");
		String $string1 = scan.nextLine();
		System.out.println("Introduzca la segunda cadena...");
		String $string2 = scan.nextLine();
		System.out.println("Introduzca la tercera cadena...");
		String $string3 = scan.nextLine();
		
		// Apartado 1... Decir cual es la palabra mas grande de las tres
		if($string1.length() > $string2.length() && $string1.length() > $string3.length())
			System.out.println("La cadena \"" + $string1 + "\" es la mas grande de las tres.");
		else if($string2.length() > $string1.length() && $string2.length() > $string3.length())
			System.out.println("La cadena \"" + $string2 + "\" es la mas grande de las tres.");
		else if($string3.length() > $string1.length() && $string3.length() > $string2.length())
			System.out.println("La cadena \"" + $string3 + "\" es la mas grande de las tres.");
		
		// Apartado 2... Decir cual es la palabra mas pequeña de las tres
		if($string1.length() < $string2.length() && $string1.length() < $string3.length())
			System.out.println("La cadena \"" + $string1 + "\" es la mas pequeña de las tres.");
		else if($string2.length() < $string1.length() && $string2.length() < $string3.length())
			System.out.println("La cadena \"" + $string2 + "\" es la mas pequeña de las tres.");
		else if($string3.length() < $string1.length() && $string3.length() < $string2.length())
			System.out.println("La cadena \"" + $string3 + "\" es la mas pequeña de las tres.");
		
		// Apartado 3... Imprimir solo las palabras que tengan mas de 10 caracteres
		int stringWithMoreThanTenChars = 0;
		if($string1.length() > 10) {
			System.out.println($string1);
			stringWithMoreThanTenChars++;
		}
		if($string2.length() > 10) {
			System.out.println($string2);
			stringWithMoreThanTenChars++;
		}
		if($string3.length() > 10) {
			System.out.println($string3);
			stringWithMoreThanTenChars++;
		}
		
		// Apartado 4... Decir cuantas palabras de mas de 10 caracteres hay
		System.out.println("Hay " + stringWithMoreThanTenChars + " palabras con mas de 10 caracteres");
	}
}