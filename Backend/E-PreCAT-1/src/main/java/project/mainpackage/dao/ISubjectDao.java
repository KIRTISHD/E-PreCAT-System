package project.mainpackage.dao;

import project.mainpackage.pojos.Subject;

public interface ISubjectDao {
	boolean addSubject(Subject s);
	void deleteSubject(Integer id);
}
