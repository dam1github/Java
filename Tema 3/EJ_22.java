package ej_22;
import java.util.*;

public class EJ_22 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Type a number...");
		int factorial = scan.nextInt(), temp_var = factorial;
		
		if(factorial == 0 || factorial == 1) {
			System.out.println("Result: 1");
		} else {
			for(int i = factorial; i > 1; i--) {
				temp_var *= i - 1;
			}	System.out.println("Result: " + temp_var);
		}
	}
}