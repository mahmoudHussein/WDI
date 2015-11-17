package de.uni_mannheim.informatik.wdi.usecase.books.comparators;

import java.util.ArrayList;
import java.util.List;

import de.uni_mannheim.informatik.wdi.identityresolution.matching.Comparator;
import de.uni_mannheim.informatik.wdi.usecase.books.Authors;
import de.uni_mannheim.informatik.wdi.usecase.books.Books;

public class BooksAuthorsExactComparator extends Comparator<Books> {

public double compare(Books entity1, Books entity2) {
		
		// preprocessing
		List<Authors> authorList1 = entity1.getAuthors();
		List<Authors> authorList2 = entity2.getAuthors();
		
		ArrayList<String> authorNames1 = new ArrayList<String>();
		ArrayList<String> authorNames2 = new ArrayList<String>();
		
		int listLength1 = authorNames1.size();
		int listLength2 = authorNames2.size();
		
		int counter = 0;
		// calculate similarity
		double similarity = 0.0;
		
		//adding the author names into a separate arraylists
		for(Authors author: authorList1){
			String name = author.getAuthorName().toLowerCase();
			authorNames1.add(name);
		}
		
		for(Authors author: authorList2){
			String name = author.getAuthorName().toLowerCase();
			authorNames2.add(name);
		}
		
		//making sure that each list contains the names in the other for an exact replica
	if(authorNames1.size() >= authorNames2.size() && authorNames2 != null && authorNames2.size() > 0 && !authorNames2.isEmpty()){	
		for(String s: authorNames1){
			if(authorNames2.contains(s)){
				counter++;
			}
		}
		if(authorNames1.size() == counter){
			similarity = 1.0;
		}
	}
		
		if(authorNames2.size() >= authorNames1.size() && authorNames1 != null && authorNames1.size() > 0 && !authorNames1.isEmpty()){	
			for(String s: authorNames2){
				if(authorNames1.contains(s)){
					counter++;
				}
			}
			
			if(authorNames2.size() == counter){
				similarity = 1.0;
			}
		}
		
		return similarity;
	}
}
