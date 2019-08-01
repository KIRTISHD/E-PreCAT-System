package project.mainpackage.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import project.mainpackage.pojos.UserStatistics;
import project.mainpackage.repositories.UserStatisticsRepository;


@Service
@Transactional
public class UserStatisticsDaoImpl implements IUserStatisticsDao {
	
	@Autowired
	private UserStatisticsRepository utrepo;

	@Override
	public boolean addUserStatistics(UserStatistics ut) {
		UserStatistics x = utrepo.save(ut);
		if (x == null) {
			return false;
		}
		return true;
	}

	@Override
	public void deleteUserStatistics(Integer id) {
		utrepo.deleteById(id);

	}

}
