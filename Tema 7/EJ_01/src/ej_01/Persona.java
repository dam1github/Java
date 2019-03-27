package ej_01;
import java.util.*;

public class Persona {
	private String nombrePersona, apellidoPersona;
	
	public Persona() {
		nombrePersona = setNombrePersona();
		apellidoPersona = setApellidoPersona();
	}

	public Persona(String nombrePersona, String apellidoPersona) {
		this.nombrePersona = nombrePersona;
		this.apellidoPersona = apellidoPersona;
	}
	
	public String getNombrePersona() {
		return nombrePersona;
	}
	
	public String getApellidoPersona() {
		return apellidoPersona;
	}
	
	public String getNombreApellidoPersona() {
		return nombrePersona + " " + apellidoPersona;
	}
	
	private String setNombrePersona() {
		System.out.println("Introduzca el nombre de la persona...");
		this.nombrePersona = scanString();
		return getNombrePersona();
	}
	
	private String setApellidoPersona() {
		System.out.println("Introduzca el apellido de la persona...");
		this.apellidoPersona = scanString();
		return getApellidoPersona();
	}
	
	private String scanString() {
		return new Scanner(System.in).nextLine();
	}
}