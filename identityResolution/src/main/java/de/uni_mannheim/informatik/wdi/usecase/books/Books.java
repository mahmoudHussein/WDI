package de.uni_mannheim.informatik.wdi.usecase.books;

import java.util.List;

import de.uni_mannheim.informatik.wdi.Record;

/*
 * <Book>
	<Id>GoodReads_2</Id>
	<ISBN>0-345-44926-3</ISBN>
	<Book_Name>The Book of Eli</Book_Name>
	<Authors>
		<Author>
			<Name>Ramsey Campbell</Name>
			<Birth_Name>kaza kaza</Birth_Name>
			<Birth_Date>1810-11-16</Birth_Date>
			<Birth_Place>Austrian Empire Prague</Birth_Place>
			<Occupation>Poet</Occupation>
			<Writing_Genre>Narrative poetry</Writing_Genre>
		</Author>
	</Authors>
	<Publisher>DAW Books</Publisher>
	<Publication_Country>United States</Publication_Country>
	<Publication_Date>2007</Publication_Date>
	<Pages>234</Pages>
	<Genre>Horror</Genre>
	<Rating>4.5</Rating>
</Book>
 */
public class Books extends Record{

	private String ISBN;
	private String book_name;
	private List<Authors> author;
	private String publisher;
	private String genre;
	private String pages;
	private String pubCountry;
	private String pubYear;
	private double rating;
	
	public Books(String identifier, String provenance) {
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
	
	public String getPages(){
		return this.pages;
	}
	
	public void setPages(String pages){
		this.pages = pages;
	}
	
	public String getPubCounrty(){
		return this.pubCountry;
	}
	
	public void setPubCountry(String country){
		this.pubCountry = country;
	}
	
	public String getYear(){
		return this.pubYear;
	}
	
	public void setYear(String year){
		this.pubYear = year;
	}
	
	public double getRating(){
		return this.rating;
	}
	
	public void setRating(double rating){
		this.rating = rating;
	}
	
}
