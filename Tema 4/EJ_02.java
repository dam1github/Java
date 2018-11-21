package ej_02;
import java.util.*;

public class EJ_02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("¿Cual quiere que sea el tamaño del array?");
		
		int arraySize = scan.nextInt();
		
		int[] EJ_02_Array = new int[arraySize];
		
		for(int i = 0; i < EJ_02_Array.length; i++) {
			EJ_02_Array[i] = i + 1;
		}
		System.out.println("Array: " + Arrays.toString(EJ_02_Array));
	}
}