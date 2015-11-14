package de.uni_mannheim.informatik.wdi.usecase.books;

import java.util.List;

import de.uni_mannheim.informatik.wdi.Record;

public class BooksPubDate extends Record{

	/*
	 * <Book>
		<Id>DbpediaBooksPubDate_1</Id>
		<ISBN>0</ISBN>
		<Book_Name>Running Dog (novel)</Book_Name>
		<Author>
			<Name>Don DeLillo</Name>
		</Author>
		<Publisher>Alfred A. Knopf</Publisher>
		<Publication_Date>1978</Publication_Date>
	</Book>
	
	 */
	
	private String ISBN;
	private String book_name;
	private List<Authors> author;
	private String publisher;
	private String year;
	
	public BooksPubDate(String identifier, String provenance) {
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
	
	public String getYear(){
		return this.year;
	}
	
	public void setYear(String year){
		this.year = year;
	}
	

}
