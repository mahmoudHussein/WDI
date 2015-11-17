package de.uni_mannheim.informatik.wdi.usecase.books.comparators;

import de.uni_mannheim.informatik.wdi.identityresolution.matching.Comparator;
import de.uni_mannheim.informatik.wdi.identityresolution.similarity.string.LevenshteinSimilarity;
import de.uni_mannheim.informatik.wdi.usecase.books.Books;
import de.uni_mannheim.informatik.wdi.usecase.movies.Movie;

public class BooksNameComparatorLevenstein extends Comparator<Books> {

private LevenshteinSimilarity sim = new LevenshteinSimilarity();
	
	@Override
	public double compare(Books entity1, Books entity2) {
		return sim.calculate(entity1.getBookName(), entity2.getBookName());
	}
}
