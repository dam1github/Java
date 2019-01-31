package ej_08;
import java.util.*;

public class studentsClass {
	public String studentName;
	public int studentEnrolledSubjectsQuantity;
	// ArrayList of the subjects the student is enrolled on. I want it to be a 2D ArrayList. ///TODO///
	// Format: (Student)[subjectID, studentSubjectGrade]
	public ArrayList<ArrayList<Integer>> studentSubjects;
	
	public studentsClass(subjectsClass subjects[]) {
		studentName = setStudentName();
		studentEnrolledSubjectsQuantity = setStudentEnrolledSubjectsQuantity();
		setStudentSubjectsScanner(subjects);
	}
	
/*	public studentsClass(String studentName, studentsClass studentSubjects[]) {
		this.studentName = studentName;
	//	this.studentSubjects[] = 
	}*/
	
	public String setStudentName() {
		System.out.println("Escriba el nombre del alumno...");
		return stringScan();
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public String stringScan() {
		Scanner scan = new Scanner(System.in);
		return scan.next();
	}
	
	public int setStudentEnrolledSubjectsQuantity() {
		System.out.println("Escriba la cantidad de asignaturas en las que esta matriculado " + studentName + "...");
		return intScan();
	}
	
	public int getStudentEnrolledSubjectsQuantity() {
		return studentEnrolledSubjectsQuantity;
	}
	
	public int intScan() {
		Scanner scan = new Scanner(System.in);
		return scan.nextInt();
	}
	
	public double setStudentSubjectGrade() {
		System.out.println("Escriba la nota de la asignatura...");
		return doubleScan();
	}
	
/*	public double getStudentSubjectGrade() {
		return studentSubjectGrade;
	}*/
	
	public double doubleScan() {
		Scanner scan = new Scanner(System.in);
		return scan.nextDouble();
	}
	
	public void setStudentSubjectsScanner(subjectsClass subjects[]) {
		studentSubjects = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		// Create an array of arrays
		for(int i = 0; i < studentEnrolledSubjectsQuantity; i++) {
			studentSubjects.add(new ArrayList<>());
		}
		
		// Define the subjectID and the studentSubjectGrade inside the array of length 2.
		for(int j = 0; j < studentSubjects.size(); j++) {
			for(int k = 0; k < 2; k++) {
				if(k == 0) {
					for(int l = 0; l < subjects.length; l++) {
						System.out.print("(" + subjects[l].getSubjectName() + " | ID: " + subjects[l].getSubjectID() + ")");
					}	System.out.println();
					studentSubjects.get(j).add(scan.nextInt()); // I need to get the subject ID
				}
				else {
					System.out.println("Introduzca la nota de la asignatura " + (subjects[studentSubjects.get(j).get(0)].getSubjectName()));
					studentSubjects.get(j).add((int)(scan.nextDouble())); // I need to get the subjectGrade
				}
			}
		}
	}
	
	public ArrayList<ArrayList<Integer>> getStudentSubjects() {
		return studentSubjects;
	}
}
