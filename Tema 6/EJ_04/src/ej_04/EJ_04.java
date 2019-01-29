package ej_04;
import java.util.*;

public class EJ_04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Introduzca la distancia y el tiempo del primer viaje...");
		Viaje firstTrip = new Viaje(scan.nextDouble(), scan.nextDouble());
		
		System.out.println("Introduzca la distancia y el tiempo del segundo viaje...");
		Viaje secondTrip = new Viaje(scan.nextDouble(), scan.nextDouble());
		
		// Usando if statements
		System.out.println("Usando if statements");
		if(firstTrip.time < secondTrip.time)
			System.out.println("El primer viaje es mas rapido, a " + (firstTrip.distance / firstTrip.time) + " km/h, con un total de " + firstTrip.distance + " km's recorridos en " + firstTrip.time + " hora(s)");
		else if(firstTrip.time > secondTrip.time) 
			System.out.println("El segundo viaje es mas rapido, a " + (secondTrip.distance / secondTrip.time) + " km/h, con un total de " + secondTrip.distance + " km's recorridos en " + secondTrip.time + " hora(s)");
		else
			System.out.println("Ambos viajes son igual de rapidos");
		
		// Usando calcularVelocidad()
		System.out.println("\nUsando calcularVelocidad()");
		if(firstTrip.time < secondTrip.time)
			System.out.println("El primer viaje es mas rapido, a " + firstTrip.calcularVelocidad() + " km/h, con un total de " + firstTrip.distance + " km's recorridos en " + firstTrip.time + " hora(s)");
		else if(firstTrip.time > secondTrip.time) 
			System.out.println("El segundo viaje es mas rapido, a " + secondTrip.calcularVelocidad() + " km/h, con un total de " + secondTrip.distance + " km's recorridos en " + secondTrip.time + " hora(s)");
		else
			System.out.println("Ambos viajes son igual de rapidos");
	}
}