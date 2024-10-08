package Fourwheller.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Fourwheller.Service.Loginservice;
import Fourwheller.entity.Loginuser;

@RestController
public class logincontroller {
	@Autowired
	Loginservice loginser;
	@GetMapping("/userdetails")
	public Boolean loginuser(@RequestBody Loginuser customer)
	{    
		
	 return loginser.loggedin1(customer);	
	}
	@GetMapping("/all")
	public List<Loginuser> getdetails()
	{
		
		return loginser.getdetailsdata();
	}
	
	
	@GetMapping("/delete")
	public String deleteuser(@RequestBody String user) {
		
		return loginser.deleteusers(user);
	}
	
	
	
	@PostMapping("/adduser")
	public Loginuser adduser(@RequestBody Loginuser details)
	{
		return loginser.adduserdetail(details);
	}

}
