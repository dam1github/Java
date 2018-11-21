package ej_04;
import java.util.*;

public class EJ_04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("¿Cual quiere que sea el tamaño del array?");
		int arraySize = scan.nextInt(), arrayMultiplication = 1;
		int[] EJ_04_Array = new int[arraySize];
		
		for(int i = 0; i < EJ_04_Array.length; i++) {
			EJ_04_Array[i] = (int)(Math.random() * 5) + 1;
		}
		for(int j = 0; j < EJ_04_Array.length; j++) {
			arrayMultiplication *= EJ_04_Array[j];
		}
		System.out.println("Multiplicacion de los contenidos del array: " + arrayMultiplication);
	}
}