package ej_25;
import java.util.*;

public class EJ_25 {
	public static void main(String[] args) {
		int num = pedir_Numero();
		int num_print = calcular_factorial(num);
		System.out.println("Factorial de " + num + ": " + num_print);
	}
	public static int pedir_Numero() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Type a number...");
		int num = scan.nextInt();
		return num;
	}
	public static int calcular_factorial(int factorial) {
		int temp_var = factorial;

		if(factorial == 0) {
			temp_var = 0;
		} else if(factorial == 1) {
			temp_var = 1;
		} else {
			for(int i = factorial; i > 1; i--) {
				temp_var *= i - 1;
			}
		}
		return temp_var;
	}
}