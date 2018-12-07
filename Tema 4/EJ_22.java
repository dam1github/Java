package ej_22;
import java.util.*;

public class EJ_22 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduzca una cadena...");
		String text  = scan.nextLine();

		System.out.println("¿Que letra quiere buscar?");
		String toLookFor = scan.nextLine();

		int lastPos = text.lastIndexOf(toLookFor);
		if(lastPos == -1)
			System.out.println("No he encontrado \"" + toLookFor + "\" en la cadena");
		else
			System.out.println("La ultima posicion de \"" + toLookFor + "\" es: " + lastPos);
	}
}