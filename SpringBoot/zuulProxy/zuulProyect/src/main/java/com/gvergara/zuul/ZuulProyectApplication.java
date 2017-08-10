package com.gvergara.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;


@EnableZuulProxy
@SpringBootApplication
public class ZuulProyectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulProyectApplication.class, args);
	}
}
