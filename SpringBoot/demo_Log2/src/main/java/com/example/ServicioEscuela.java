package com.example;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.obj.Estudiante;

@RestController
public class ServicioEscuela {

	   @RequestMapping(value="/estudiante/{id}")
	   public Estudiante getStudent(@PathVariable String id){

	      String URL="http://localhost:8080/"+id;

	      RestTemplate template=new RestTemplate();

	      Estudiante student =template.getForObject(URL,Estudiante.class);

	      return student;
	   }
	
}
