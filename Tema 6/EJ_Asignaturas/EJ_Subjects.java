package EJ_Subjects;
import java.util.*;

public class EJ_Subjects {
	public static void main(String[] args) {
		/**
		 *	Structure of Student's constructor: Student(studentName, studentSurname, studentAge, studentSubjectsQuantity) 
		 *	This file does not contain any way to prevent errors, it was made at 1AM ^‿^
		 */
		
		Student studentsArray[] = {
			new Student("Mario", "Andreas", 19, 2),
			new Student("Josh", "A", 22, 2),
			new Student("Jose", "Sandia", 20, 1) // Pobrecito de este por su apellido... Telita
		};
		
		printStudents(studentsArray);
	}
	
	public static void printStudents(Student studentsArray[]) {
		String andSeparator, studentNameAndSubjectGrade;
		for(int i = 0; i < studentsArray.length; i++) {
			andSeparator = " and ";
			System.out.print(studentsArray[i].getStudentName() + " is enrolled in ");
			for(int j = 0; j < studentsArray[i].getStudentSubjects().size(); j++) {
				if(j == studentsArray[i].getStudentSubjects().size() - 1)
					andSeparator = "\n";
				studentNameAndSubjectGrade = studentsArray[i].getStudentSubjects().get(j).getSubjectName() + " with a " + studentsArray[i].getStudentSubjects().get(j).getStudentSubjectGrade();
				System.out.print(studentNameAndSubjectGrade + andSeparator);
			}
		}
	}
}