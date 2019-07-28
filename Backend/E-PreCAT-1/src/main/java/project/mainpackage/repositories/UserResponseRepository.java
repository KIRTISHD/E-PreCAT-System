package project.mainpackage.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import project.mainpackage.pojos.UserResponse;

public interface UserResponseRepository extends JpaRepository<UserResponse, Integer> {
	
	UserResponse save(UserResponse ur); 
	void deleteById(Integer id);

}
