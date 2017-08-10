package com.example;

import java.util.Date;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.obj.Estudiante;

@RestController
public class ServicioEstudiante {

	  @Value("${message}")
	  private String message;
	  
		
	@RequestMapping(value="/rest/estudiante/v1/message", method = RequestMethod.GET)
	public String getmessage(){
	    	return message;
	}  
	  
	
    @RequestMapping(value="/rest/estudiante/v1/get", method = RequestMethod.GET)
	public HashMap<Long,Estudiante> getAllStudents(){
    	return DemoLog2Application.hmStudent;
    }

    @RequestMapping(value="/rest/estudiante/v1/add",method = RequestMethod.POST)
    public Estudiante addStudent(@RequestParam(value="name") String name ,@RequestParam(value="subject",defaultValue = "unknown") String id){
     
       Estudiante student=new Estudiante();
       student.setId(id);
       student.setNombre(name);
       DemoLog2Application.hmStudent.put(Long.valueOf(id),student);
       return student;
    }

    @RequestMapping(value="/rest/estudiante/v1/update",method = RequestMethod.PUT)
    public Estudiante updateStudent(@RequestBody Estudiante student)throws Exception  {

       if(DemoLog2Application.hmStudent.containsKey(new Long(student.getId()))){
    	   DemoLog2Application.hmStudent.put(new Long(student.getId()),student);
       }else{
          throw new Exception("Student "+student.getId()+" does not exists");
       }

       return student;
    }
    
    @RequestMapping(value="/rest/estudiante/v1/delete/{id}",method = RequestMethod.DELETE)
    public Estudiante deleteStudent(@PathVariable long id) throws Exception {
     
       Estudiante student;
       if(DemoLog2Application.hmStudent.containsKey(new Long(id))){
          student=DemoLog2Application.hmStudent.get(new Long(id));
          DemoLog2Application.hmStudent.remove(new Long(id));
       }else{
          throw new Exception("Student "+id+" does not exists");
       }
       return student;
    }
    
    @RequestMapping(value="/rest/estudiante/v1/get/{id}",method = RequestMethod.GET)
    public Estudiante getStudent(@PathVariable long id){
       return DemoLog2Application.hmStudent.get(new Long(id));
    }
}

