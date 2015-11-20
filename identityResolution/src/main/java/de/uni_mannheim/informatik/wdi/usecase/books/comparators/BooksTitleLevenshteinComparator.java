package de.uni_mannheim.informatik.wdi.usecase.books.comparators;

import de.uni_mannheim.informatik.wdi.identityresolution.matching.Comparator;
import de.uni_mannheim.informatik.wdi.identityresolution.similarity.string.LevenshteinSimilarity;
import de.uni_mannheim.informatik.wdi.identityresolution.similarity.string.TokenizingJaccardSimilarity;
import de.uni_mannheim.informatik.wdi.usecase.books.Books;


public class BooksTitleLevenshteinComparator extends Comparator<Books>{

	
	public double compare(Books entity1, Books entity2) {
		
		String title1 = entity1.getBookName().replaceAll("[^\\dA-Za-z ]", " ").toLowerCase();
		String title2 = entity2.getBookName().replaceAll("[^\\dA-Za-z ]", " ").toLowerCase();
		
		LevenshteinSimilarity j = new LevenshteinSimilarity();
		
		return j.calculate(title1, title2);
	}

	

}
