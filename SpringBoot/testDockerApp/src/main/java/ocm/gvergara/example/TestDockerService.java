package ocm.gvergara.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestDockerService {

	@RequestMapping(value="/obtenerSaludo", method = RequestMethod.GET)
	public String obtenerDatos(){
		return "holla ";
	}
	
}
