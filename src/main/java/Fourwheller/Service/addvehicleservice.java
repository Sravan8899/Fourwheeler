package Fourwheller.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Fourwheller.Repo.addvehiclerepo;
import Fourwheller.entity.addvehicle;
@Service
public class addvehicleservice {
	@Autowired
	addvehiclerepo repo;

	public addvehicle addvehiclemeth2(addvehicle vehicle) {
		
		return repo.save(vehicle);
	}

}
