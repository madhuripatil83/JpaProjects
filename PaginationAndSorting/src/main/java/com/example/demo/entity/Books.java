package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class Books {

	@Id
	Long bookId;
	
	String bookName;
	String bookAuthor;
	Double bookPrice;
	String authorId;
	
	public String getAuthorId() {
		return authorId;
	}
	public void setAuthorId(String authorId) {
		this.authorId = authorId;
	}
	
	

	
	public Long getBookId() {
		return bookId;
	}
	public void setBookId(Long bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public Double getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(Double bookPrice) {
		this.bookPrice = bookPrice;
	}
	
	@Override
	public String toString() {
		return "Books [bookId=" + bookId + ", bookName=" + bookName + ", bookAuthor=" + bookAuthor + ", bookPrice="
				+ bookPrice + ", authorId=" + authorId + "]";
	}
	
	
	
}
