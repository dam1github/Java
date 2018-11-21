package ej_16;
import java.util.*;

public class EJ_16 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Type a number...");
		int num_1 = scan.nextInt();
		System.out.println("Type another number...");
		int num_2 = scan.nextInt();
		
		if(num_1 < num_2) {
			for(int i = num_1 + 1; i < num_2; i++)
				System.out.print(i + " ");
			System.out.print("\n");
		} else if(num_1 > num_2) {
			for(int i = num_1 - 1; i > num_2; i--)
				System.out.print(i + " ");
			System.out.print("\n");
		} else
			System.out.println("There's no numbers in between each other, they're the same.");
	}
}