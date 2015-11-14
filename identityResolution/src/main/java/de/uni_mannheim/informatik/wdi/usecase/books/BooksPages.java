package de.uni_mannheim.informatik.wdi.usecase.books;

import java.util.List;

import de.uni_mannheim.informatik.wdi.Record;

public class BooksPages extends Record {

	/*
	<Book>
	<Id>DbpediaBooksPage_1</Id>
	<ISBN>978-0-684-85350-5</ISBN>
	<Book_Name>Bag of Bones</Book_Name>
	<Author>
		<Name>Stephen King</Name>
	</Author>
	<Publisher>Charles Scribner's Sons</Publisher>
	<Pages>660</Pages>
	</Book>
*/	
	private String ISBN;
	private String book_name;
	private List<Authors> author;
	private String publisher;
	private String pages;
	
	public BooksPages(String identifier, String provenance) {
		super(identifier, provenance);

	}
	
	public String getISBN(){
		return this.ISBN;
	}
	
	public void setISBN(String isbn){
		this.ISBN = isbn;
	}
	
	public String getBookName(){
		return this.book_name;
	}
	
	public void setBookName(String bookName){
		this.book_name = bookName;
	}
	
	public List<Authors> getAuthors(){
		return this.author;
	}
	
	public void setAuthor(List<Authors> author){
		this.author = author;
	}
	
	public String getPublisher(){
		return this.publisher;
	}
	
	public void setPublisher(String publisher){
		this.publisher = publisher;
	}
	
	public String getPages(){
		return this.pages;
	}
	
	public void setPages(String pages){
		this.pages = pages;
	}
}
