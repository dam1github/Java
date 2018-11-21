package ej_01;
import java.util.*;

public class EJ_01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("¿Cual quiere que sea el tamaño del array?");
		
		int arraySize = scan.nextInt();
		
		int[] EJ_01_Array = new int[arraySize];
		
		for(int i = 0; i < EJ_01_Array.length; i++) {
			EJ_01_Array[i] = 0;
		}
		System.out.println("Array: " + Arrays.toString(EJ_01_Array));
	}
}