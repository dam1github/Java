package ej_09;
import java.util.*;

public class EJ_09 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("¿Cuantos valores quiere introducir?");
		int arrayLength = scan.nextInt(), EJ_09_Array[] = new int[arrayLength], positive = 0, negative = 0, zero = 0;
		
		for(int i = 0; i < EJ_09_Array.length; i++) {
			System.out.println("Introduzca un numero...");
			EJ_09_Array[i] = scan.nextInt();
			if(EJ_09_Array[i] == 0)
				zero++;
			else if(EJ_09_Array[i] > 0)
				positive++;
			else if(EJ_09_Array[i] < 0)
				negative++;
		}
		System.out.print("Hay " + zero + " numeros nulos\nHay " + positive + " numeros positivos\nHay " + negative + " numeros negativos\n");
	}
}