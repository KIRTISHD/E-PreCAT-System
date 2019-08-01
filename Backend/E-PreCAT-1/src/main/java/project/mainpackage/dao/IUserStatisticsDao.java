package project.mainpackage.dao;

import project.mainpackage.pojos.UserStatistics;

public interface IUserStatisticsDao {
	
	boolean addUserStatistics(UserStatistics ut);
	void deleteUserStatistics(Integer id);

}
