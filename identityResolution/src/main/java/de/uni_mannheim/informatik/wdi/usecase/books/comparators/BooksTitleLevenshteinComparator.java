package de.uni_mannheim.informatik.wdi.usecase.books.comparators;

import de.uni_mannheim.informatik.wdi.identityresolution.matching.Comparator;
import de.uni_mannheim.informatik.wdi.identityresolution.similarity.string.LevenshteinSimilarity;
import de.uni_mannheim.informatik.wdi.usecase.books.Books;


public class BooksTitleLevenshteinComparator extends Comparator<Books>{

	
	public double compare(Books entity1, Books entity2) {
		
		String title1 = entity1.getBookName().replaceAll("\\s*\\([^\\)]*\\)\\s*", " ").toLowerCase();
		String title2 = entity2.getBookName().replaceAll("\\s*\\([^\\)]*\\)\\s*", " ").toLowerCase();
		
		LevenshteinSimilarity j = new LevenshteinSimilarity();
		
		double similarity = j.calculate(title1, title2);
		
		if (similarity <= 0.7){
			similarity = 0.0;
		}
		return similarity;
	}

	

}
