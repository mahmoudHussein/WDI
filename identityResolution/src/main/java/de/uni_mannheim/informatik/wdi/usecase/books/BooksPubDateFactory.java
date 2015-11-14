package de.uni_mannheim.informatik.wdi.usecase.books;

import java.util.List;

import org.w3c.dom.Node;

import de.uni_mannheim.informatik.wdi.MatchableFactory;

public class BooksPubDateFactory extends MatchableFactory<BooksPubDate> {

	public BooksPubDate createModelFromElement(Node node, String provenanceInfo) {
		String id = getValueFromChildElement(node, "Id");
		
		// create the object with id and provenance information
		BooksPubDate pubDate = new BooksPubDate(id, provenanceInfo);
		
		// fill the attributes
		pubDate.setISBN(getValueFromChildElement(node, "ISBN"));
		pubDate.setBookName(getValueFromChildElement(node, "Book_Name"));
		pubDate.setPublisher(getValueFromChildElement(node, "Publisher"));
		pubDate.setYear(getValueFromChildElement(node, "Publication_Date"));
		List<Authors> authors = getObjectListFromChildElement(node, "Authors", "Author", new AuthorsFactory(), provenanceInfo);
		pubDate.setAuthor(authors);
		return pubDate;
	}
}
