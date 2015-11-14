package de.uni_mannheim.informatik.wdi.usecase.books;

import java.util.List;

import org.w3c.dom.Node;

import de.uni_mannheim.informatik.wdi.MatchableFactory;

public class BooksPubCountryFactory extends MatchableFactory<BooksPubCountry> {

	public BooksPubCountry createModelFromElement(Node node, String provenanceInfo) {
		String id = getValueFromChildElement(node, "Id");
		
		// create the object with id and provenance information
		BooksPubCountry pubCountry = new BooksPubCountry(id, provenanceInfo);
		
		// fill the attributes
		pubCountry.setISBN(getValueFromChildElement(node, "ISBN"));
		pubCountry.setBookName(getValueFromChildElement(node, "Book_Name"));
		pubCountry.setPublisher(getValueFromChildElement(node, "Publisher"));
		pubCountry.setPubCountry(getValueFromChildElement(node, "Publication_Country"));
		List<Authors> authors = getObjectListFromChildElement(node, "Authors", "Author", new AuthorsFactory(), provenanceInfo);
		pubCountry.setAuthor(authors);
		return pubCountry;
	}
}
