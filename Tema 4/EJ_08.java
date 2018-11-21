package ej_08;
import java.util.*;

public class EJ_08 {
	
	public static int EJ_08_Array[];
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("¿Cuantos valores quiere generar?");
		int arrayLength = scan.nextInt(), EJ_08_Array[] = new int[arrayLength];
		
		for(int i = 0; i < EJ_08_Array.length; i++) {
			EJ_08_Array[i] = (int)(Math.random() * 10);
		}
		
		array_de_izquierda_a_derecha(EJ_08_Array);
		array_de_derecha_a_izquierda(EJ_08_Array);
	}
	
	public static void array_de_izquierda_a_derecha(int arrayName[]) {
		for(int i = 0; i < arrayName.length; i++) 
			System.out.print(arrayName[i] + " ");
		System.out.println();
	}
	
	public static void array_de_derecha_a_izquierda(int arrayName[]) {
		for(int i = arrayName.length - 1; i >= 0; i--) 
			System.out.print(arrayName[i] + " ");
		System.out.println();
	}
}