package ej_01;
import java.util.*;

public class Hombre extends Persona {
	private String estadoCivilHombre;
	private int edadHombre, cantidadHijosHombre;

	public Hombre(String nombrePersona, String apellidoPersona, String estadoCivilHombre, int edadHombre, int cantidadHijosHombre) {
		super(nombrePersona, apellidoPersona);
		this.estadoCivilHombre = estadoCivilHombre;
		this.edadHombre = edadHombre;
		this.cantidadHijosHombre = cantidadHijosHombre;
	}
	
	public Hombre(String estadoCivilHombre, int edadHombre, int cantidadHijosHombre) {
		super();
		this.estadoCivilHombre = estadoCivilHombre;
		this.edadHombre = edadHombre;
		this.cantidadHijosHombre = cantidadHijosHombre;
	}
	
	// Get
	public String getEstadoCivil() {
		return estadoCivilHombre;
	}
	
	public int getEdad() {
		return edadHombre;
	}
	
	public int getCantidadHijos() {
		return cantidadHijosHombre;
	}
	
	public String getEverything() {
		return "Nombre: " + getNombrePersona() + " | Apellidos: " + getApellidoPersona() + " | Estado Civil: " + getEstadoCivil() + " | Edad: " + getEdad() + " | Cantidad de hijos: " + getCantidadHijos();
	}
}