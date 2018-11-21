package menu;
import java.util.*;

public class Menu {
	public static int array_length = 0;
	public static int indent_sides = 6;
	public static int max_length;
	public static String method_name;
	public static boolean buildingArray;
	public static Runnable[] methodsArray = {
		/* Secuencias de control */
		Menu::exit, Menu::nota_academica, Menu::mayor_de_2_numeros, Menu::mayor_de_3_numeros, Menu::hora_minutos_segundos, Menu::area_circulo, 
		Menu::$3_notas_medias, Menu::menu_3_opciones, Menu::ano_bisieto, Menu:: par_impar, Menu::billetes_y_monedas, Menu::suma_resta_string, Menu::suma_resta_char, 
		/* Loops 13-23 */ 
		Menu::numeros_entre_1_y_100, Menu::pares_entre_1_y_200, Menu::impares_entre_1_y_100, Menu::cuadrado_20_primeros_numeros, Menu::numeros_entre_2_numeros,
		Menu::suma_de_x_numeros, Menu::divisores_de_un_numero, Menu::edad_altura_alumnos, Menu::cuantos_pares_impares_nulos, Menu::cociente_y_resto_mediante_restas,
		Menu::factorial_de_un_numero,
		/* Subrutinas y funciones 24-x */
		Menu::suspenso_aprobado, Menu::suma_Entero, Menu::call_factorial, Menu::potencia_numero, Menu::es_primo_o_no_un_numero
	};
	public static String[] methodsNameArray = new String[methodsArray.length];
	
	public static void main(String[] args) {
		create_name_array();
		
		separator();
		option(0, 0);
		title("Secuencias de control");
		option(1, 12);
		title("Loops");
		option(13, 23);
		title("Subrutinas y funciones");
		option(24, 28);
		
		read_option();
	}
	
	// Options
	public static void read_option() {
		Scanner scan = new Scanner(System.in);
		int option = scan.nextInt();
		
		while(option < 0 || option >= methodsNameArray.length) {
			separator();
			title("Enter a valid option");
			option = scan.nextInt();
		}
		
		separator();
		if(option != 0)
			methodsArray[option].run();
		else {
			methodsArray[0].run();
			return;
		}
		return_to_main();
	}
	public static void return_to_main() {
		Scanner scan = new Scanner(System.in);
		separator();
		title("Type \"retry\" to return to main or 0 to exit.");
		String value = scan.nextLine();
		
		while(!value.equalsIgnoreCase("retry") && !value.equalsIgnoreCase("0")) {
			separator();
			title("Type \"retry\" to return to main or 0 to exit.");
			value = scan.nextLine();
		}
		
		if(value.equalsIgnoreCase("retry")) {
			main(null);
		} else if(value.equalsIgnoreCase("0")) {
			separator();
			title("You exited correctly");
		}
	}
	// Menu Structure
	public static void create_name_array() {
		buildingArray = true;
		for(int i = 0; i < methodsArray.length; i++) {
			methodsArray[i].run();
			methodsNameArray[i] = method_name;
		}
		buildingArray = false;
		
		get_array_length();
	}
	public static void get_array_length() {
		for(int i = 0; i < methodsNameArray.length; i++)
			if(methodsNameArray[i].length() > array_length)
				array_length = methodsNameArray[i].length();
		max_length = indent_sides + array_length + indent_sides;
	}
	public static void title(String title) {
		int title_half = title.length() / 2;
		int max_length_half = max_length / 2;
		int until_title = max_length_half - title_half;
		int from_title = until_title + title.length();
		
		System.out.print("|");
		for(int i = 0; i < until_title; i++)
			System.out.print(" ");
		System.out.print(title);
		
		for(int j = from_title; j < max_length; j++)
			System.out.print(" ");
		System.out.println("|");
		separator();
	}
	public static void option(int opt_from, int opt_to) {
		for(int i = opt_from; i <= opt_to; i++) {
			int indent_plus_array_length = indent_sides + methodsNameArray[i].length();
			if(i < 10)
				System.out.print("| 0" + i + " - " + methodsNameArray[i]);
			else
				System.out.print("| " + i + " - " + methodsNameArray[i]);
			for(int j = indent_plus_array_length; j < max_length; j++)
				System.out.print(" ");
			System.out.println("|");
		}
		separator();
	}
	public static void separator() {
		System.out.print("+");
		for(int i = 0; i < max_length; i++)
			System.out.print("-");
		System.out.println("+");
	}
	
	
	// Methods
	
	// Secuencias de control
	public static void exit() {
		method_name = "Exit";

		if(!buildingArray) {
			title("You exited correctly");
		}
	}
	public static void nota_academica() {
		method_name = "Nota academica";

		if(!buildingArray) {
			Scanner scan = new Scanner(System.in);

			System.out.println("Introduzca una nota");
			int nota = scan.nextInt();

			if(nota > 10) {
				System.out.println("Has introducido una nota mayor que 10");
			} else if(nota == 10) {
				System.out.println("La nota es igual a 10");
			} else {
				System.out.println("La nota es menor que diez");
			}
		}
	}
	public static void mayor_de_2_numeros() {
		method_name = "Mayor de 2 numeros";

		if(!buildingArray) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Introduzca el primer numero...");
			int num_1 = scan.nextInt();

			System.out.println("Introduzca el segundo numero...");
			int num_2 = scan.nextInt();

			if(num_1 > num_2) {
				System.out.println("El numero " + num_1 + " es mayor que " + num_2);
			} else if (num_1 < num_2) {
				System.out.println("El numero " + num_2 + " es mayor que " + num_1);
			} else { // o else if(num_1 == num_2)
				System.out.println(num_1 + " = " + num_2 + "; Ambos numeros son iguales");
			}
		}
	}
	public static void mayor_de_3_numeros() {
		method_name = "Mayor de 3 numeros";

		if(!buildingArray) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Introduzca el primer numero...");
			int num_1 = scan.nextInt();

			System.out.println("Introduzca el segundo numero...");
			int num_2 = scan.nextInt();

			System.out.println("Introduzca el tercer numero...");
			int num_3 = scan.nextInt();

			// Los simbolos "&&" significan "y"
			// Los simbolos "||" significan "o" 

			if(num_1 > num_2 && num_1 > num_3) {
				System.out.println("El numero " + num_1 + " es mayor que " + num_2 + " y " + num_3);
				System.out.println(num_1 + ">" + num_2);
				System.out.println(num_1 + ">" + num_3);
			} else if(num_2 > num_1 && num_2 > num_3) {
				System.out.println("El numero " + num_2 + " es mayor que " + num_1 + " y " + num_3);
				System.out.println(num_2 + ">" + num_1);
				System.out.println(num_2 + ">" + num_3);
			} else if(num_3 > num_1 && num_3 > num_2) {													// Aqui nos podemos ahorra todo esto y usar simplemente un else,
				System.out.println("El numero " + num_3 + " es mayor que " + num_1 + " y " + num_2);	// pero lo he hecho asi para que se entienda lo que haria un else en este caso
				System.out.println(num_3 + ">" + num_1);
				System.out.println(num_3 + ">" + num_2);
			}
		}
	}
	public static void hora_minutos_segundos() {
		method_name = "Hora, minutos y segundos";

		if(!buildingArray) {
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
	public static void area_circulo() {
		method_name = "Area de un circulo";

		if(!buildingArray) {
			double pi = 3.1416;
			Scanner scan = new Scanner(System.in);

			System.out.println("Introduce el radio del circulo para calcular el area");
			double circle_radius = scan.nextDouble();

			while(circle_radius < 0) {
				System.out.println("El radio tiene que ser mayor que 0");
				circle_radius = scan.nextDouble();
			}

			/*	La formula del area del circulo es: (A = pi * r^2);
			*	tenemos que calcular el cuadrado del radio
			*	como dice el profesor
			*/
			double power_radius = circle_radius * circle_radius;

			double circle_area = pi * power_radius;
			System.out.println("El Area del circulo es: " + circle_area);
		}
	}
	public static void $3_notas_medias() {
		method_name = "3 notas medias";

		if(!buildingArray) {
			double nota_1, nota_2, nota_3;

			Scanner scan = new Scanner(System.in);

			System.out.println("Introduzca la nota del primer trimestre...");
			nota_1 = scan.nextDouble();
			while(nota_1 < 0 || nota_1 > 10) {
				System.out.println("La nota introducida tiene que ser mayor o igual que 0 y menor o igual que 10");
				nota_1 = scan.nextDouble();
			}

			System.out.println("Introduzca la nota del segundo trimestre...");
			nota_2 = scan.nextDouble();
			while(nota_2 < 0 || nota_2 > 10) {
				System.out.println("La nota introducida tiene que ser mayor o igual que 0 y menor o igual que 10");
				nota_2 = scan.nextDouble();
			}

			System.out.println("Introduzca la nota del tercer trimestre...");
			nota_3 = scan.nextDouble();
			while(nota_3 < 0 || nota_3 > 10) {
				System.out.println("La nota introducida tiene que ser mayor o igual que 0 y menor o igual que 10");
				nota_3 = scan.nextDouble();
			}

			System.out.println("Nota del primer trimestre: " + nota_1);
			System.out.println("Nota del segundo trimestre: " + nota_2);
			System.out.println("Nota del tercer trimestre: " + nota_3);
			double nota_media = (nota_1 + nota_2 + nota_3)/3;

			if(nota_1 < 5 || nota_2 < 5 || nota_3 < 5) {
				System.out.println("Alguna de las notas es menor que 5, no se puede calcular la media");
			} else {
				System.out.println("La nota media es: " + nota_media);
			}
		}
	}
	public static void menu_3_opciones() {
		method_name = "Menu con 3 opciones";

		if(!buildingArray) {
			Scanner scan = new Scanner(System.in);

			System.out.println("Elija una opcion...");
			System.out.println("1.- Nota media");
			System.out.println("2.- Area de un circulo");
			System.out.println("3.- Salir");

			int opt = scan.nextInt();
			switch(opt) {
				case 1:
					$3_notas_medias();
					break;
				case 2:
					area_circulo();
					break;
				case 3:
					System.out.println("Ha salido correctamente");
					break;
			}
		}
	}
	public static void ano_bisieto() {
		method_name = "Año bisiesto o no";

		if(!buildingArray) {
			Scanner scan = new Scanner(System.in);

			System.out.println("Introduzca un año...");
			int ano = scan.nextInt();

			if((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0) {
				System.out.println("El año introducido es: " + ano + ", este año es bisiesto");
			} else {
				System.out.println("El año introducido es: " + ano + ", este año no es bisiesto");
			}
		}
	}
	public static void par_impar() {
		method_name = "Par o impar";

		if(!buildingArray) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Introduzca un numero...");

			int num = scan.nextInt();
			if(num % 2 == 0) {
				System.out.println("El numero " + num + " es par");
			} else {
				System.out.println("El numero " + num + " es impar");
			}
		}

	}
	public static void billetes_y_monedas() {
		method_name = "Billetes y monedas";

		if(!buildingArray) {
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
	public static void suma_resta_string() {
		method_name = "Suma (S) o Resta (R) [Con String]";

		if(!buildingArray) {
			String plus_minus;

			Scanner scan = new Scanner(System.in);
			System.out.println("Introduzca S para sumar o R para restar");
			plus_minus = scan.next();

			while(!plus_minus.equalsIgnoreCase("s") && !plus_minus.equalsIgnoreCase("r")) {
				System.out.println("Introduzca S para sumar o R para restar");
				plus_minus = scan.next();
			}

			System.out.println("Introduzca un numero...");
			double num_1 = scan.nextInt();
			System.out.println("Introduzca otro numero...");
			double num_2 = scan.nextInt();

			if(plus_minus.equalsIgnoreCase("s")) {
				System.out.println(num_1 + "+" + num_2 + " = " + (num_1 + num_2));
			} else if(plus_minus.equalsIgnoreCase("r")) {
				System.out.println(num_1 + "-" + num_2 + " = " + (num_1 - num_2));
			}
		}
	}
	public static void suma_resta_char() {
		method_name = "Suma (S) o Resta (R) [Con Char]";

		if(!buildingArray) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Introduzca S para sumar o R para restar");
			char plus_minus = scan.next().charAt(0);

			while(plus_minus != 's' && plus_minus != 'S' && plus_minus != 'r' && plus_minus != 'R') {
				System.out.println("Introduzca S para sumar o R para restar");
				plus_minus = scan.next().charAt(0);
			}

			System.out.println("Introduzca un numero...");
			double num_1 = scan.nextInt();
			System.out.println("Introduzca otro numero...");
			double num_2 = scan.nextInt();

			if(plus_minus == 's' || plus_minus == 'S') {
				System.out.println(num_1 + "+" + num_2 + " = " + (num_1 + num_2));
			} else if(plus_minus == 'r' || plus_minus == 'R') {
				System.out.println(num_1 + "-" + num_2 + " = " + (num_1 - num_2));
			}
		}
	}
	
	// Loops
	public static void numeros_entre_1_y_100() {
		method_name = "Numeros entre 1 y 100";

		if(!buildingArray) {
			for(int numero = 1; numero <= 100; numero++) {
				System.out.println("Numero: " + numero);
			}

			/* En caso alternativo se suele usar 'i' como variable en el loop
			*
			*	for(int i = 1; i <= 100; i++) {
			*		System.out.println("Numero: " + i);
			*	}
			*/
		}
	}
	public static void pares_entre_1_y_200() {
		method_name = "Pares entre 1 y 200";

		if(!buildingArray) {
			for(int i = 1; i <= 200; i++) 
				if(i % 2 == 0) 
					System.out.println("Numero " + i);
		}
	}
	public static void impares_entre_1_y_100() {
		method_name = "Impares entre 1 y 100";

		if(!buildingArray) {
			for(int i = 0; i < 100; i++)
				if(i % 2 != 0) 
					System.out.println("Numero " + i);
		}
	}
	public static void cuadrado_20_primeros_numeros() {
		method_name = "Cuadrado de los primeros 20 numeros";

		if(!buildingArray) {
			for(int i = 1; i <= 20; i++) {
				int num_square = i * i;
				System.out.println("Cuadrado de " + i + ": " + num_square);
			}
		}
	}
	public static void numeros_entre_2_numeros() {
		method_name = "Numeros entre 2 numeros";
		
		if(!buildingArray) {
			Scanner scan = new Scanner(System.in);

			System.out.println("Type a number...");
			int num_1 = scan.nextInt();
			System.out.println("Type another number...");
			int num_2 = scan.nextInt();

			if(num_1 < num_2) {
				for(int i = num_1 + 1; i < num_2; i++)
					System.out.print(i + " ");
				System.out.print("\n");
			} else if(num_1 > num_2) {
				for(int i = num_1 - 1; i > num_2; i--)
					System.out.print(i + " ");
				System.out.print("\n");
			} else
				System.out.println("There's no numbers in between each other, they're the same.");
			}
	}
	public static void suma_de_x_numeros() {
		method_name = "Suma de x numeros";
		
		if(!buildingArray) {
			Scanner scan = new Scanner(System.in);

			System.out.println("Type a number...");
			int num_1 = scan.nextInt();
			System.out.println("Type another number...");
			int num_2 = scan.nextInt();

			if(num_1 < num_2) {
				for(int i = num_1 + 1; i < num_2; i++)
					System.out.print(i + " ");
				System.out.print("\n");
			} else if(num_1 > num_2) {
				for(int i = num_1 - 1; i > num_2; i--)
					System.out.print(i + " ");
				System.out.print("\n");
			} else
				System.out.println("There's no numbers in between each other, they're the same.");
		}
	}
	public static void divisores_de_un_numero() {
		method_name = "Divisores de un numero";
		
		if(!buildingArray) {
			Scanner scan = new Scanner(System.in);

			System.out.println("Input a number...");
			int num = scan.nextInt();

			for(int i = 1; i <= num; i++) {
				if(num % i == 0) {
					System.out.println(i);
				}
			}
		}
	}
	public static void edad_altura_alumnos() {
		method_name = "Edad y altura de alumnos";

		if(!buildingArray) {
			double child_age, child_height, total_age = 0, total_height = 0;
			int over_18 = 0, over_175 = 0;
			Scanner scan = new Scanner(System.in);

			System.out.println("How many do you want to input?");
			int input_limit = scan.nextInt();

			for(int i = 1; i <= input_limit; i++) {
				System.out.println("What's the age of the child number " + i + "?");
				child_age = scan.nextInt();
				total_age += child_age;

				if(child_age >= 18)
					over_18++;

				System.out.println("What's the height of the child number " + i + "?");
				child_height = scan.nextDouble();
				total_height += child_height;

				if(child_height > 1.75)
					over_175++;
			}
			System.out.println("The average age is: " + (total_age / input_limit));
			System.out.println("The average height is: " + (total_height / input_limit));
			System.out.println("People that are over 18: " + over_18);
			System.out.println("People that are over 1.75 meters tall: " + over_175);
		}
	}
	public static void cuantos_pares_impares_nulos() {
		method_name = "Cuenta los pares, imapares y nulos";
		
		if(!buildingArray) {
			int num_loop, read_limit = 5, even = 0, uneven = 0, zero = 0;
			Scanner scan = new Scanner(System.in);

			for(int i = 0; i < read_limit; i++) {
				System.out.println("Type a number...");
				num_loop = scan.nextInt();

				if(num_loop % 2 == 0) {
					even++;
				} else if(num_loop % 2 != 0) {
					uneven++;
				}
				if(num_loop == 0) {
					zero++;
				}
			}
			System.out.println("Even numbers: " + even);
			System.out.println("Uneven numbers: " + uneven);
			System.out.println("Zeroed numbers: " + zero);
		}
	}
	public static void cociente_y_resto_mediante_restas() {
		method_name = "Calcular cociente y resto mediante restas";
		
		if(!buildingArray) {
			int dividend, divisor, quotient = 0, remainder;
			Scanner scan = new Scanner(System.in);

			System.out.println("Type the dividend");
			dividend = scan.nextInt();
			System.out.println("Type the divisor");
			divisor = scan.nextInt();

			// Quotient
			for(int i = 0; i <= dividend - divisor; i += divisor) {
				quotient++;
			}

			// Remainder
			remainder = dividend - (quotient * divisor);

			System.out.println("Quotient: " + quotient);
			System.out.println("Remainder: " + remainder);
		}
	}
	public static void factorial_de_un_numero() {
		method_name = "Factorial de un numero";
		
		if(!buildingArray) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Type a number...");
			int factorial = scan.nextInt(), temp_var = factorial;

			if(factorial == 0) {
				temp_var = 0;
			} else if(factorial == 1) {
				temp_var = 1;
			} else {
				for(int i = factorial; i > 1; i--) {
					temp_var *= i - 1;
				}
			}
			System.out.println("Result: " + temp_var);
		}
	}
	
	// Subrutinas y funciones
	public static void suspenso_aprobado() {
		method_name = "Suspendo, aprobado o error";
		
		if(!buildingArray) {
			Scanner scan = new Scanner(System.in);

			System.out.println("Type a mark...");
			double nota = scan.nextDouble();

			char calificacion = obtener_calificacion(nota); // calificacion sera igual a 's', 'a' o 'e'; Esto lo obtenemos del metodo obtener_calificacion a traves de return;
			System.out.println("The mark is: " + calificacion);
		}
	}
	public static char obtener_calificacion(double nota) {
		if(nota >= 0 && nota < 5) {
			return 'S';
		} else if(nota >= 5 && nota <= 10) {
			return 'A';
		} else {
			return 'E';
		}
	}
	
	public static void suma_Entero() {
		method_name = "Suma de 10 enteros";
		
		if(!buildingArray) {
			int num_print = sumaEntero();
		System.out.println("Sum of the 10 numbers: " + num_print);
		}
	}
	public static int sumaEntero() {
		int num_sum = 0, num;
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Type a number...");
			num = scan.nextInt();
			num_sum += num;
		}	return num_sum;
	}
	
	public static int pedir_Numero() {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		return num;
	}
	
	public static void call_factorial() {
		method_name = "Factorial de un numero";
		
		if(!buildingArray) {
			System.out.println("Type a number...");
			int num = pedir_Numero();
			int num_print = calcular_factorial(num);
			System.out.println("Factorial de " + num + ": " + num_print);
		}
	}
	public static int calcular_factorial(int factorial) {
		int temp_var = factorial;

		if(factorial == 0) {
			temp_var = 0;
		} else if(factorial == 1) {
			temp_var = 1;
		} else {
			for(int i = factorial; i > 1; i--) {
				temp_var *= i - 1;
			}
		}
		return temp_var;
	}
	
	public static void potencia_numero() {
		method_name = "Potencia de un numero";
		
		if (!buildingArray) {
			int base, exponente;
			
			System.out.println("Introduzca una base...");
			base = pedir_Numero();
			
			System.out.println("Introduzca un exponente...");
			exponente = pedir_Numero();
			
			while(exponente <= 0) {
				System.out.println("El exponente tiene que ser mayor que 0, porque no queremos dividir...");
				exponente = pedir_Numero();
			}
			
			int potencia = calcular_potencia(base, exponente);
			System.out.println("La potencia de " + base + " ^ " + exponente + " es: " + potencia);
		}
	}
	public static int calcular_potencia(int base, int exponente) {
		int temp_base = 1;
		
		for(int i = 0; i < exponente; i++) {
			temp_base *= base;
		}
		return temp_base;
	}
	
	public static void es_primo_o_no_un_numero() {
		method_name = "¿Es primo o no un numero?";
		
		if (!buildingArray) {
			System.out.println("Introduzca un numero...");
			int num = pedir_Numero();
			calcular_primo(num);
		}
	}
	public static void calcular_primo(int num) {
		if(num == 0) {
			System.out.println("No se puede dividir entre 0");
		} else if(num == 1) {
			System.out.println("El numero 1 no es primo");
		} else if(num == 2) {
			System.out.println("El numero 2 es primo");
		} else {
			for(int i = 2; i < num; i++) {
				if(num % i == 0) {
					System.out.println("El numero " + num + " no es primo, es divisible entre " + i);
					i = num;
				}
				if(i == num - 1) {
					System.out.println("El numero " + num + " es primo");
				}
			}
		}
	}
}