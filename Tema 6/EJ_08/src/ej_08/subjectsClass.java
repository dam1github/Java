package ej_08;
import java.util.*;

public class subjectsClass {
	public int subjectID;
	public String subjectName;
	
	public subjectsClass(int subjectID, String subjectName) {
		this.subjectID = subjectID;
		this.subjectName = subjectName;
	}
	
	public int getSubjectID() {
		return subjectID;
	}
	
	public String getSubjectName() {
		return subjectName;
	}
}