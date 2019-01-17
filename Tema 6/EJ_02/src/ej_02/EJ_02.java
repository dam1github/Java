package ej_02;
import java.util.*;

public class EJ_02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("¿Cuantos alumnos quiere introducir?");
		int studentsLength = scan.nextInt();
		Student[] students = new Student[5];
	
		for(int i = 0; i < students.length; i++) {
			if(i == 0) 
				students[i] = new Student();
			else
				students[i] = new Student(0);
		}
		
		double averageGrade = 0;
		for(int j = 0; j < students.length; j++) {
			averageGrade += students[j].getStudentGrade();
			System.out.println("La nota de " + students[j].getStudentName() + " es: " + students[j].getStudentGrade());
		}
		averageGrade /= students.length;
		System.out.println("La nota media inicial es: " + averageGrade);
		

		// Actualizamos las notas sumandole 6 a cada uno...
		System.out.println("\nNombre y notas actualizadas de los alumno");
		double updatedAverageGrade = 0;
		for(int k = 0; k < students.length; k++) {
			students[k].setGrade(students[k].getStudentGrade() + 6);
			System.out.println("La nota de " + students[k].getStudentName() + " es: " + students[k].getStudentGrade());
			updatedAverageGrade += students[k].getStudentGrade();
		}
		updatedAverageGrade /= students.length;
		System.out.println("La nota media actualizada es: " + updatedAverageGrade);
		
	}
}