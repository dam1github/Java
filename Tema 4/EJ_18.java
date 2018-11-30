package ej_18;
import java.util.*;

public class EJ_18 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduzca una cadena...");
		String text = scan.nextLine();
		
		System.out.println("La primera letra de la cadena es: " + text.charAt(0));
	}
}