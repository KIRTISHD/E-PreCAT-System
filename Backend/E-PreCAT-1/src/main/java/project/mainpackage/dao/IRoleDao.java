package project.mainpackage.dao;

import project.mainpackage.pojos.Role;

public interface IRoleDao {
	
	boolean addRole(Role r);
	void deleteRole(Integer id);

}
