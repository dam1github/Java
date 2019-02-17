package EJ_Subjects;
import java.util.*;

public class Subject {
	private String studentName, subjectName;
	private int studentSubjectGrade;
	private String subjectNames[] = {
		"Mathematics", "Computer Science", "English", "Geography", "History", "Chemistry", "Art", "Music"
	};
	
	// Subject constructor that takes the studentName as a parameter
	public Subject(String studentName) {
		this.studentName = studentName;
		subjectName = setSubjectName();
		studentSubjectGrade = setStudentSubjectGrade(studentName);
	}
	// Subject constructor that takes the studentName, subjectName and studentSubjectGrade as parameters
	public Subject(String studentName, String subjectName, int studentSubjectGrade) {
		this.studentName = studentName;
		this.subjectName = subjectName;
		this.studentSubjectGrade = studentSubjectGrade;
	}
	
	// Set methods
	private String setSubjectName() {
		System.out.println("What's the ID of the subject " + studentName + " is enrolled in?");
		printAllSubjects();
		return subjectNames[(scanInt() - 1)];
	}
	private int setStudentSubjectGrade(String studentName) {
		System.out.println("What's " + studentName + "'s grade for " + subjectName + "?");
		return scanInt();
	}
	
	// Method to scan Integers
	private int scanInt() {
		return new Scanner(System.in).nextInt();
	}
	
	// Get methods
	public String getSubjectName() {
		return subjectName;
	}
	public int getStudentSubjectGrade() {
		return studentSubjectGrade;
	}
	
	// This is used when we give the file executer a choice to pick an ID of a subject and save it in an array
	private void printAllSubjects() {
		String printSeparator = " | ";
		for(int i = 0; i < subjectNames.length; i++) {
			if(i == subjectNames.length - 1)
				printSeparator = " |\n";
			System.out.print("ID: " + (i + 1) + " " + subjectNames[i] + printSeparator);
		}
	}
}