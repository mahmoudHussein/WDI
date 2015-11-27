package de.uni_mannheim.informatik.wdi.usecase.books.comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import de.uni_mannheim.informatik.wdi.identityresolution.matching.Comparator;
import de.uni_mannheim.informatik.wdi.identityresolution.similarity.string.TokenizingJaccardSimilarity;
import de.uni_mannheim.informatik.wdi.usecase.books.Authors;
import de.uni_mannheim.informatik.wdi.usecase.books.Books;

public class BooksAuthorsComparator extends Comparator<Books>{

	public double compare(Books entity1, Books entity2) {

		// creates author list for book one
		List<Authors> authorList1 = entity1.getAuthors();
		ArrayList<String> authorNames1 = new ArrayList<String>();
		int listLength1 = authorList1.toArray().length;

		//creates author list for book two
		List<Authors> authorList2 = entity2.getAuthors();
		ArrayList<String> authorNames2 = new ArrayList<String>();
		int listLength2 = authorList2.size();

		//array list to store similarities between authors of both books
		ArrayList<Double> authorSimilarities = new ArrayList<Double>();

		double similarity = 0.0;
		
		//string arrays for author name pre-processing
		String[] fullName1 = new String [2];
		String[] fullName2 = new String [2];
		
		//adding the author names into array lists with pre-processing
		for(Authors author: authorList1){
			//author name changed to lower case
			String name = author.getAuthorName().toLowerCase();
			//handling last name, first name order
			if (name.contains(",")){
				fullName1 = name.split(",");
				String fullname = fullName1[1]+" "+fullName1[0];
				authorNames1.add(fullname.trim());
			}else{
				authorNames1.add(name);
			}
		}

		for(Authors author: authorList2){
			String name = author.getAuthorName().toLowerCase();
			if (name.contains(",")){
				fullName2 = name.split(",");
				String fullname = fullName2[1]+" "+fullName2[0];
				authorNames2.add(fullname.trim());
			}else{
				authorNames2.add(name);
			}		
		}
		
		//similarity measure used
		TokenizingJaccardSimilarity jSim = new TokenizingJaccardSimilarity();
		
		//compares author lists' sizes, nested loop to compute similarity between 
		//each author in one list with each author in the other
		if(authorNames1.size() >= authorNames2.size() && authorNames2 != null && authorNames2.size() > 0 && !authorNames2.isEmpty()){
			for (int i = 0; i < authorNames2.size(); i++){
				for (int j = 0; j < authorNames1.size(); j++){
					//every computed similarity stored in array list
					authorSimilarities.add(jSim.calculate(authorNames1.get(j), authorNames2.get(i)));
				}
			}
		}
		if(authorNames2.size() >= authorNames1.size() && authorNames1 != null && authorNames1.size() > 0 && !authorNames1.isEmpty()){
			for (int i = 0; i < authorNames1.size(); i++){
				for (int j = 0; j < authorNames2.size(); j++){		
					authorSimilarities.add(jSim.calculate(authorNames2.get(j), authorNames1.get(i)));
				}
			}
		}

		//sorts array list with similarities and reverses the array list order to descending
		Collections.sort(authorSimilarities, Collections.reverseOrder());
		
		//similarity measure threshold
		double threshold = 0.5;
		
		int simCounter = 0;
		
		//compares the top K similarities against the threshold. 
		//if all similarities are above the threshold, both lists are considered a match
		//K is decided based on the size of the smaller list, or constant if both lists are the same size.
		if (listLength1 > listLength2){
			for (int i = 0; i < listLength2; i++){
				if (authorSimilarities.get(i) >= threshold)
					simCounter++;
			}
			if (simCounter == listLength2)
				similarity = 1.0;
			else
				similarity = 0.0;
		}
		else if (listLength1 <= listLength2){
			for (int i = 0; i < listLength1; i++){
				if (authorSimilarities.get(i) >= threshold)
					simCounter++;
			}
			if (simCounter == listLength1)
				similarity = 1.0;
			else
				similarity = 0.0;
		}

		return similarity;
	}
}




