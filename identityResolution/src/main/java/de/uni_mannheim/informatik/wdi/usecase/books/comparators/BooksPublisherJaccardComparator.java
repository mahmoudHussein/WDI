package de.uni_mannheim.informatik.wdi.usecase.books.comparators;

import de.uni_mannheim.informatik.wdi.identityresolution.matching.Comparator;
import de.uni_mannheim.informatik.wdi.identityresolution.similarity.string.TokenizingJaccardSimilarity;
import de.uni_mannheim.informatik.wdi.usecase.books.Books;
import de.uni_mannheim.informatik.wdi.usecase.movies.Movie;

public class BooksPublisherJaccardComparator extends Comparator<Books>{

	TokenizingJaccardSimilarity sim = new TokenizingJaccardSimilarity();

	public double compare(Books entity1, Books entity2) {
		
		String pub1 = entity1.getPublisher().replaceAll("\\s*\\([^\\)]*\\)\\s*", " ").toLowerCase();
		String pub2 = entity2.getPublisher().replaceAll("\\s*\\([^\\)]*\\)\\s*", " ").toLowerCase();
		
		
		// calculate similarity
		double similarity = sim.calculate(pub1, pub2);
		
		// postprocessing
		if(similarity<=0.3) {
			similarity = 0;
		}
		
		similarity *= similarity;
		
		return similarity;
	}
}
