package ej_ownexception;
import java.util.*;

public class OwnExceptionClass extends Exception {
	private int number;
	
	public OwnExceptionClass(int number) {
		this.number = number;
	}
	
	public String printException() {
		return "El numero no puede ser: " + number;
	}
}