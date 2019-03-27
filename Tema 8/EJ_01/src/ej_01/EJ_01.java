package ej_01;
import java.util.*;

public class EJ_01 {
	public static void main(String[] args) {
		int numerator = 5, denominator = 0;
		
		try {
			System.out.println(numerator / denominator);
		} catch(Exception e) {
			System.out.println(e);
		}
	}
}