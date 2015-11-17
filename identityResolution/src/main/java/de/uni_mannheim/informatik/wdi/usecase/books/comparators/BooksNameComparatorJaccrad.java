package de.uni_mannheim.informatik.wdi.usecase.books.comparators;

import de.uni_mannheim.informatik.wdi.identityresolution.matching.Comparator;
import de.uni_mannheim.informatik.wdi.identityresolution.similarity.string.TokenizingJaccardSimilarity;
import de.uni_mannheim.informatik.wdi.usecase.books.Books;

public class BooksNameComparatorJaccrad extends Comparator<Books> {

	TokenizingJaccardSimilarity sim = new TokenizingJaccardSimilarity();
	
	@Override
	public double compare(Books record1, Books record2) {

		String bookTitle1 = record1.getBookName().toLowerCase(); //needs normalization eg.removing the brackets and whats in between them
		String bookTitle2 = record2.getBookName().toLowerCase();
		
		double similarity = sim.calculate(bookTitle1, bookTitle2);
		
		if(similarity<=0.3) {
			
			similarity = 0;
		}
		
		similarity *= similarity;
		
		return similarity;
	}
	

}
