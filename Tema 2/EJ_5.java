package ej_5;
import java.util.*;

public class EJ_5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Introduce el primer numero...");
		int num_1 = scan.nextInt();
		
		System.out.println("Introduce el segundo numero...");
		int num_2 = scan.nextInt();
		
		System.out.println(num_1 + "+" + num_2 + " = " + (num_1 + num_2));
		System.out.println(num_1 + "-" + num_2 + " = " + (num_1 - num_2));
		System.out.println(num_1 + "x" + num_2 + " = " + (num_1 * num_2));
		if(num_2 != 0) {
			System.out.println(num_1 + "/" + num_2 + " = " + (num_1 / num_2));
		} else {
			System.out.println("No podemos dividir un numero entre 0 ;)");
		}
	}
}
