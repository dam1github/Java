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
		Menu::exit, Menu::array_de_tamano_n, Menu::array_de_tamano_n_valores_incrementativos, Menu::suma_de_array_n, Menu::array_contenidos_random, Menu::suma_dos_arrays,
		Menu::buscar_numero_en_array, Menu::rellenar_array_y_check_orden, Menu::array_izquierda_derecha, Menu::positivos_negativos_ceros, Menu::ordenacion_array,
		Menu::array_bidimensional, Menu::sumar_array_bidimensional
	};
	public static String[] methodsNameArray = new String[methodsArray.length];
	
	public static void main(String[] args) {
		create_name_array();
		
		separator();
		option(0, 0);
		title("Arrays");
		option(1, 12);
		
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
	public static void exit() {
		method_name = "Exit";

		if(!buildingArray) {
			title("You exited correctly");
		}
	}
	public static void array_de_tamano_n() {
		method_name = "Array de tamaño N con valores 0";
		
		if (!buildingArray) {
			Scanner scan = new Scanner(System.in);
			System.out.println("¿Cual quiere que sea el tamaño del array?");

			int arraySize = scan.nextInt();

			int[] EJ_01_Array = new int[arraySize];

			for(int i = 0; i < EJ_01_Array.length; i++) {
				EJ_01_Array[i] = 0;
			}
			System.out.println("Array: " + Arrays.toString(EJ_01_Array));
		}
	}
	public static void array_de_tamano_n_valores_incrementativos() {
		method_name = "Array de tamaño N con valores incrementativos";
		
		if (!buildingArray) {
			Scanner scan = new Scanner(System.in);
			System.out.println("¿Cual quiere que sea el tamaño del array?");

			int arraySize = scan.nextInt();

			int[] EJ_02_Array = new int[arraySize];

			for(int i = 0; i < EJ_02_Array.length; i++) {
				EJ_02_Array[i] = i + 1;
			}
			System.out.println("Array: " + Arrays.toString(EJ_02_Array));
		}
	}
	public static void suma_de_array_n() {
		method_name = "Suma de los contenidos de un array";
		
		if (!buildingArray) {
			Scanner scan = new Scanner(System.in);
			System.out.println("¿Cual quiere que sea el tamaño del array?");
			int arrayValue, arraySum = 0, arraySize = scan.nextInt();

			int[] EJ_03_Array = new int[arraySize];
			for(int i = 0; i < EJ_03_Array.length; i++) {
				System.out.println("Dale un valor a la posicion " + i + " del array");
				arrayValue = scan.nextInt();

				while(arrayValue < 0) {
					System.out.println("El valor tiene que ser mayor que 0");
					arrayValue = scan.nextInt();
				}

				EJ_03_Array[i] = arrayValue;
			}
			for(int j = 0; j < EJ_03_Array.length; j++) {
				arraySum += EJ_03_Array[j];
			}
			System.out.println("La suma del contenido del array es: " + arraySum);
		}
	}
	public static void array_contenidos_random() {
		method_name = "Array con contenidos random";
		
		if (!buildingArray) {
			Scanner scan = new Scanner(System.in);
			System.out.println("¿Cual quiere que sea el tamaño del array?");
			int arraySize = scan.nextInt(), arrayMultiplication = 1;
			int[] EJ_04_Array = new int[arraySize];

			for(int i = 0; i < EJ_04_Array.length; i++) {
				EJ_04_Array[i] = (int)(Math.random() * 5) + 1;
			}
			for(int j = 0; j < EJ_04_Array.length; j++) {
				arrayMultiplication *= EJ_04_Array[j];
			}
			System.out.println("Multiplicacion de los contenidos del array: " + arrayMultiplication);
		}
	}
	public static void suma_dos_arrays() {
		method_name = "Suma de 2 arrays";
		
		if (!buildingArray) {
			Scanner scan = new Scanner(System.in);
			System.out.println("¿Cual quiere que sea el tamaño del array?");
			int arraySize = scan.nextInt();
			int[] EJ_05_Array_1 = new int[arraySize];
			int[] EJ_05_Array_2 = new int[arraySize];
			int[] EJ_05_Array_Sum = new int[arraySize];

			for(int i = 0; i < EJ_05_Array_1.length; i++) {
				EJ_05_Array_1[i] = (int)(Math.random() * 10) + 1;
				EJ_05_Array_2[i] = (int)(Math.random() * 10) + 1;
			}
			for(int j = 0; j < EJ_05_Array_Sum.length; j++) {
				EJ_05_Array_Sum[j] = EJ_05_Array_1[j] + EJ_05_Array_2[j];
			}
			System.out.println("Suma de arrays: " + Arrays.toString(EJ_05_Array_Sum));
		}
	}
	public static void buscar_numero_en_array() {
		method_name = "Buscar numero en un array";
		
		if (!buildingArray) {
			Scanner scan = new Scanner(System.in);
			System.out.println("¿Cual quiere que sea el tamaño del array?");
			int arraySize = scan.nextInt();
			boolean gotIt = false;
			int[] EJ_06_Array = new int[arraySize];

			for(int i = 0; i < EJ_06_Array.length; i++) {
				EJ_06_Array[i] = (int)(Math.random() * 10) + 1;
			}

			System.out.println("¿Que valor quiere buscar?");
			int numToLookFor = scan.nextInt();

			for(int j = 0; j < EJ_06_Array.length; j++) {
				if(numToLookFor == EJ_06_Array[j]) {
					gotIt = true;
					j = EJ_06_Array.length;
				}
			}

			System.out.println("Array: " + Arrays.toString(EJ_06_Array));
			if(gotIt) {
				System.out.println("He encontrado el numero " + numToLookFor + " en el array");
			} else {
				System.out.println("El numero " + numToLookFor + " no se encuentra en el array");
			}
		}
	}
	public static void rellenar_array_y_check_orden() {
		method_name = "Rellenar array y check orden";
		
		if (!buildingArray) {
			Scanner scan = new Scanner(System.in);
			System.out.println("¿Cuantos valores quiere introducir?");
			int arrayLength = scan.nextInt();
			boolean inOrder = true;

			int EJ_07_Array[] = new int[arrayLength];

			for(int i = 0; i < EJ_07_Array.length; i++) {
				System.out.println("Introduce el valor numero " + (i + 1));
				EJ_07_Array[i] = scan.nextInt();
			}

			for(int j = 0; j < EJ_07_Array.length - 1; j++) {
				if(EJ_07_Array[j] < EJ_07_Array[j + 1])
					inOrder = true;
				else {
					inOrder = false;
					j = EJ_07_Array.length;
				}
			}

			if(inOrder)
				System.out.println("Los valores estan ordenados de menor a mayor");
			else
				System.out.println("Los valores no estan ordenados");
		}
	}
	
	public static void array_izquierda_derecha() {
		method_name = "Array izquierda, derecha";
		
		if (!buildingArray) {
			Scanner scan = new Scanner(System.in);
			System.out.println("¿Cuantos valores quiere generar?");
			int arrayLength = scan.nextInt(), EJ_08_Array[] = new int[arrayLength];

			for(int i = 0; i < EJ_08_Array.length; i++) {
				EJ_08_Array[i] = (int)(Math.random() * 10);
			}

			array_de_izquierda_a_derecha(EJ_08_Array);
			array_de_derecha_a_izquierda(EJ_08_Array);
		}
	}
	public static void array_de_izquierda_a_derecha(int arrayName[]) {
		for(int i = 0; i < arrayName.length; i++) 
			System.out.print(arrayName[i] + " ");
		System.out.println();
	}
	public static void array_de_derecha_a_izquierda(int arrayName[]) {
		for(int i = arrayName.length - 1; i >= 0; i--) 
			System.out.print(arrayName[i] + " ");
		System.out.println();
	}
	
	public static void positivos_negativos_ceros() {
		method_name = "Cantidad de positivos, negativos y ceros";
		
		if (!buildingArray) {
			Scanner scan = new Scanner(System.in);
			System.out.println("¿Cuantos valores quiere introducir?");
			int arrayLength = scan.nextInt(), EJ_09_Array[] = new int[arrayLength], positive = 0, negative = 0, zero = 0;

			for(int i = 0; i < EJ_09_Array.length; i++) {
				System.out.println("Introduzca un numero...");
				EJ_09_Array[i] = scan.nextInt();
				if(EJ_09_Array[i] == 0)
					zero++;
				else if(EJ_09_Array[i] > 0)
					positive++;
				else if(EJ_09_Array[i] < 0)
					negative++;
			}
			System.out.print("Hay " + zero + " numeros nulos\nHay " + positive + " numeros positivos\nHay " + negative + " numeros negativos\n");
		}
	}
	public static void ordenacion_array() {
		method_name = "Ordenacion de array";
		
		if (!buildingArray) {
			Scanner scan = new Scanner(System.in);
			System.out.println("¿Cuantos valores quiere introducir?");
			int arrayLength = scan.nextInt();
			int[] EJ_10_Array = new int[arrayLength];

			for(int i = 0; i < EJ_10_Array.length; i++) {
				EJ_10_Array[i] = (int)(Math.random() * 100) + 1;
			}

			System.out.println(Arrays.toString(EJ_10_Array));
			int temp;
			for(int j = 0; j < EJ_10_Array.length - 1; j++) {
				for(int k = 0; k < EJ_10_Array.length - j - 1; k++) {
					if(EJ_10_Array[k + 1] < EJ_10_Array[k]) {
						temp = EJ_10_Array[k];
						EJ_10_Array[k] = EJ_10_Array[k + 1];
						EJ_10_Array[k + 1] = temp;
					}
				}
			}
			System.out.println(Arrays.toString(EJ_10_Array));
		}
	}
	public static void array_bidimensional() {
		method_name = "Array bidimensional";
		
		if (!buildingArray) {
			int[][] EJ_11_Array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		
			for(int i = 0; i < EJ_11_Array.length; i++)
				System.out.println(Arrays.toString(EJ_11_Array[i]));
		}
	}
	public static void sumar_array_bidimensional() {
		method_name = "Sumar valores de array bidimensional";
		
		if (!buildingArray) {
			int arraySize = 3, innerArraySize = arraySize, arraySum = 0;
			int[][] EJ_12_Array = new int[arraySize][innerArraySize];

			for(int i = 0; i < EJ_12_Array.length; i++) {
				for(int j = 0; j < EJ_12_Array[i].length; j++) {
					EJ_12_Array[i][j] = (int)(Math.random() * 10) + 1;
					arraySum += EJ_12_Array[i][j];
				}
			}
			for(int k = 0; k < EJ_12_Array.length; k++)
				System.out.println((k + 1) + ": " + Arrays.toString(EJ_12_Array[k]));
			System.out.println("La suma de todos los elementos del array es: " + arraySum);
		}
	}
}