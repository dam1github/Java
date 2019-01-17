package ej_01;
import java.util.*;

public class EJ_01 {
	
	public static void main(String[] args) {
		Account acc_1 = new Account("1", 2); // Creamos una cuenta llamada "1" con 2€ de saldo inicial
		System.out.println("Dinero en cuenta " + acc_1.getName() + ": " + acc_1.getBalance() + "€");
		
		acc_1.deductBalance(1); // Le quitamos 1€ a la cuenta 1 | Balance actual -> 1€
		System.out.println("Menos 1€ en cuenta " + acc_1.getName() + ": " + acc_1.getBalance() + "€");
		
		acc_1.addBalance(5.50); //Le sumamos 5.50€ a la cuenta 1 | Balance actual -> 6.50€
		System.out.println("Mas 1€ en cuenta " + acc_1.getName() + ": " + acc_1.getBalance() + "€");
		
		System.out.println(); // Simple separador de linea para que quede mejor en la consola :)
		
		Account acc_2 = new Account("2", 0); // Creamos una cuenta llamada "2" con 0€ de saldo inicial
		System.out.println("Dinero en cuenta " + acc_2.getName() + ": " + acc_2.getBalance() + "€");
		
		acc_2.deductBalance(5); // Le quitamos 5€ a la cuenta 2 | Balance actual -> -5€
		System.out.println("Restamos 5€ en cuenta " + acc_2.getName() + ": " + acc_2.getBalance() + "€");
		
		acc_2.addBalance(1); //Le sumamos 1€ a la cuenta 2 | Balance actual -> -4€
		System.out.println("Sumamos 1€ en cuenta " + acc_2.getName() + ": " + acc_2.getBalance() + "€");
	}
}