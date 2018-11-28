package ej_13;
import java.util.*;

public class EJ_13 {
	public static void main(String[] args) {
		int arraySize = 3, innerArraySize = arraySize, arraySum = 0;
		int[][] EJ_12_Array = new int[arraySize][innerArraySize];
		
		for(int i = 0; i < EJ_12_Array.length; i++) {
			for(int j = 0; j < EJ_12_Array[i].length; j++)
				EJ_12_Array[i][j] = (int)(Math.random() * 10) + 1;
		}
		
		for(int n = 0; n < EJ_12_Array.length; n++)
			System.out.println(Arrays.toString(EJ_12_Array[n]));
		
		for(int k = 0; k < EJ_12_Array.length; k++)
			arraySum += EJ_12_Array[k][k];
		System.out.println("Suma: " + arraySum);
	}
}