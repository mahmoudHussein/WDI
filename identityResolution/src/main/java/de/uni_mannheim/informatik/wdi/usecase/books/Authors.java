package de.uni_mannheim.informatik.wdi.usecase.books;

import org.joda.time.DateTime;

import de.uni_mannheim.informatik.wdi.Record;

/*
 * <Book>
		<Id>DbpediaAuthors_1</Id>
		<Author>
			<Name>Mika Waltari</Name>
			<Birth_Date>1908-09-19</Birth_Date>
			<Birth_Place>Finland, Grand Duchy of Finland, Helsinki</Birth_Place>
			<Occupation>Author, translator, academician</Occupation>
		</Author>
		<Writing_Genre>Historical fiction</Writing_Genre>
	</Book>
 */
public class Authors extends Record {

	private String authorName;
	private DateTime birthDate;
	private String birthPlace;
	private String occupation;
	private String writingGenre;
	
	public Authors(String identifier, String provenance) {
		super(identifier, provenance);

	}

	public String getAuthorName(){
		return this.authorName;
	}
	
	public void setAuthorName(String author){
		this.authorName = author;
	}
	
	public DateTime getBirthDate(){
		return this.birthDate;
	}
	
	public void setBirthDate(DateTime birthdate){
		this.birthDate = birthdate;
	}
	
	public String getOccupation(){
		return this.occupation;
	}
	
	public void setOccupation(String occupation){
		this.occupation = occupation;
	}
	
	public String getwritingGenre(){
		return this.writingGenre;
	}
	
	public void setwritingGenre(String genre){
		this.writingGenre = genre;
	}
	
	public String getBirthPlace(){
		return this.birthPlace;
	}
	
	public void setBirthPlace(String place){
		this.birthPlace = place;
	}
	
	
}
