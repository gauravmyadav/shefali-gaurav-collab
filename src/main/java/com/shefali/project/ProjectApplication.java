package com.shefali.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjectApplication {

	public static void main(String[] args) {
		System.out.println("Hello Gaurav");
		SpringApplication.run(ProjectApplication.class, args);
		Employee e=new Employee();
		System.out.println(e.shefali());


	}

}
