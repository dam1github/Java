package ej_07;
import java.util.*;

public class Person {
	private int personAge;
	
	public Person() {
		personAge = scanAge();
	}
	
	public Person(int personAge) {
		this.personAge = personAge;
	}
	
	protected int getAge() { // We set this as protected because we only want it to be accessible from it's subclasses
		return personAge;
	}
	
	private int scanAge() {
		return scanInt();
	}
	
	private int scanInt() {
		return new Scanner(System.in).nextInt();
	}
}