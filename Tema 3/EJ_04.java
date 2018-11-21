package ej_4;
import java.util.*;

public class EJ_4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int hour_print = 0, minutes_print = 0, seconds_print = 0;
		
		/* Hora */
		System.out.println("Introduzca la hora...");
		int hour = scan.nextInt();
		while(hour < 0 || hour > 23) {
			System.out.println("La hora tiene que estar comprendida entre 0 y 24");
			hour = scan.nextInt();
		}
		
		/* Minutos */
		System.out.println("Introduzca los minutos...");
		int minutes = scan.nextInt();

		while(minutes < 0 || minutes > 59) {
			System.out.println("Los minutos tienen que estar comprendidos entre 0 y 59");
			minutes = scan.nextInt();
		}
		
		/* Segundos */
		System.out.println("Introduzca los segundos...");
		int seconds = scan.nextInt();
		while(seconds < 0 || minutes > 59) {
			System.out.println("Los segundos tienen que estar comprendidos entre 0 y 59");
		}
		
		System.out.println("La hora actual es - " + hour + ":" + minutes + ":" + seconds);
		
		/*	Tenemos que tener en cuenta que para calcular la nueva hora, cuando
		*	los segundos son 59, el siguiente sera 0, pero hay que incrementar
		*	los minutos, es decir minutes++;
		*	El mismo caso para lo demas
		*	Esto el profesor no lo ha preguntado, pero lo he hecho por si a
		*	alguien le interesa como terminarlo sin errores ni horas
		*	mayores que 25 y demas :)
		*/
		
		if(seconds == 59) {
			seconds_print = 0;
			minutes++;
		} else {
			seconds++;
			seconds_print = seconds;
		}

		if(minutes == 60 && seconds_print == 0) {
			minutes_print = 0;
			hour++;
		} else {
			minutes_print = minutes;
		}
	
		if(hour == 24 && seconds_print == 0 && minutes_print == 0) {
			hour_print = 0;
		} else {
			hour_print = hour;
		}
		
		System.out.println("La hora nueva es - " + hour_print + ":" + minutes_print + ":" + seconds_print);
	}
}
