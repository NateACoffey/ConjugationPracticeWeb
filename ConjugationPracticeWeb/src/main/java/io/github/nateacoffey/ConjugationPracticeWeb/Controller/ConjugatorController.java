package io.github.nateacoffey.ConjugationPracticeWeb.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ConjugatorController {
	
	@GetMapping("conjugator")
	public ModelAndView courses() {
		
		ModelAndView modelView = new ModelAndView();
		
		//set corresponding .jsp file
		modelView.setViewName("conjugator");
		
		
		return modelView;
	}
	
}
