package project.mainpackage.dao;

import project.mainpackage.pojos.Test;

public interface ITestDao {
	boolean addTest(Test t);
	void deleteTest(Integer id);

}
