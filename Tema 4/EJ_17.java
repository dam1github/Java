package ej_17;
import java.util.*;

public class EJ_17 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduzca una cadena...");
		String text = scan.nextLine();
		
		System.out.println("Introduzca lo que quiere buscar...");
		String toLookFor = scan.nextLine();
		
		int timesFound = 0, textLength = text.length();
		for(int i = 0; i < textLength; i++) {
			if(text.indexOf(toLookFor) >= 0) {
				text = text.substring(text.indexOf(toLookFor) + toLookFor.length());
				timesFound++;
			} else
				continue;
		}	System.out.println("He encontrado \"" + toLookFor + "\" " + timesFound + " veces");
	}
}