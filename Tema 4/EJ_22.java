package ej_22;
import java.util.*;

public class EJ_22 {
	public static void main(String[] args) {
		// Nota: esto no esta testeado, usar con precaucion :]
		Scanner scan = new Scanner(System.in);
		String text = "Esta es una cadena";
		
		System.out.println("¿Que letra quiere buscar?");
		String toLookFor = scan.nextLine();
		
		int lastPos = text.lastIndexOf(toLookFor);
		System.out.println("La ultima posicion de \"" + toLookFor + "\" es: " + lastPos);
  }
}
