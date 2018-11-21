package ej_8;
import java.util.*;

public class EJ_8 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Introduzca un año...");
		int ano = scan.nextInt();
		
		if((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0) {
			System.out.println("El año introducido es: " + ano + ", este año es bisiesto");
		} else {
			System.out.println("El año introducido es: " + ano + ", este año no es bisiesto");
		}
	}
}
