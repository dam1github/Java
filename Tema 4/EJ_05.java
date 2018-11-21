package ej_05;
import java.util.*;

public class EJ_05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("¿Cual quiere que sea el tamaño del array?");
		int arraySize = scan.nextInt();
		int[] EJ_05_Array_1 = new int[arraySize];
		int[] EJ_05_Array_2 = new int[arraySize];
		int[] EJ_05_Array_Sum = new int[arraySize];
		
		for(int i = 0; i < EJ_05_Array_1.length; i++) {
			EJ_05_Array_1[i] = (int)(Math.random() * 10) + 1;
			EJ_05_Array_2[i] = (int)(Math.random() * 10) + 1;
		}
		for(int j = 0; j < EJ_05_Array_Sum.length; j++) {
			EJ_05_Array_Sum[j] = EJ_05_Array_1[j] + EJ_05_Array_2[j];
		}
		System.out.println("Suma de arrays: " + Arrays.toString(EJ_05_Array_Sum));
	}
}