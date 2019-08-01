package project.mainpackage.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import project.mainpackage.pojos.Subject;
import project.mainpackage.repositories.SubjectRepository;


@Service
@Transactional
public class SubjectDaoImpl implements ISubjectDao {
	
	@Autowired
	private SubjectRepository srepo;

	@Override
	public boolean addSubject(Subject s) {
		Subject x = srepo.save(s);
		if (x == null) {
			return false;
		}
		return true;
	}

	@Override
	public void deleteSubject(Integer id) {
		srepo.deleteById(id);

	}

}
