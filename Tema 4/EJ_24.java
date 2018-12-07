package ej_24;
import java.util.*;

public class EJ_24 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduzca una cadena...");
		String text  = scan.nextLine();
		
		System.out.println("Introduzca el caracter que quiera buscar...");
		String toLookFor = scan.nextLine();
		
		int timesFound = 0;
		for(int i = 0; i < text.length(); i++)
			if(toLookFor.equals(String.valueOf(text.charAt(i))))
				timesFound++;
		
		System.out.println("He encontrado \"" + toLookFor + "\" " + timesFound + " veces");
	}
}