package de.uni_mannheim.informatik.wdi.usecase.books;

import java.util.List;

import org.w3c.dom.Node;

import de.uni_mannheim.informatik.wdi.MatchableFactory;

public class BooksGenreFactory extends MatchableFactory<BooksGenre> {

	public BooksGenre createModelFromElement(Node node, String provenanceInfo) {
		String id = getValueFromChildElement(node, "Id");
		
		// create the object with id and provenance information
		BooksGenre genre = new BooksGenre(id, provenanceInfo);
		
		// fill the attributes
		genre.setISBN(getValueFromChildElement(node, "ISBN"));
		genre.setBookName(getValueFromChildElement(node, "Book_Name"));
		genre.setPublisher(getValueFromChildElement(node, "Publisher"));
		genre.setGenre(getValueFromChildElement(node, "Genre"));
		List<Authors> authors = getObjectListFromChildElement(node, "Authors", "Author", new AuthorsFactory(), provenanceInfo);
		genre.setAuthor(authors);
		return genre;
	}
}
