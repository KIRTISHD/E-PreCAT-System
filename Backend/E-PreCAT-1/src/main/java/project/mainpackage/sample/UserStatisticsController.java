package project.mainpackage.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import project.mainpackage.dao.IUserStatisticsDao;
import project.mainpackage.pojos.UserStatistics;

@RestController
@RequestMapping("/statistics")
@CrossOrigin(origins = "http://localhost:4200",maxAge = 4800,allowCredentials = "false",methods= {RequestMethod.GET,RequestMethod.POST})
public class UserStatisticsController {
	
	@Autowired
	private IUserStatisticsDao statdao;
	
	@RequestMapping(value="/add",method=RequestMethod.POST,produces="application/json",consumes = "application/json")
	public boolean addUserStatistics(@RequestBody UserStatistics st) {
		return statdao.addUserStatistics(st);
	}
	
	@RequestMapping(value="/delete/{id}",method=RequestMethod.GET)
	public void deleteUserStatistics(@RequestParam Integer id) {
		statdao.deleteUserStatistics(id);
	}

}
