package ej_05;
import java.util.*;

public class EJ_05 {
	public static void main(String[] args) {
		classClock firstTime = new classClock();
		
		System.out.println("La hora es: " + firstTime.getTimeString());
		firstTime.addASecond();
	}
}