package de.uni_mannheim.informatik.wdi.usecase.books;

import java.util.List;

import org.w3c.dom.Node;

import de.uni_mannheim.informatik.wdi.MatchableFactory;

public class BooksPagesFactory extends MatchableFactory<BooksPages> {

	public BooksPages createModelFromElement(Node node, String provenanceInfo) {
		String id = getValueFromChildElement(node, "Id");
		
		// create the object with id and provenance information
		BooksPages pages = new BooksPages(id, provenanceInfo);
		
		// fill the attributes
		pages.setISBN(getValueFromChildElement(node, "ISBN"));
		pages.setBookName(getValueFromChildElement(node, "Book_Name"));
		pages.setPublisher(getValueFromChildElement(node, "Publisher"));
		pages.setPages(getValueFromChildElement(node, "Pages"));
		List<Authors> authors = getObjectListFromChildElement(node, "Authors", "Author", new AuthorsFactory(), provenanceInfo);
		pages.setAuthor(authors);
		return pages;
	}
}
