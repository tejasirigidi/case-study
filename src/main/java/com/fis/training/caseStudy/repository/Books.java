package com.fis.training.caseStudy.repository;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.Generated;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Books")
public class Books {
	
	@Id
	@Column(name = "Book_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Book_id;
	
	@Column(name = "Book_name")
	private String Book_name;
	
	@Column(name = "Author")
	private String Author;
	
	@Column(name = "Avail_copies")
	private int Avail_copies;
	
	@Column(name = "Total_copies")
	private int Total_copies;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "book_id", referencedColumnName = "Book_id")
	private List<Subscriptions> subscriptions = new ArrayList<>();


	public int getBook_id() {
		return Book_id;
	}


	public void setBook_id(int book_id) {
		Book_id = book_id;
	}


	public String getBook_name() {
		return Book_name;
	}


	public void setBook_name(String book_name) {
		Book_name = book_name;
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


	public List<Subscriptions> getSubscriptions() {
		return subscriptions;
	}


	public void setSubscriptions(List<Subscriptions> subscriptions) {
		this.subscriptions = subscriptions;
	}
	

}
