package de.uni_mannheim.informatik.wdi.usecase.books.comparators;

import de.uni_mannheim.informatik.wdi.identityresolution.matching.Comparator;
import de.uni_mannheim.informatik.wdi.identityresolution.similarity.string.TokenizingJaccardSimilarity;
import de.uni_mannheim.informatik.wdi.usecase.books.Books;

public class BooksPublisherJaccardComparator extends Comparator<Books>{

	TokenizingJaccardSimilarity sim = new TokenizingJaccardSimilarity();

	public double compare(Books entity1, Books entity2) {
		double similarity = 0.0;
		if ((entity1.getPublisher()!=null) || (entity2.getPublisher()!= null)){
		if(!entity1.getPublisher().equals("") ||!entity2.getPublisher().equals("") ){
		String pub1 = entity1.getPublisher().replaceAll("\\s*\\([^\\)]*\\)\\s*", " ").toLowerCase();
		String pub2 = entity2.getPublisher().replaceAll("\\s*\\([^\\)]*\\)\\s*", " ").toLowerCase();
		
		
		// calculate similarity
		similarity = sim.calculate(pub1, pub2);
		}}
		// postprocessing
		if(similarity<=0.3) {
			similarity = 0;
		}
		
		similarity *= similarity;
		
		return similarity;
	}
}
