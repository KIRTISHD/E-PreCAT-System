package project.mainpackage.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import project.mainpackage.pojos.UserResponse;
import project.mainpackage.repositories.UserResponseRepository;


@Service
@Transactional
public class UserResponseDaoImpl implements IUserResponseDao {
	
	@Autowired
	private UserResponseRepository urrepo;

	@Override
	public boolean addUserResponse(UserResponse ur) {
		UserResponse x = urrepo.save(ur);
		if (x == null) {
			return false;
		}
		return true;
	}

	@Override
	public void deleteUserResponse(Integer id) {
		urrepo.deleteById(id);

	}

}
