package ej_02;
import java.util.*;

public class EJ_02 {
	public static void main(String[] args) {
		int number = (int)((Math.random() * 1000) + 1);
		String resultado;
		
		if(number % 2 == 0) {
			resultado = "Par";
		} else {
			resultado = "Impar";
		}
		
		try {
			throw new Exception(resultado);
		} catch(Exception e) {
			System.out.println(number + " -> " + e.getMessage());
		}
	}
}