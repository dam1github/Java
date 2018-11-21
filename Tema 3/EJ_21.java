package ej_21;
import java.util.*;

public class EJ_21 {
	public static void main(String[] args) {
		int dividend, divisor, quotient = 0, remainder;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Type the dividend");
		dividend = scan.nextInt();
		System.out.println("Type the divisor");
		divisor = scan.nextInt();
		
		// Quotient
		for(int i = 0; i <= dividend - divisor; i += divisor) {
			quotient++;
		}
		
		// Remainder
		remainder = dividend - (quotient * divisor);
		
		System.out.println("Quotient: " + quotient);
		System.out.println("Remainder: " + remainder);
	}
}