package EJ_Subjects;
import java.util.*;

public class Student {
	private String studentName, studentSurname;
	private int studentAge, studentSubjectsQuantity;
	private ArrayList<Subject> studentSubjectsArray = new ArrayList<>(), studentSubjects;
	
	// Student constructor
	public Student() {
		studentName = setStudentName();
		studentSurname = setStudentSurname();
		studentAge = setStudentAge();
		studentSubjectsQuantity = setStudentSubjectsQuantity();
		studentSubjects = setStudentSubjects();
	}
	// Student constructor with parameters
	public Student(String studentName, String studentSurname, int studentAge, int studentSubjectsQuantity) {
		this.studentName = studentName;
		this.studentSurname = studentSurname;
		this.studentAge = studentAge;
		this.studentSubjectsQuantity = studentSubjectsQuantity;
		studentSubjects = setStudentSubjects();
	}
	
	// Set methods
	private String setStudentName() {
		return scanString();
	}
	private String setStudentSurname() {
		return scanString();
	}
	private int setStudentAge() {
		return scanInt();
	}
	private int setStudentSubjectsQuantity() {
		System.out.println("In how many subjects is " + studentName + " enrolled in?");
		return scanInt();
	}
	private ArrayList<Subject> setStudentSubjects() {
		for(int i = 0; i < studentSubjectsQuantity; i++)
			studentSubjectsArray.add(new Subject(studentName));
		
		return studentSubjectsArray;
	}
	
	// Method to scan Strings
	private String scanString() {
		return new Scanner(System.in).nextLine();
	}
	// Method to scan Integers
	private int scanInt() {
		return new Scanner(System.in).nextInt();
	}
	
	// Get methods
	public String getStudentName() {
		return studentName;
	}
	public String getStudentSurname() {
		return studentSurname;
	}
	public int getStudentAge() {
		return studentAge;
	}
	public ArrayList<Subject> getStudentSubjects() {
		return studentSubjects;
	}
}