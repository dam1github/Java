package ej_21;
import java.util.*;

public class EJ_21 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduzca una cadena...");
		String text = scan.nextLine();
		
		System.out.println("Introduzca lo que quiere buscar...");
		String toLookFor = scan.nextLine();
		
		if(text.lastIndexOf(toLookFor) == -1)
			System.out.println("No pude encontrar \"" + toLookFor + "\" en la cadena \"" + text + "\"");
		else
			System.out.println("\"" + toLookFor + "\" esta en la posicion " + text.lastIndexOf(toLookFor) + " de la cadena \"" + text + "\"");
	}
}