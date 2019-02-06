package ej_11;
import java.util.*;

public class Author {
	private String authorName, authorSurname, authorNationality, authorIDNumber;
	private int authorAge;
	
	public Author() {
		authorName = setAuthorName();
		authorSurname = setAuthorSurname();
		authorAge = setAuthorAge();
		authorNationality = setAuthorNationality();
		authorIDNumber = setAuthorID();
	}
	
	public Author(String authorName, String authorSurname, int authorAge, String authorNationality, String authorIDNumber) {
		this.authorName = authorName;
		this.authorSurname = authorSurname;
		this.authorAge = authorAge;
		this.authorNationality = authorNationality;
		this.authorIDNumber = authorIDNumber;
	}
	
	private String setAuthorName() {
		System.out.println("Set the author's name...");
		return scanString();
	}
	private String setAuthorSurname() {
		System.out.println("Set " + authorName + "'s surname...");
		return scanString();
	}
	private int setAuthorAge() {
		System.out.println("Set " + authorName + " " + authorSurname + "'s age...");
		return scanInt();
	}
	private String setAuthorNationality() {
		System.out.println("Set " + authorName + " " + authorSurname + "'s nationality...");
		return scanString();
	}
	private String setAuthorID() {
		System.out.println("Set " + authorName + " " + authorSurname + "'s ID number...");
		return scanString();
	}
	
	private String scanString() {
		return new Scanner(System.in).nextLine();
	}
	private int scanInt() {
		return (int)new Scanner(System.in).nextDouble();
	}
	
	public String getAuthorFullName() {
		return getAuthorName() + " " + getAuthorSurname();
	}
	public String getAuthorName() {
		return authorName;
	}
	public String getAuthorSurname() {
		return authorSurname;
	}
	public int getAuthorAge() {
		return authorAge;
	}
	public String getAuthorNationality() {
		return authorNationality;
	}
	public String getAuthorIDNumber() {
		return authorIDNumber;
	}
}