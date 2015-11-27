package de.uni_mannheim.informatik.wdi.usecase.books.comparators;

import de.uni_mannheim.informatik.wdi.identityresolution.matching.Comparator;
import de.uni_mannheim.informatik.wdi.usecase.books.Books;

public class BookPublicationDateComparator extends Comparator<Books> {

	public double compare(Books book1, Books book2){
		
		String year1 = book1.getYear();
		String year2 = book2.getYear();
		
		if(year1 == year2){
			return 1.0;
		}
		
		return 0.0;
	}
	
	
}
