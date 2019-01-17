package ej_02;
import java.util.*;

public class Student {
	public String studentName;
	public double studentGrade;
	
	public Student() {
		studentName = null;
		studentGrade = 0;
	}
	
	public Student(double studentGrade) {
		System.out.println("Introduzca el nombre del alumno...");
		this.studentName = setStudentName();
		System.out.println("Introduzca la nota de " + studentName + "...");
		this.studentGrade = setStudentGrade();
	}
	
	public void setGrade(double studentGrade) {
		this.studentGrade = studentGrade;
	}
	
	public String setStudentName() {
		Scanner scan = new Scanner(System.in);
		return scan.next();
	}
	
	public double setStudentGrade() {
		Scanner scan = new Scanner(System.in);
		return scan.nextDouble();
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public double getStudentGrade() {
		return studentGrade;
	}
}