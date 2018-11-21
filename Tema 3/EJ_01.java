package ej_1;
import java.util.*;

public class EJ_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Introduzca una nota");
		int nota = scan.nextInt();
		
		if(nota > 10) {
			System.out.println("Has introducido una nota mayor que 10");
		} else if(nota == 10) {
			System.out.println("La nota es igual a 10");
		} else {
			System.out.println("La nota es menor que diez");
		}
	}
}
