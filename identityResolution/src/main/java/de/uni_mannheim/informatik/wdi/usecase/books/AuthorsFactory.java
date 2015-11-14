package de.uni_mannheim.informatik.wdi.usecase.books;

import org.joda.time.DateTime;
import org.w3c.dom.Node;

import de.uni_mannheim.informatik.wdi.MatchableFactory;


public class AuthorsFactory  extends MatchableFactory<Authors>{

	@Override
	public Authors createModelFromElement(Node node, String provenanceInfo) {
		String id = getValueFromChildElement(node, "Id");
		
		// create the object with id and provenance information
		Authors author = new Authors(id, provenanceInfo);
		
		// fill the attributes
		author.setAuthorName(getValueFromChildElement(node, "Name"));
		author.setBirthPlace(getValueFromChildElement(node, "Birth_Place"));
		author.setOccupation(getValueFromChildElement(node, "Occupation"));
		author.setwritingGenre(getValueFromChildElement(node, "Writing_Genre"));
		// convert the date string into a DateTime object
		try {
			String date = getValueFromChildElement(node, "Birth_Date");
			if(date!=null) {
				DateTime dt = DateTime.parse(date);
				author.setBirthDate(dt);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		return author;
	}

}
