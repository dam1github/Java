package ej_ownexception;
import java.util.*;

public class EJ_OwnException {
	public static void main(String[] args) {
		int number = 5;
		
		try {
			checkNumber(number);
		} catch (OwnExceptionClass exception) {
			System.out.println(exception.printException());
		}
	}
	
	public static void checkNumber(int number) throws OwnExceptionClass {
		if(number > 10)
			throw new OwnExceptionClass(number);
		else
			System.out.println(number);
	}
}