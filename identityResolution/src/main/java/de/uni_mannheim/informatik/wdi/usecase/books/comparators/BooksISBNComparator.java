package de.uni_mannheim.informatik.wdi.usecase.books.comparators;

import de.uni_mannheim.informatik.wdi.identityresolution.matching.Comparator;
import de.uni_mannheim.informatik.wdi.identityresolution.similarity.EqualsSimilarity;
import de.uni_mannheim.informatik.wdi.usecase.books.Books;

public class BooksISBNComparator extends Comparator<Books> {

	private EqualsSimilarity<String> sim = new EqualsSimilarity<String>();

	public double compare(Books entity1, Books entity2) {

		// Pre-processing
		String ISBN1 = entity1.getISBN().replaceAll("\\(.*?\\)", "").replaceAll("[^\\dxX]","");
		String ISBN2 = entity2.getISBN().replaceAll("\\(.*?\\)", "").replaceAll("[^\\dxX]","");

		//Calculates Similarity between two ISBNs.
		//Since ISBNs are considered universal identifiers for books,  
		//they will matched for exact similarity
		double similarity = sim.calculate(ISBN1, ISBN2);
		
		if (similarity <= 0.7){
			similarity = 0.0;
		}

		return similarity;
	}
}
