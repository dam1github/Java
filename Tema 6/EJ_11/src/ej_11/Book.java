package ej_11;
import java.util.*;

public class Book {
	public String bookName;
	public long bookISBN;
	public double bookPrice;
	
	public Book() {
		bookName = setName();
		bookISBN = setISBN();
		bookPrice = setPrice();
	}
	
	public Book(String bookName, long bookISBN, double bookPrice) {
		this.bookName = bookName;
		this.bookISBN = bookISBN;
		this.bookPrice = bookPrice;
	}
	
	public String setName() {
		System.out.println("Set the books name...");
		return scanString();
	}
	
	public long setISBN() {
		System.out.println("Set \"" + bookName + "\"'s ISBN...");
		return scanLong();
	}
	
	public double setPrice() {
		System.out.println("Set \"" + bookName + "\"'s price...");
		return scanDouble();
	}
	
	public long scanLong() {
		return new Scanner(System.in).nextLong();
	}
	
	public String scanString() {
		return new Scanner(System.in).nextLine();
	}
	
	public double scanDouble() {
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
}