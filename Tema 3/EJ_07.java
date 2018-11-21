package ej_7;
import java.util.Scanner;

public class EJ_7 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Elija una opcion...");
		System.out.println("1.- Nota media");
		System.out.println("2.- Area de un circulo");
		System.out.println("3.- Salir");
		
		int opt = scan.nextInt();
		switch(opt) {
			case 1:
				nota_media();
				break;
			case 2:
				area_circulo();
				break;
			case 3:
				System.out.println("Ha salido correctamente");
				break;
		}
	}
	
	public static void nota_media() {
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
	
	public static void area_circulo() {
		double pi = 3.1416;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Introduce el radio del circulo para calcular el area");
		double circle_radius = scan.nextDouble();
		
		while(circle_radius < 0) {
			System.out.println("El radio tiene que ser mayor que 0");
			circle_radius = scan.nextDouble();
		}
		
		/*	La formula del area del circulo es: (A = pi * r^2);
		*	tenemos que calcular el cuadrado del radio
		*	como dice el profesor
		*/
		double power_radius = circle_radius * circle_radius;
		
		double circle_area = pi * power_radius;
		System.out.println("El Area del circulo es: " + circle_area);
	}
}
