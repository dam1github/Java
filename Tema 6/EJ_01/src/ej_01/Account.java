package ej_01;
import java.util.*;

public class Account {
	public double accountBalance;
	public String accountName;

	// Creamos un metodo por si no se ponen argumentos en el mismo...
	public Account() {
		accountName = null;
		accountBalance = 0;
	}

	// Aqui definimos el nombre y saldo de la cuenta bancaria por si tiene argumentos
	public Account(String accountName, double accountBalance) {
		this.accountName = accountName;
		this.accountBalance = accountBalance;
	}

	// Conseguimos el dinero actual de la cuenta
	public double getBalance() {
		return accountBalance;
	}

	// Añadimos dinero a la cuenta
	public void addBalance(double balanceToAdd) {
		accountBalance += balanceToAdd;
	}

	// Descontamos dinero de la cuenta
	public void deductBalance(double balanceToDeduct) {
		accountBalance -= balanceToDeduct;
	}

	// Nos devuelve el nombre de la cuenta bancaria
	public String getName() {
		return accountName;
	}
}