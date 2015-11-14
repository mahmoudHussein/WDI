package de.uni_mannheim.informatik.wdi.usecase.books;

import java.util.List;

import org.w3c.dom.Node;

import de.uni_mannheim.informatik.wdi.MatchableFactory;

public class BooksFactory extends MatchableFactory<Books> {

	public Books createModelFromElement(Node node, String provenanceInfo) {
		String id = getValueFromChildElement(node, "Id");
		
		// create the object with id and provenance information
		Books book = new Books(id, provenanceInfo);
		
		// fill the attributes
		book.setISBN(getValueFromChildElement(node, "ISBN"));
		book.setBookName(getValueFromChildElement(node, "Book_Name"));
		book.setPublisher(getValueFromChildElement(node, "Publisher"));
		book.setYear(getValueFromChildElement(node, "Publication_Date"));
		List<Authors> authors = getObjectListFromChildElement(node, "Authors", "Author", new AuthorsFactory(), provenanceInfo);
		book.setAuthor(authors);
		book.setGenre(getValueFromChildElement(node, "Genre"));
		book.setPages(getValueFromChildElement(node, "Pages"));
		book.setPubCountry(getValueFromChildElement(node, "Publication_Country"));
		book.setRating(getValueFromChildElement(node, "Rating"));
		return book;
	}
}
