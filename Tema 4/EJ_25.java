package ej_25;
import java.util.*;

public class EJ_25 {
	public static void main(String[] args) {
		// Solo buscar con espacios, suponemos que la persona escribe correctamente.
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduzca una cadena...");
		String text  = scan.nextLine();
		String toLookFor = " ";
		
		int wordCount = 1;
		for(int i = 0; i < text.length(); i++)
			if(toLookFor.equals(String.valueOf(text.charAt(i))) && i < text.length() - 1) // i < text.length() - 1, esto se pone para que no cuente si hay un espacio al final...
				wordCount++;
		System.out.println(wordCount);
	}
}