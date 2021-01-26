package io.github.nateacoffey.ConjugationPracticeWeb.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import io.github.nateacoffey.ConjugationPracticeWeb.Controller.Languages.JapaneseRepository;
import io.github.nateacoffey.ConjugationPracticeWeb.Model.CompareInputToAnswer;
import io.github.nateacoffey.ConjugationPracticeWeb.Model.TextOutput;
import io.github.nateacoffey.ConjugationPracticeWeb.Model.Util.LinkedListCustom;


@Controller
public class LanguageController {
	
	@Autowired
	JapaneseRepository japaneseRepository;
	
	@PostMapping("conjugator/language")
	//takes the request parameters and assigns them to html variables
	public String viewDetails(
							@RequestParam("language")String language,//assigns variable from the input variable
							@RequestParam("input")String input,//assigns variable from the input variable
							HttpServletRequest request,
							ModelMap modelMap) {
		
		modelMap.addAttribute("language", language);
		
		
		HttpSession session = request.getSession();
		
		
		
		
		CompareInputToAnswer compareInputToAnswer = new CompareInputToAnswer((Integer) session.getAttribute("incorrectGuesses"));
		
		int correct = compareInputToAnswer.compare(input, (String) session.getAttribute("correctAnswer"));
		
		TextOutput textOutput = new TextOutput((LinkedListCustom) session.getAttribute("textOutputList"), 
					(String) session.getAttribute("correctAnswer"), 
					japaneseRepository, 
					language);
		
		
		modelMap.addAttribute("textOutput", textOutput.getText(correct, input));
		
		
		session.setAttribute("incorrectGuesses", compareInputToAnswer.getIncorrectGuesses());
		session.setAttribute("textOutputList", textOutput.getList());
		session.setAttribute("correctAnswer", textOutput.getAnswer());
		session.setMaxInactiveInterval(360);
		
		//returns used jsp file
		return "language";
	}
	
	
}
