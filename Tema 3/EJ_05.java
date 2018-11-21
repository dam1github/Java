package ej_5;
import java.util.*;

public class EJ_5 {
	public static void main(String[] args) {
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
