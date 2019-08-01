package project.mainpackage.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import project.mainpackage.pojos.Questions;

public interface QuestionRepository extends JpaRepository<Questions, Integer>{
	
	Questions save(Questions q);
	
	@Query("SELECT t FROM Questions t WHERE t.Qid IN :ids")
    List<Questions> findByIdsIn(@Param("ids") List<Integer> ids);

	long count();
	
	void deleteById(Integer id);
}
