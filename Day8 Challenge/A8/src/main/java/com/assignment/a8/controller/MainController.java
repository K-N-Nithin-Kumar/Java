package com.assignment.a8.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.assignment.a8.model.Question;
import com.assignment.a8.model.QuestionForm;
import com.assignment.a8.model.Result;
import com.assignment.a8.service.QuizService;

@Controller
public class MainController {
	
	@Autowired
	Result result;
	@Autowired
	QuizService qService;
	
	Boolean submitted = false;
	
	@GetMapping("/")
	public String home() {
		return "index.html";
	}

	@ModelAttribute("result")
	public Result getResult() {
		return result;
	}
	
	@PostMapping("/quiz")
	public String quiz(@RequestParam String username, Model m, RedirectAttributes ra) {
		if(username.equals("")) {
			ra.addFlashAttribute("warning", "You must enter your name");
			return "redirect:/";
		}
		
		submitted = false;
		result.setUsername(username);
		
		QuestionForm qForm = qService.getQuestions();
		m.addAttribute("qForm", qForm);
		
		return "quiz.html";
	}
	
	@PostMapping("/submit")
	public String submit(@ModelAttribute QuestionForm qForm, Model m) {
		if(!submitted) {
			result.setTotalCorrect(qService.getResult(qForm));
			qService.saveScore(result);
			submitted = true;
		}
		
		return "result.html";
	}

	@GetMapping(value = "/admin")
    public String admin(Model model){
        model.addAttribute("Question", new Question());
        return "admin";
    }

	@PostMapping(value = "/adminsubmit")
    public String submitQuestion(@ModelAttribute("Question") Question question, Model model){
        qService.addQuestion(question);
        model.addAttribute("Question", new Question());
        return "admin";
    }
	
	@GetMapping("/score")
	public String score(Model m) {
		List<Result> sList = qService.getTopScore();
		m.addAttribute("sList", sList);
		
		return "scoreboard.html";
	}

}
