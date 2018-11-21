package ej_10;
import java.util.*;

public class EJ_10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduzca un importe");
		double devolucion, devolver, resto, devolucion_20, devolver_20, devolucion_10, devolver_10, devolucion_5, devolver_5;
		/* Inicializamos estas variables para quitarnos los errores de NetBeans */
		devolucion = 0;
		devolver = 0;
		resto = 0;
		
		double importe = scan.nextDouble();
		if(importe < 5) {
			System.out.println("No hay vueltas en billetes");
		} else if (importe >= 5 &&  importe < 10) {
			devolucion = (importe/5);
			devolver = (int)devolucion;
			resto = importe - (5 * devolver);
			System.out.println("Numero de billetes de 5€: " + devolver);
		} else if(importe >= 10 && importe < 20) {
			devolucion = (importe/10);
			devolver = (int)devolucion;
			resto = importe - (10 * devolver);
			System.out.println("Numero de billetes de 10€: " + devolver);
		} else if(importe >= 20 && importe < 50) {
			devolucion = (importe/20);
			devolver = (int)devolucion;
			resto = importe - (20 * devolver);
			System.out.println("Numero de billetes de 20€: " + devolver);
		} else if(importe >= 50) {
			devolucion = (importe/50);
			devolver = (int)devolucion;
			resto = importe - (50 * devolver);
			System.out.println("Numero de billetes de 50€: " + devolver);
		}
		
		if(resto >= 20) {
			devolucion_20 = (resto/20);
			devolver_20 = (int)devolucion_20;
			System.out.println("Numero de billetes de 20€: " + devolver_20);
			resto = resto - (20 * devolver_20);
		}
		if(resto >= 10 && resto < 20) {
			devolucion_10 = (resto/10);
			devolver_10 = (int)devolucion_10;
			System.out.println("Numero de billetes de 10€: " + devolver_10);
			resto = resto - (10 * devolver_10);
		}
		if(resto >= 5 && resto < 10) {
			devolucion_5 = (resto/5);
			devolver_5 = (int)devolucion_5;
			System.out.println("Numero de billetes de 5€: " + devolver_5);
			resto = resto - (5 * devolver_5);
		}
		if(resto > 0 && resto < 5) {
			System.out.println("Devolucion en monedas: " + resto + " €");
		}
	}
}