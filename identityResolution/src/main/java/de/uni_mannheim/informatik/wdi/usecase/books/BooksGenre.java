package de.uni_mannheim.informatik.wdi.usecase.books;

import java.util.List;

import de.uni_mannheim.informatik.wdi.Record;

public class BooksGenre extends Record {

	/*
	 * <Book>
		<Id>DbpediaBooksGenre_1</Id>
		<ISBN>ISBN 0-575-07905-3</ISBN>
		<Book_Name>Dreamsongs: A RRetrospective</Book_Name>
		<Author>
			<Name>George R. R. Martin</Name>
		</Author>
		<Publisher>Victor Gollancz Ltd</Publisher>
		<Genre>Short story</Genre>
	</Book>
	 */
	
	private String ISBN;
	private String book_name;
	private List<Authors> author;
	private String publisher;
	private String genre;
	
	public BooksGenre(String identifier, String provenance) {
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
	
	public String getGenre(){
		return this.genre;
	}
	
	public void setGenre(String genre){
		this.genre = genre;
	}
}
