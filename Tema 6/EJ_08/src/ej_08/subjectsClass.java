package ej_08;
import java.util.*;

public class subjectsClass {
	public int subjectID;
	public String subjectName;
	
	public subjectsClass(int subjectID, String subjectName) {
		this.subjectID = subjectID;
		this.subjectName = subjectName;
	}
	
/*	public String getSubject(int subjectID) {
		String subjectNameByID;
		if(subjectID == 1)
			subjectNameByID = firstSubjectName;
		else if(subjectID == 2)
			subjectNameByID = secondSubjectName;
		else 
			subjectNameByID = null;
		
		return subjectNameByID;
	}*/
}