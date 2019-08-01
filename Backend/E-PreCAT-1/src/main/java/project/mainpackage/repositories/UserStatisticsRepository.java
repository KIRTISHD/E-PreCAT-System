package project.mainpackage.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import project.mainpackage.pojos.UserStatistics;

public interface UserStatisticsRepository extends JpaRepository<UserStatistics, Integer>{
	
	UserStatistics save(UserStatistics ut); 
	void deleteById(Integer id);

}
