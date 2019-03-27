package ej_01;
import java.util.*;

public class EJ_01 {
	public static void main(String[] args) {
		Persona damianRodriguez = new Persona("Damian", "Rodriguez"); // Definimos una persona para usar su nombre y apellidos despues
		
		Hombre angelRume = new Hombre("Angel", "Rume", "Casado", 28, 0);
		Mujer lolaMola = new Mujer("Casada", 29, 0); // Se define el nombre y apellidos a traves del scanner por consola
		Hombre damRod = new Hombre(damianRodriguez.getNombrePersona(), damianRodriguez.getApellidoPersona(), "Soltero", 44, 2); // Obtenemos el nombre y apellidos de la variable damianRodriguez
		
		System.out.println(angelRume.getEverything());
		System.out.println(lolaMola.getEverything());
		System.out.println(damRod.getEverything());
	}
}