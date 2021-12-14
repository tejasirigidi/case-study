package com.fis.training.caseStudy.repository;

public class booksDto {

	private Integer bookId;

	private String bookName;

	private String Author;

	private int Avail_copies;

	private int Total_copies;

	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return Author;
	}

	public void setAuthor(String author) {
		Author = author;
	}

	public int getAvail_copies() {
		return Avail_copies;
	}

	public void setAvail_copies(int avail_copies) {
		Avail_copies = avail_copies;
	}

	public int getTotal_copies() {
		return Total_copies;
	}

	public void setTotal_copies(int total_copies) {
		Total_copies = total_copies;
	}

}
