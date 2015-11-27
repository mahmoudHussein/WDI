package de.uni_mannheim.informatik.wdi.usecase.books;

import de.uni_mannheim.informatik.wdi.identityresolution.blocking.BlockingFunction;


public class AuthorsBlockingFunction extends BlockingFunction<Books>{

	public String getBlockingKey(Books instance) {
		if(instance.getAuthors() != null){
		return instance.getAuthors().get(0).getAuthorName().subSequence(0, 2)+"";
		}
		return null;
	}
}
