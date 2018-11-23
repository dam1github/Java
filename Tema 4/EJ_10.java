package ej_10;
import java.util.*;

public class EJ_10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("¿Cuantos valores quiere introducir?");
		int arrayLength = scan.nextInt();
		int[] EJ_10_Array = new int[arrayLength];
		
		for(int i = 0; i < EJ_10_Array.length; i++) {
			EJ_10_Array[i] = (int)(Math.random() * 100) + 1;
		}
		
		System.out.println(Arrays.toString(EJ_10_Array));
		int temp;
		for(int j = 0; j < EJ_10_Array.length - 1; j++) {
			for(int k = 0; k < EJ_10_Array.length - j - 1; k++) {
				if(EJ_10_Array[k + 1] < EJ_10_Array[k]) {
					temp = EJ_10_Array[k];
					EJ_10_Array[k] = EJ_10_Array[k + 1];
					EJ_10_Array[k + 1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(EJ_10_Array));
	}
}