package Fourwheller.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class fourwheelercontainer {
	
	@RequestMapping("/Login")
	public boolean Login(@RequestParam String username, String password)
	{
		return true;
	}

}
