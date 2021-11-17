package com.advancedjava;

import com.advancedjava.*;
import java.util.ArrayList;
import java.util.HashMap;

public class Exx10Streams {

	public static void main(String[] args) {
		ArrayList<Book> books = populateLibrary();

		books.stream()
			.filter(book-> book.getAuthor().startsWith("B"))
			.forEach(System.out::println);


	}

	private static ArrayList<Book> populateLibrary() {
		ArrayList<Book> list = new ArrayList();
		list.add(new Book("Bodrul", "Funcitonal programming"));
		list.add(new Book("Bodrul", "Funcitonal programming"));
		list.add(new Book("Khalil", "Hello programming"));
		list.add(new Book("Rakib", "Funcitonal programming"));
		list.add(new Book("Bodrul", "Funcitonal programming"));
		list.add(new Book("Bodrul", "Funcitonal programming"));


		return list;
	}

}

class Book {

	private String author;
	private String title;

	public Book(String author, String title) {
		this.author = author;
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book{" + "author=" + author + ", title=" + title + '}';
	}
	

}
