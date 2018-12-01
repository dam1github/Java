package ej_20;
import java.util.*;

public class EJ_20 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduzca una cadena...");
		String text = scan.nextLine();
		
		System.out.println("Introduzca otra cadena...");
		String text_2 = scan.nextLine();
		
		if(text.equals(text_2))
			System.out.println("Las cadenas son iguales");
		else
			System.out.println("Las cadenas no son iguales");
	}
}