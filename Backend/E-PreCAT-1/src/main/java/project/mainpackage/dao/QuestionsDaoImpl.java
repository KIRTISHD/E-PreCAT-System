package project.mainpackage.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import project.mainpackage.pojos.Questions;
import project.mainpackage.repositories.QuestionRepository;

@Service
@Transactional
public class QuestionsDaoImpl implements IQuestionsDao {

	@Autowired
	private QuestionRepository qrepo;
	
	@Override
	public boolean addQuestion(Questions q) {
		Questions x = qrepo.save(q);
		if (x == null) {
			return false;
		}
		return true;
	}

	@Override
	public List<Questions> getRandomQuestions(Integer randomNumber) {
		
		int totalRows = Long.valueOf(qrepo.count()).intValue();
		Random rand = new Random();
		List<Integer> randomNumbers = new ArrayList<Integer>();
		for (int i = 0; i < randomNumber; i++) {
			randomNumbers.add(rand.nextInt(totalRows));
		}
		qrepo.findAllById(randomNumbers);
		return null;
	}

	@Override
	public void deleteQuestion(Integer id) {
		
		qrepo.deleteById(id);
	}
	
	

}
