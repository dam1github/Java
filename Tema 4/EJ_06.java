package ej_06;
import java.util.*;

public class EJ_06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("¿Cual quiere que sea el tamaño del array?");
		int arraySize = scan.nextInt();
		boolean gotIt = false;
		int[] EJ_06_Array = new int[arraySize];
		
		for(int i = 0; i < EJ_06_Array.length; i++) {
			EJ_06_Array[i] = (int)(Math.random() * 10) + 1;
		}
		
		System.out.println("¿Que valor quiere buscar?");
		int numToLookFor = scan.nextInt();
		
		for(int j = 0; j < EJ_06_Array.length; j++) {
			if(numToLookFor == EJ_06_Array[j]) {
				gotIt = true;
				j = EJ_06_Array.length;
			}
		}
		
		System.out.println("Array: " + Arrays.toString(EJ_06_Array));
		if(gotIt) {
			System.out.println("He encontrado el numero " + numToLookFor + " en el array");
		} else {
			System.out.println("El numero " + numToLookFor + " no se encuentra en el array");
		}
	}
}