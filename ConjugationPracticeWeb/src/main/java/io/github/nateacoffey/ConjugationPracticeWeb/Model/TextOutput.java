package io.github.nateacoffey.ConjugationPracticeWeb.Model;

import io.github.nateacoffey.ConjugationPracticeWeb.Controller.Languages.JapaneseRepository;
import io.github.nateacoffey.ConjugationPracticeWeb.Model.Util.LinkedListCustom;

public class TextOutput {
	
	private LinkedListCustom list;
	
	private JapaneseRepository repository;
	private String language;
	private String answer;
	
	public TextOutput(LinkedListCustom list, String answer, JapaneseRepository repository, String language) {
		
		if(list != null) {
			this.list = list;
		}else {
			this.list = new LinkedListCustom();
		}
		
		if(answer != null) {
			this.answer = answer;
		}else {
			this.answer = "";
		}
		
		this.repository = repository;
		this.language  = language;
	}
	
	public LinkedListCustom getList() {
		return list;
	}
	
	public String getAnswer() {
		return answer;
	}
	
	public String getText(int correct, String input) {
		
		LoadRow loadRow;
		String[] verbEndingVerbTenseCorrectConjugation;
		
		switch(correct) {
			case 0://false
				list.add(input + " is incorrect.");
				return list.toString();
			case 1://true
				list.add(input + " is correct.");
				break;
			case 2://false but out of guesses
				list.add(input + " is incorrect.");
				list.add("The correct answer is " + answer + ".");
				break;
			default://first load
				break;
		}
		
		loadRow = new LoadRow();
		
		verbEndingVerbTenseCorrectConjugation = loadRow.getRow(repository, language);
		answer = (verbEndingVerbTenseCorrectConjugation[2]);
		
		String output = "Conjugate " 
				+ verbEndingVerbTenseCorrectConjugation[0].replace("_", " ") 
				+ " into " 
				+ verbEndingVerbTenseCorrectConjugation[1].replace("_", " ");
		output += !(verbEndingVerbTenseCorrectConjugation[1].equals("te_form")) ? " tense.": ".";
		
		list.add(output);
		
		
		
		return list.toString();
	}
	
	
}
