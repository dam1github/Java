package ej_03;
import java.util.*;

public class EJ_03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("¿Cual quiere que sea el tamaño del array?");
		int arrayValue, arraySum = 0, arraySize = scan.nextInt();
		
		int[] EJ_03_Array = new int[arraySize];
		for(int i = 0; i < EJ_03_Array.length; i++) {
			System.out.println("Dale un valor a la posicion " + i + " del array");
			arrayValue = scan.nextInt();
			
			while(arrayValue < 0) {
				System.out.println("El valor tiene que ser mayor que 0");
				arrayValue = scan.nextInt();
			}
			
			EJ_03_Array[i] = arrayValue;
		}
		for(int j = 0; j < EJ_03_Array.length; j++) {
			arraySum += EJ_03_Array[j];
		}
		System.out.println("La suma del contenido del array es: " + arraySum);
	}
}