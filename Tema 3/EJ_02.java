package ej_2;
import java.util.*;

public class EJ_2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduzca el primer numero...");
		int num_1 = scan.nextInt();
		
		System.out.println("Introduzca el segundo numero...");
		int num_2 = scan.nextInt();
		
		if(num_1 > num_2) {
			System.out.println("El numero " + num_1 + " es mayor que " + num_2);
		} else if (num_1 < num_2) {
			System.out.println("El numero " + num_2 + " es mayor que " + num_1);
		} else { // o else if(num_1 == num_2)
			System.out.println(num_1 + " = " + num_2 + "; Ambos numeros son iguales");
		}
	}
}
