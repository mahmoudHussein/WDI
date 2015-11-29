package de.uni_mannheim.informatik.wdi.usecase.books;

import de.uni_mannheim.informatik.wdi.identityresolution.blocking.BlockingFunction;


public class BooksBlockingFunctionAuthor extends BlockingFunction<Books>{

	public String getBlockingKey(Books instance) {
		if(instance.getBookName() != null){
		String blockingFun = instance.getBookName().subSequence(0, 2)+"";
		String blockingFun1 = instance.getAuthors().get(0).getAuthorName().subSequence(0, 2)+"";
			return blockingFun + blockingFun1;
		}
		return null;
	}
}
