package ej_3;
import java.util.*;

public class EJ_3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduzca el primer numero...");
		int num_1 = scan.nextInt();
		
		System.out.println("Introduzca el segundo numero...");
		int num_2 = scan.nextInt();
		
		System.out.println("Introduzca el tercer numero...");
		int num_3 = scan.nextInt();
		
		// Los simbolos "&&" significan "y"
		// Los simbolos "||" significan "o" 
		
		if(num_1 > num_2 && num_1 > num_3) {
			System.out.println("El numero " + num_1 + " es mayor que " + num_2 + " y " + num_3);
			System.out.println(num_1 + ">" + num_2);
			System.out.println(num_1 + ">" + num_3);
		} else if(num_2 > num_1 && num_2 > num_3) {
			System.out.println("El numero " + num_2 + " es mayor que " + num_1 + " y " + num_3);
			System.out.println(num_2 + ">" + num_1);
			System.out.println(num_2 + ">" + num_3);
		} else if(num_3 > num_1 && num_3 > num_2) {													// Aqui nos podemos ahorra todo esto y usar simplemente un else,
			System.out.println("El numero " + num_3 + " es mayor que " + num_1 + " y " + num_2);	// pero lo he hecho asi para que se entienda lo que haria un else en este caso
			System.out.println(num_3 + ">" + num_1);
			System.out.println(num_3 + ">" + num_2);
		}
	}
}
