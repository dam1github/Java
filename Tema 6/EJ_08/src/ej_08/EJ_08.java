package ej_08;
import java.util.*;

public class EJ_08 {
	public static void main(String[] args) {
		subjectsClass subjects[] = {
									new subjectsClass(0, "Matematicas"), 
									new subjectsClass(1, "Fisica"),
									new subjectsClass(2, "Lengua"),
									new subjectsClass(3, "Historia")
		};
		
		// Shows all the subjects with their ID's at the start
	/*	for(int i = 0; i < subjects.length; i++) {
			System.out.println("ID: " + subjects[i].getSubjectID() + " - Asignatura: " + subjects[i].getSubjectName());
		}*/
		
		studentsClass Juan = new studentsClass(subjects);
		
		System.out.println(Juan.getStudentName() + " esta matriculado en: ");
		String separator;
		for(int j = 0; j < Juan.studentSubjects.size(); j++) {
			if(j != Juan.studentSubjects.size() - 1)
				separator = " | ";
			else
				separator = "";
			System.out.print(subjects[Juan.studentSubjects.get(j).get(0)].getSubjectName() + " con un " + Juan.studentSubjects.get(j).get(1) + separator); // Nombre de la asignatura
		}	System.out.println();
		
		
		// Esto es lo que le voy a pasar -> [[0, 10], [1, 5]]
	//	studentsClass("Juan", [[0, 10], [1, 5]])
	}
}