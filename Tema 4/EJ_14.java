package ej_14;
import java.util.*;

public class EJ_14 {
	public static void main(String[] args) {
		String sevilla = "Quien fue a Sevilla perdio su silla";
		
		System.out.println("La letra en la posicion 0 es: " + sevilla.charAt(0));
		System.out.println("La letra en la posicion 0 es: " + sevilla.charAt(14));
		System.out.println(sevilla.equals(sevilla));
		System.out.println("La cadena \"fue\" empieza en la posicion " + sevilla.indexOf("fue"));
		System.out.println("La longitud de la cadena es " + sevilla.length());
		System.out.println(sevilla.replace("a", "e"));
		System.out.println(sevilla.toLowerCase());
		System.out.println(sevilla.toUpperCase());
	}
}