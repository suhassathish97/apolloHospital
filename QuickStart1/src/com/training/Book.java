package com.training;

public class Book {
	
	public static final double discount = 0.86;
	private long bookId;
	private String bookName;
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + "]";
	}
	public long getBookId() {
		return bookId;
	}
	public void setBookId(long bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public static double getDiscount() {
		return discount;
	}
	public Book(long bookId, String bookName) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
