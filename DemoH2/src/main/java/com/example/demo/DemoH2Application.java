package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.transaction.Transactional;

@SpringBootApplication

public class DemoH2Application implements CommandLineRunner {

	
	@Autowired
	private StudentRepo repo;
	
	public static void main(String[] args) {
		SpringApplication.run(DemoH2Application.class, args);
	}

	@Override
	@Transactional
	public void run(String... args) throws Exception {
		
		Student s = new Student();
		s.setName("john");
		
		repo.save(s);
		System.out.println(s);
	}

}
