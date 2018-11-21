package ej_23;
import java.util.*;

public class EJ_23 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Type a mark...");
		double nota = scan.nextDouble();
		
		char calificacion = obtener_calificacion(nota); // calificacion sera igual a 's', 'a' o 'e'; Esto lo obtenemos del metodo obtener_calificacion a traves de return;
		System.out.println("The mark is: " + calificacion);
	}
	public static char obtener_calificacion(double nota) {
		if(nota >= 0 && nota < 5) {
			return 'S';
		} else if(nota >= 5 && nota <= 10) {
			return 'A';
		} else {
			return 'E';
		}
	}
}