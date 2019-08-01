package project.mainpackage.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import project.mainpackage.dao.IUserResponseDao;
import project.mainpackage.pojos.UserResponse;

@RestController
@RequestMapping("/response")
@CrossOrigin(origins = "http://localhost:4200",maxAge = 4800,allowCredentials = "false",methods= {RequestMethod.GET,RequestMethod.POST})
public class UserResponseController {

	@Autowired
	private IUserResponseDao responsedao;
	
	@RequestMapping(value="/add",method=RequestMethod.POST,produces="application/json")
	public boolean addResponse(@RequestParam UserResponse re) {
		return responsedao.addUserResponse(re);
	}
	
	@RequestMapping(value="/delete/{id}",method=RequestMethod.GET)
	public void deleteResponse(@RequestParam Integer id) {
		responsedao.deleteUserResponse(id);
	}
}
