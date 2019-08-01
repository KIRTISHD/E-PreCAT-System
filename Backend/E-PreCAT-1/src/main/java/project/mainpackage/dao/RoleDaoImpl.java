package project.mainpackage.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import project.mainpackage.pojos.Role;
import project.mainpackage.repositories.RoleRepository;

@Service
@Transactional
public class RoleDaoImpl implements IRoleDao {
	
	@Autowired
	private RoleRepository rrepo;

	@Override
	public boolean addRole(Role r) {
		Role x = rrepo.save(r);
		if (x == null) {
			return false;
		}
		return true;
	}

	@Override
	public void deleteRole(Integer id) {
		rrepo.deleteById(id);

	}

}
