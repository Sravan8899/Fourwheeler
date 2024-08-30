package Fourwheller.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import Fourwheller.Service.addvehicleservice;
import Fourwheller.entity.addvehicle;

@RestController
@CrossOrigin("*")
public class addvehiclecontroller {
	
	@Autowired
	addvehicleservice addvehicle1;
	
	@PostMapping("/add/vehicle")
	public addvehicle addvehiclemeth(@RequestBody addvehicle vehicle) {
		
		
		return addvehicle1.addvehiclemeth2(vehicle);
		
	}

}
