package ej_03;
import java.util.*;

public class Stringey {
	public String stringName, stringContent;
		
	public Stringey() {
		stringName = null;
		stringContent = null;
	}

	public Stringey(String stringName) {
		this.stringName = stringName;
		stringContent = setContent();
	}

	public String setContent() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduzca un mensaje para " + stringName);
		return scan.next();
	}

	public String getName() {
		return stringName;
	}

	public String getContent() {
		return stringContent;
	}
}