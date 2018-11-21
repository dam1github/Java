package ej_07;
import java.util.*;

public class EJ_07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("¿Cuantos valores quiere introducir?");
		int arrayLength = scan.nextInt();
		boolean inOrder = true;
		
		int EJ_07_Array[] = new int[arrayLength];
		
		for(int i = 0; i < EJ_07_Array.length; i++) {
			System.out.println("Introduce el valor numero " + (i + 1));
			EJ_07_Array[i] = scan.nextInt();
		}
		
		for(int j = 0; j < EJ_07_Array.length - 1; j++) {
			if(EJ_07_Array[j] < EJ_07_Array[j + 1])
				inOrder = true;
			else {
				inOrder = false;
				j = EJ_07_Array.length;
			}
		}
		
		if(inOrder)
			System.out.println("Los valores estan ordenados de menor a mayor");
		else
			System.out.println("Los valores no estan ordenados");
	}
}