package ej_11;
import java.util.*;

public class Book {
	private String bookName;
	private long bookISBN;
	private double bookPrice;
	private Author bookAuthor;
	
	public Book() {
		bookName = setName();
		bookISBN = setISBN();
		bookPrice = setPrice();
		bookAuthor = new Author();
	}
	
	public Book(String bookName, long bookISBN, double bookPrice, Author bookAuthor) {
		this.bookName = bookName;
		this.bookISBN = bookISBN;
		this.bookPrice = bookPrice;
		this.bookAuthor = bookAuthor;
	}
	
	private String setName() {
		System.out.println("Set the books name...");
		return scanString();
	}
	private long setISBN() {
		System.out.println("Set \"" + bookName + "\"'s ISBN...");
		return scanLong();
	}
	private double setPrice() {
		System.out.println("Set \"" + bookName + "\"'s price...");
		return scanDouble();
	}
	
	private long scanLong() {
		return new Scanner(System.in).nextLong();
	}
	private String scanString() {
		return new Scanner(System.in).nextLine();
	}
	private double scanDouble() {
		double bookPriceDouble = 0; // Initialized to 0 because we overwrite it later on.
		try {
			bookPriceDouble = new Scanner(System.in).nextDouble();
		} catch (Exception e) {
			System.out.println("Type in only numbers. Remember to use commas ',' as decimals.");
			bookPrice = setPrice();
		}
		
		return bookPriceDouble;
	}
	
	public String getBookName() {
		return bookName;
	}
	public long getBookISBN() {
		return bookISBN;
	}
	public double getBookPrice() {
		return bookPrice;
	}
	public Author getBookAuthor() {
		return bookAuthor;
	}
}