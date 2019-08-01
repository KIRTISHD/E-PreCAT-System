package project.mainpackage.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import project.mainpackage.pojos.Test;
import project.mainpackage.repositories.TestRepository;


@Service
@Transactional
public class TestDaoImpl implements ITestDao {
	
	@Autowired
	private TestRepository trepo;

	@Override
	public boolean addTest(Test t) {
		Test x = trepo.save(t);
		if (x == null) {
			return false;
		}
		return true;
	}

	@Override
	public void deleteTest(Integer id) {
		trepo.deleteById(id); 

	}

}
