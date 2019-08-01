package project.mainpackage.dao;

import java.util.List;

import project.mainpackage.pojos.Questions;

public interface IQuestionsDao {
	
	boolean addQuestion(Questions q);
	List<Questions> getRandomQuestions(Integer randomNumber);
	void deleteQuestion(Integer id);

}
