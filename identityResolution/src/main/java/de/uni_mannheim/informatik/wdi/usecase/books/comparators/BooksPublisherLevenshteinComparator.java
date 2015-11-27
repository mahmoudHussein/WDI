package de.uni_mannheim.informatik.wdi.usecase.books.comparators;

import de.uni_mannheim.informatik.wdi.identityresolution.matching.Comparator;
import de.uni_mannheim.informatik.wdi.identityresolution.similarity.string.LevenshteinSimilarity;
import de.uni_mannheim.informatik.wdi.usecase.books.Books;

public class BooksPublisherLevenshteinComparator extends Comparator<Books>{

	LevenshteinSimilarity sim = new LevenshteinSimilarity();
	
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
