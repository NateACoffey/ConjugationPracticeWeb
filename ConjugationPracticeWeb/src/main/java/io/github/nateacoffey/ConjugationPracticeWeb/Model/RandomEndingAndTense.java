package io.github.nateacoffey.ConjugationPracticeWeb.Model;

import java.util.List;


public class RandomEndingAndTense {
	
	private List<String> endings;
	private List<String> columnNames;
	
	
	public RandomEndingAndTense(List<String> endings, List<String> columnNames) {
		
		this.columnNames = columnNames;
		this.endings = endings;
		
	}
	
	
	public String[] getRandomEndingAndTense() {
		
		
		//grabs random tense from MapMaker.java array and a random verb ending
		String tense = columnNames.get((int) (Math.random() * columnNames.size()));
		String ending = endings.get((int) (Math.random() * endings.size()));
		
		
		return new String[] {ending, tense};
	}
	
	
	
}
