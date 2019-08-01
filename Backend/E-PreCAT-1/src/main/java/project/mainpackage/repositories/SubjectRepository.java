package project.mainpackage.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import project.mainpackage.pojos.Subject;

public interface SubjectRepository extends JpaRepository<Subject, Integer> {
	
	Subject save(Subject s); 
	void deleteById(Integer id);

}
