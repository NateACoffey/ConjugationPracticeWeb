package io.github.nateacoffey.ConjugationPracticeWeb.Model;

import java.util.List;

import io.github.nateacoffey.ConjugationPracticeWeb.Controller.Languages.Japanese;
import io.github.nateacoffey.ConjugationPracticeWeb.Controller.Languages.JapaneseRepository;

public class LoadRow {
	
	
	
	public String[] getRow(JapaneseRepository repository, String language) {
		
		
		
		List<String> endings = repository.getAllEndings();
		List<String> columnNames;
		
		//send fields from entity class and get the column names
		if(language.equalsIgnoreCase("japanese")) {
			columnNames = repository.getAllColumns();
			columnNames.remove("ending");
		}else {
			columnNames = null;
		}
		
		RandomEndingAndTense randomEndingAndTense = new RandomEndingAndTense(endings, columnNames);
		
		
		String[] endingAndTense = randomEndingAndTense.getRandomEndingAndTense();
		
		Japanese endingConjugations = repository.findById(endingAndTense[0]).get();
		
		
		String correctEnding = "";
		
		switch(endingAndTense[1]) {
			case "present_polite":
				correctEnding = endingConjugations.getPresentPolite();
				break;
			case "present_negative_plain":
				correctEnding = endingConjugations.getPresentNegativePlain();
				break;
			case "present_negative_polite":
				correctEnding = endingConjugations.getPresentNegativePolite();
				break;
			case "past_polite":
				correctEnding = endingConjugations.getPastPolite();
				break;
			case "past_plain":
				correctEnding = endingConjugations.getPastPlain();
				break;
			case "past_negative_plain":
				correctEnding = endingConjugations.getPastNegativePlain();
				break;
			case "past_negative_polite":
				correctEnding = endingConjugations.getPastNegativePolite();
				break;
			case "conditional":
				correctEnding = endingConjugations.getConditional();
				break;
			case "conditional_negative":
				correctEnding = endingConjugations.getConditionalNegative();
				break;
			case "te_form":
				correctEnding = endingConjugations.getTeForm();
				break;
			case "volitional_plain":
				correctEnding = endingConjugations.getVolitionalPlain();
				break;
			case "volitional_polite":
				correctEnding = endingConjugations.getVolitionalPolite();
				break;
			case "potential_plain":
				correctEnding = endingConjugations.getPotentialPlain();
				break;
			case "potential_polite":
				correctEnding = endingConjugations.getPotentialPolite();
				break;
			case "potential_negative_plain":
				correctEnding = endingConjugations.getPotentialNegativePlain();
				break;
			case "potential_negative_polite":
				correctEnding = endingConjugations.getPotentialNegativePolite();
				break;
			case "causative_plain":
				correctEnding = endingConjugations.getCausativePlain();
				break;
			case "causative_polite":
				correctEnding = endingConjugations.getCausativePolite();
				break;
			case "causative_negative_plain":
				correctEnding = endingConjugations.getCausativeNegativePlain();
				break;
			case "causative_negative_polite":
				correctEnding = endingConjugations.getCausativeNegativePolite();
				break;
			default:
				correctEnding = "Error getting ending.\nTense: " + endingAndTense[1];
		}
		
		
		return new String[] {endingAndTense[0], endingAndTense[1], correctEnding};
		
	}
	
	
}
