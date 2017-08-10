package com.example;

import java.util.HashMap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import com.example.obj.Estudiante;


@EnableDiscoveryClient
@SpringBootApplication
@EnableAutoConfiguration
public class DemoLog2Application {

	public static HashMap<Long,Estudiante> hmStudent;

	public static void main(String[] args) {
		
		  hmStudent=new HashMap<Long,Estudiante>();

	      Estudiante one=new Estudiante();
	      one.setNombre("John");
	      one.setId("99"); 
	      
	      hmStudent.put(new Long(one.getId()),one);
	      	     
	      
	      Estudiante two=new Estudiante();
	      two.setNombre("Jane");
	      two.setId("88"); 
	      
	      hmStudent.put(new Long(two.getId()),two);
	      
		SpringApplication.run(DemoLog2Application.class, args);
	}
}
