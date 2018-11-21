package ej_17;
import java.util.*;

public class EJ_17 {
	public static void main(String[] args) {
		int num, num_sum = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("How many numbers do you want to enter?");
		int input_limit = scan.nextInt();
		
		for(int i = 0; i < input_limit; i++) {
			System.out.println("Type a number...");
			num = scan.nextInt();
			num_sum += num;
		}
		System.out.println("The sum of the numbers is: " + num_sum);
	}
}