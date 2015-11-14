package de.uni_mannheim.informatik.wdi.usecase.books;

import java.util.List;

import de.uni_mannheim.informatik.wdi.Record;

public class BooksPubCountry extends Record {

	/*
	 * <Book>
		<Id>DbpediaBooksPubCounrty_1</Id>
		<ISBN>9781551668659</ISBN>
		<Book_Name>Getting Rid of Bradley</Book_Name>
		<Author>
			<Name>Jennifer Crusie</Name>
		</Author>
		<Publisher>Mira Books</Publisher>
		<Publication_Country>United States</Publication_Country>
	</Book>
	 */
	private String ISBN;
	private String book_name;
	private List<Authors> author;
	private String publisher;
	private String pubCountry;
	

	public BooksPubCountry(String identifier, String provenance) {
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
	
	public String getPubCounrty(){
		return this.pubCountry;
	}
	
	public void setPubCountry(String country){
		this.pubCountry = country;
	}
}
