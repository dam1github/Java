package ej_errorfixing;
import java.util.*;

public class EJ_ErrorFixing {
	public static void main(String[] args) {
		/**
		 * We request the client to send us an int, but for some reason, he sends us any other character that is not a number.
		 * We will fix the error in this excercise.
		 */
		
		System.out.print("Please enter an integer -> ");
		String clientInput = scanString();
		
		System.out.println(clientInput.replaceAll("[^0-9]+", ""));
	}
	
	public static String scanString() {
		return new Scanner(System.in).nextLine();
	}
}