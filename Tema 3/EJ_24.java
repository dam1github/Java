package ej_24;
import java.util.*;

public class EJ_24 {
	public static void main(String[] args) {
		int num_print = sumaEntero();
		System.out.println("Sum of the 10 numbers: " + num_print);
	}
	public static int sumaEntero() {
		int num_sum = 0, num;
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Type a number...");
			num = scan.nextInt();
			num_sum += num;
		}	return num_sum;
	}
}