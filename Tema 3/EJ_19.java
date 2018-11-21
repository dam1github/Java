package ej_19;
import java.util.*;

public class EJ_19 {
	public static void main(String[] args) {
		double child_age, child_height, total_age = 0, total_height = 0;
		int over_18 = 0, over_175 = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("How many do you want to input?");
		int input_limit = scan.nextInt();
		
		for(int i = 1; i <= input_limit; i++) {
			System.out.println("What's the age of the child number " + i + "?");
			child_age = scan.nextInt();
			total_age += child_age;
			
			if(child_age >= 18)
				over_18++;
			
			System.out.println("What's the height of the child number " + i + "?");
			child_height = scan.nextDouble();
			total_height += child_height;
			
			if(child_height > 1.75)
				over_175++;
		}
		System.out.println("The average age is: " + (total_age / input_limit));
		System.out.println("The average height is: " + (total_height / input_limit));
		System.out.println("People that are over 18: " + over_18);
		System.out.println("People that are over 1.75 meters tall: " + over_175);
	}
}