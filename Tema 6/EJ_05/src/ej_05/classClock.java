package ej_05;
import java.util.*;

public class classClock {
	int hours, minutes, seconds;
	
	public classClock() {
		setTime();
	}
	
	public void setTime() {
		setHours();
		setMinutes();
		setSeconds();
	}
	
	public void setHours() {
		do {
			System.out.println("Introduzca la hora (Entre 0 y 23)");
			hours = scanTime();
		} while(hours < 0 || hours > 23);
	}
	
	public int getHours() {
		return hours;
	}
	
	public void setMinutes() {
		do {
			System.out.println("Introduzca los minutos (Entre 0 y 59)");
			minutes = scanTime();
		} while(minutes < 0 || minutes > 59);
	}
	
	public int getMinutes() {
		return minutes;
	}
	
	public void setSeconds() {
		do {
			System.out.println("Introduzca los segundos (Entre 0 y 59)");
			seconds = scanTime();
		} while(seconds < 0 || minutes > 59);
	}
	
	public int getSeconds() {
		return seconds;
	}
	
	public int scanTime() {
		Scanner scan = new Scanner(System.in);
		return scan.nextInt();
	}
	
	public String getTimeString() {
		return (hours + ":" + minutes + ":" + seconds);
	}
	
	public void printTime() {
		System.out.println("La hora es: " + getTimeString());
	}
	
	public void addASecond() {
		seconds++;
		checkTime();
	}
	
	private void checkTime() {
		if(seconds == 60) {
			seconds = 0;
			minutes++;
		}
		if(minutes == 60) {
			minutes = 0;
			hours++;
		}
		if(hours == 24) {
			hours = 0;
		}
		
		printTime();
	}
}