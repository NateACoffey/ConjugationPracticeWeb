package io.github.nateacoffey.ConjugationPracticeWeb.Model;


public class CompareInputToAnswer {
	
	private int incorrectGuesses;
	
	
	public CompareInputToAnswer(Integer incorrectGuesses) {
		if(incorrectGuesses != null) {
			this.incorrectGuesses = incorrectGuesses;
		} else {
			this.incorrectGuesses = 0;
		}
	}
	
	public int getIncorrectGuesses() {
		return incorrectGuesses;
	}
	
	public int compare(String input, String answer){
		
		
		if(answer != null) {
			
			//resets guesses and return 1 for true
			if(input.equals(answer)) {
				incorrectGuesses = 0;
				return 1;
				
			//if incorrect but person has guessed three times 
			}else if(!input.equals(answer) && incorrectGuesses >= 2) {
				incorrectGuesses = 0;
				return 2;
				
			//guessed incorrect
			}else {
				++incorrectGuesses;
				return 0;
				
			}
			
		}else {
			
			//should only call once per session
			return -1;
			
		}
		
		
		
		
		
	}
	
}
