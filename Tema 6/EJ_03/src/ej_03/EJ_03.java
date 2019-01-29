package ej_03;
import java.util.*;

public class EJ_03 {
	public static void main(String[] args) {
		Stringey firstString = new Stringey("1");
		Stringey secondString = new Stringey("2");
		
		System.out.println("Nombre: " + firstString.getName() + " | Contenido: " + firstString.getContent() + " | Longitud: " + firstString.stringContent.length());
		System.out.println("Nombre: " + secondString.getName() + " | Contenido: " + secondString.getContent() + " | Longitud: " + secondString.stringContent.length());
		System.out.println("Suma de ambas longitudes: " + (firstString.stringContent.length() + secondString.stringContent.length()));
	}
}