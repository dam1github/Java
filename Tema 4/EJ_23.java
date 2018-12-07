package ej_23;
import java.util.*;

public class EJ_23 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduzca una cadena...");
		String text  = scan.nextLine();
		
		System.out.println("¿De que posicion a que posicion quiere quitar?");
		System.out.println("Introduzca el primer valor...");
		int removeFrom = scan.nextInt();
		
		System.out.println("Introduzca el segundo valor...");
		int removeUntil = scan.nextInt();
		
		while(removeFrom > removeUntil) {
			System.out.println("El primer valor tiene que ser menor que el segundo.");
			System.out.println("Introduzca el primer valor...");
			removeFrom = scan.nextInt();
			System.out.println("Introduzca el segundo valor...");
			removeUntil = scan.nextInt();
		}
		String textPrint = text.substring(0, removeFrom) + text.substring(removeUntil + 1);
		System.out.println(textPrint);
	}
}