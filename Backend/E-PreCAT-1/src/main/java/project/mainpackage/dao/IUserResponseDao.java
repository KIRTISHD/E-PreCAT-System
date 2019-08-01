package project.mainpackage.dao;

import project.mainpackage.pojos.UserResponse;

public interface IUserResponseDao {
	boolean addUserResponse(UserResponse ur);
	void deleteUserResponse(Integer id);

}
