package project.mainpackage.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import project.mainpackage.dao.ITestDao;
import project.mainpackage.pojos.Test;

@RestController
@RequestMapping("/test")
@CrossOrigin(origins = "http://localhost:4200",maxAge = 4800,allowCredentials = "false",methods= {RequestMethod.GET,RequestMethod.POST})
public class TestController {

	@Autowired
	private ITestDao testdao;
	
	@RequestMapping(value="/add",method=RequestMethod.POST,produces="application/json")
	public boolean addTest(@RequestParam Test s) {
		return testdao.addTest(s);
	}
	
	@RequestMapping(value="/delete/{id}",method=RequestMethod.GET)
	public void deleteSubject(@RequestParam Integer id) {
		testdao.deleteTest(id);
	}
}
