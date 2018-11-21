package ej_6;
import java.util.*;

public class EJ_6 {
	public static void main(String[] args) {
		double nota_1, nota_2, nota_3;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Introduzca la nota del primer trimestre...");
		nota_1 = scan.nextDouble();
		while(nota_1 < 0 || nota_1 > 10) {
			System.out.println("La nota introducida tiene que ser mayor o igual que 0 y menor o igual que 10");
			nota_1 = scan.nextDouble();
		}
		
		System.out.println("Introduzca la nota del segundo trimestre...");
		nota_2 = scan.nextDouble();
		while(nota_2 < 0 || nota_2 > 10) {
			System.out.println("La nota introducida tiene que ser mayor o igual que 0 y menor o igual que 10");
			nota_2 = scan.nextDouble();
		}
		
		System.out.println("Introduzca la nota del tercer trimestre...");
		nota_3 = scan.nextDouble();
		while(nota_3 < 0 || nota_3 > 10) {
			System.out.println("La nota introducida tiene que ser mayor o igual que 0 y menor o igual que 10");
			nota_3 = scan.nextDouble();
		}
		
		System.out.println("Nota del primer trimestre: " + nota_1);
		System.out.println("Nota del segundo trimestre: " + nota_2);
		System.out.println("Nota del tercer trimestre: " + nota_3);
		double nota_media = (nota_1 + nota_2 + nota_3)/3;
		
		if(nota_1 < 5 || nota_2 < 5 || nota_3 < 5) {
			System.out.println("Alguna de las notas es menor que 5, no se puede calcular la media");
		} else {
			System.out.println("La nota media es: " + nota_media);
		}
	}
}
