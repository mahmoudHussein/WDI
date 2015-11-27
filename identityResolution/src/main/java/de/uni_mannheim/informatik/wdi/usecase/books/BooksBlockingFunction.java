package de.uni_mannheim.informatik.wdi.usecase.books;

import de.uni_mannheim.informatik.wdi.identityresolution.blocking.BlockingFunction;


public class BooksBlockingFunction extends BlockingFunction<Books>{

	public String getBlockingKey(Books instance) {
		if(instance.getBookName() != null){
		return instance.getBookName().subSequence(0, 2)+"";
		}
		return null;
	}
}
