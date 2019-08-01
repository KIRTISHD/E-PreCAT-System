package project.mainpackage.sample;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import project.mainpackage.dao.IQuestionsDao;
import project.mainpackage.pojos.Questions;

@RestController
@RequestMapping("/questions")
@CrossOrigin(maxAge = 4800,allowCredentials = "false",methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class QuestionsController {
	
	@Autowired 
	private IQuestionsDao questionsdao;
	
	@RequestMapping(value="/getQuestions",method=RequestMethod.GET,produces="application/json")
	public List<Questions> getQuestions(@RequestParam String q){
		return questionsdao.getRandomQuestions(Integer.parseInt(q));
		//return questionsdao.getRandomQuestions()
	}

	@RequestMapping(value="/delete/{id}",method=RequestMethod.GET)
	public void deleteQuestion(@RequestParam Integer id) {
		questionsdao.deleteQuestion(id);
	}

	@RequestMapping(value="/add",method=RequestMethod.POST)
	public boolean addQuestion(@RequestBody Questions q) {
		return questionsdao.addQuestion(q);
	}

}
