package ej_17;
import java.util.*;

public class EJ_17 {
	public static void main(String[] args) {
		// hello there little fella hello there little fella hello there little fella
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduzca una cadena...");
		String text = scan.nextLine(), textArray[] = text.split(" ");
		
		System.out.println("Introduzca lo que quiere buscar...");
		String toLookFor = scan.nextLine();
		
		int j = 0;
		for(int i = 0; i < textArray.length; i++)
			if(textArray[i].equalsIgnoreCase(toLookFor))
				j++;
		
		System.out.println(Arrays.toString(textArray));
		System.out.println("I found " + toLookFor + " " + j + " times");
	}
}