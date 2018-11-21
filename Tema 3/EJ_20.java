package ej_20;
import java.util.*;

public class EJ_20 {
	public static void main(String[] args) {
		int num_loop, read_limit = 5, even = 0, uneven = 0, zero = 0;
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < read_limit; i++) {
			System.out.println("Type a number...");
			num_loop = scan.nextInt();
			
			if(num_loop % 2 == 0) {
				even++;
			} else if(num_loop % 2 != 0) {
				uneven++;
			}
			if(num_loop == 0) {
				zero++;
			}
		}
		System.out.println("Even numbers: " + even);
		System.out.println("Uneven numbers: " + uneven);
		System.out.println("Zeroed numbers: " + zero);
	}
}