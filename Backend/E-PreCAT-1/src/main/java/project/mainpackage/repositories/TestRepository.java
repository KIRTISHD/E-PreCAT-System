package project.mainpackage.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import project.mainpackage.pojos.Test;

public interface TestRepository extends JpaRepository<Test, Integer>{

	Test save(Test t); 
	void deleteById(Integer id);
}
