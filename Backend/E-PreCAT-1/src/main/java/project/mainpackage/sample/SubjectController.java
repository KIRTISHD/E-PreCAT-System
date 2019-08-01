package project.mainpackage.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import project.mainpackage.dao.ISubjectDao;
import project.mainpackage.pojos.Subject;

@RestController
@RequestMapping("/subject")
@CrossOrigin(origins = "http://localhost:4200",maxAge = 4800,allowCredentials = "false",methods= {RequestMethod.GET,RequestMethod.POST})
public class SubjectController {

	@Autowired
	private ISubjectDao subjectdao;
	
	@RequestMapping(value="/add",method=RequestMethod.POST,produces="application/json")
	public boolean addSubject(@RequestParam Subject s) {
		return subjectdao.addSubject(s);
	}
	
	@RequestMapping(value="/delete/{id}",method=RequestMethod.GET)
	public void deleteSubject(@RequestParam Integer id) {
		subjectdao.deleteSubject(id);
	}
}
