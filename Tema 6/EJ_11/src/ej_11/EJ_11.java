package ej_11;
import java.util.*;

public class EJ_11 {
	public static void main(String[] args) {
		ArrayList<Book> bookList = new ArrayList<>();
		
		// Manually added books, comment them if you want to add the manually.
		addBook(bookList, "Shakespeare", 646846541, 10, "Santiago", "Rivera", 29, "Spain", "51703895X");
		addBook(bookList, "Librico", 41651, 12.95, "Horaz", "Muro", 22, "Spain", "85445351Y");
		addBook(bookList, "El otro saltamontes", 23135186, 11.99, "Robertino", "Abrego", 49, "Spain", "90891897Z");
		addBook(bookList, "Como matar a un profesor de matematicas", 1661849884, 1.99, "Diana", "Fonseca", 30, "Spain", "20478725P");
		
		execOption(bookList, listOptions());
	}
	
	public static int listOptions() {
		System.out.println("Choose what you want to do...");
		System.out.println("0. Exit");
		System.out.println("1. Add a book");
		System.out.println("2. Remove a book");
		System.out.println("3. List all books");
		System.out.println("4. Search for a book");
		
		return new Scanner(System.in).nextInt();
	}
	public static void execOption(ArrayList<Book> bookList, int option) { // Use the following syntax: execOption(ArrayListName, listOptions());
		switch(option) {
			case 0:
				return;
			case 1:
				addBook(bookList);
				break;
			case 2:
				removeBook(bookList);
				break;
			case 3:
				listAllBooks(bookList);
				execOption(bookList, listOptions());
				break;
			case 4:
				searchForABook(bookList);
				break;
			default:
				System.out.println("Choose a valid option.");
				execOption(bookList, listOptions());
				break;
		}
	}
	
	public static void addBook(ArrayList<Book> bookList) {
		bookList.add(new Book());
		
		execOption(bookList, listOptions());
	}
	public static void addBook(ArrayList<Book> bookList, String bookName, long bookISBN, double bookPrice, String authorName, String authorSurname, int authorAge, String authorNationality, String AuthorIDNumber) {
		bookList.add(new Book(bookName, bookISBN, bookPrice, new Author(authorName, authorSurname, authorAge, authorNationality, AuthorIDNumber)));
	}
	public static void removeBook(ArrayList<Book> bookList) {
		System.out.println("Enter the ID of the book you want to remove...");
		listAllBooks(bookList);
		
		int bookToRemove = new Scanner(System.in).nextInt();
		System.out.println(bookList.get(bookToRemove).getBookName() + " has been removed successfully.");
		bookList.remove(bookToRemove);
		
		execOption(bookList, listOptions());
	}
	public static void searchForABook(ArrayList<Book> bookList) {
		System.out.println("Which book do you want to look for?");
		String bookToLookFor = new Scanner(System.in).nextLine();
		
		for(int i = 0; i < bookList.size(); i++) {
			if(bookList.get(i).getBookName().contains(bookToLookFor)) {
				System.out.println("ID: " + i + " | Name: " + bookList.get(i).getBookName() + " | ISBN: " + bookList.get(i).getBookISBN() + " | Price: " + bookList.get(i).getBookPrice() + " | Author: " + bookList.get(i).getBookAuthor().getAuthorFullName() + " | Author age: " + bookList.get(i).getBookAuthor().getAuthorAge() + " | Author nationality: " + bookList.get(i).getBookAuthor().getAuthorNationality() + " | Author ID: " + bookList.get(i).getBookAuthor().getAuthorIDNumber());
			}
		}
		
		execOption(bookList, listOptions());
	}
	public static void listAllBooks(ArrayList<Book> bookList) {
		for(int i = 0; i < bookList.size(); i++) {
			System.out.println("ID: " + i + " | Name: " + bookList.get(i).getBookName() + " | ISBN: " + bookList.get(i).getBookISBN() + " | Price: " + bookList.get(i).getBookPrice() + " | Author: " + bookList.get(i).getBookAuthor().getAuthorFullName() + " | Author age: " + bookList.get(i).getBookAuthor().getAuthorAge() + " | Author nationality: " + bookList.get(i).getBookAuthor().getAuthorNationality() + " | Author ID: " + bookList.get(i).getBookAuthor().getAuthorIDNumber());
		}
	}
}