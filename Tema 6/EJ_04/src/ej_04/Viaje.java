package ej_04;
import java.util.*;

public class Viaje {
	public double distance, time;
	public int fastestTrip;

	public Viaje(double distance, double time) {
		this.distance = distance;
		this.time = time;
	}
	
	public double calcularVelocidad() {
		return (distance / time);
	}
}