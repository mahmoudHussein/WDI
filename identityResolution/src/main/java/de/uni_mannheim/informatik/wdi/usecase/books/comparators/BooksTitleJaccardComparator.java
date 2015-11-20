package de.uni_mannheim.informatik.wdi.usecase.books.comparators;

import de.uni_mannheim.informatik.wdi.identityresolution.matching.Comparator;
import de.uni_mannheim.informatik.wdi.identityresolution.similarity.string.TokenizingJaccardSimilarity;
import de.uni_mannheim.informatik.wdi.usecase.books.Books;


public class BooksTitleJaccardComparator extends Comparator<Books>{

	
	public double compare(Books entity1, Books entity2) {
		
		String title1 = entity1.getBookName().replaceAll("\\s*\\([^\\)]*\\)\\s*", " ").toLowerCase();
		String title2 = entity2.getBookName().replaceAll("\\s*\\([^\\)]*\\)\\s*", " ").toLowerCase();
		
		TokenizingJaccardSimilarity j = new TokenizingJaccardSimilarity();
		
		return j.calculate(title1, title2);
	}

	

}
