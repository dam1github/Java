package ej_19;
import java.util.*;

public class EJ_19 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduzca una cadena...");
		String text = scan.nextLine();
		
		System.out.println("Introduzca otra cadena...");
		String text_2 = scan.nextLine();
		
		if(text.compareTo(text_2) == 0)
			System.out.println("Las cadenas son iguales");
		else if(text.compareTo(text_2) > 0) 
			System.out.println("La cadena (" + text + ") es mayor que la cadena (" + text_2 + ")");
		else if(text.compareTo(text_2) < 0)
			System.out.println("La cadena (" + text_2 + ") es mayor que la cadena (" + text + ")");
	}
}