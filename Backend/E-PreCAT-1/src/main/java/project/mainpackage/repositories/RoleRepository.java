package project.mainpackage.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import project.mainpackage.pojos.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {
	Role save(Role r); 
	void deleteById(Integer id);

}
