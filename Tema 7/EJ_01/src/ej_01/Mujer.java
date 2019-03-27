package ej_01;
import java.util.*;

public class Mujer extends Persona {
	private String estadoCivilMujer;
	private int edadMujer, cantidadHijosMujer;

	public Mujer(String nombrePersona, String apellidoPersona, String estadoCivilMujer, int edadMujer, int cantidadHijosMujer) {
		super(nombrePersona, apellidoPersona);
		this.estadoCivilMujer = estadoCivilMujer;
		this.edadMujer = edadMujer;
		this.cantidadHijosMujer = cantidadHijosMujer;
	}
	
	public Mujer(String estadoCivilMujer, int edadMujer, int cantidadHijosMujer) {
		super();
		this.estadoCivilMujer = estadoCivilMujer;
		this.edadMujer = edadMujer;
		this.cantidadHijosMujer = cantidadHijosMujer;
	}
	
	// Get
	public String getEstadoCivil() {
		return estadoCivilMujer;
	}
	
	public int getEdad() {
		return edadMujer;
	}
	
	public int getCantidadHijos() {
		return cantidadHijosMujer;
	}
	
	public String getEverything() {
		return "Nombre: " + getNombrePersona() + " | Apellidos: " + getApellidoPersona() + " | Estado Civil: " + getEstadoCivil() + " | Edad: " + getEdad() + " | Cantidad de hijos: " + getCantidadHijos();
	}
}