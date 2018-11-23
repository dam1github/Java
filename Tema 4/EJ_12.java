package ej_12;
import java.util.*;

public class EJ_12 {
	public static void main(String[] args) {
		int arraySize = 3, innerArraySize = arraySize, arraySum = 0;
		int[][] EJ_12_Array = new int[arraySize][innerArraySize];
		
		for(int i = 0; i < EJ_12_Array.length; i++) {
			for(int j = 0; j < EJ_12_Array[i].length; j++) {
				EJ_12_Array[i][j] = (int)(Math.random() * 10) + 1;
				arraySum += EJ_12_Array[i][j];
			}
		}
		for(int k = 0; k < EJ_12_Array.length; k++)
			System.out.println((k + 1) + ": " + Arrays.toString(EJ_12_Array[k]));
		System.out.println("La suma de todos los elementos del array es: " + arraySum);
	}
}