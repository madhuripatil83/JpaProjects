package com.jpa.one2one.one2one;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jpa.one2one.one2one.entity.Address;
import com.jpa.one2one.one2one.entity.Student;
import com.jpa.one2one.one2one.repo.StudentRepo;
import com.jpa.one2one.one2one.service.AddressService;
import com.jpa.one2one.one2one.service.StudentService;

import jakarta.transaction.Transactional;

@SpringBootApplication
public class One2oneApplication implements CommandLineRunner {

	
	@Autowired
	private StudentService studService;
	
	@Autowired
	private AddressService addrService;
	
	public static void main(String[] args) {
		SpringApplication.run(One2oneApplication.class, args);
	}

	@Override
	@Transactional
	public void run(String... args) throws Exception {
		
		
		Address a1 = new Address("#311","Banglaore","karnataka");
		
	addrService.saveAddress(a1);
		
	Student s1 = new Student("Rishi",99111,a1);
		
		studService.saveStudent(s1);
		
		
		System.out.println(studService.fetchStudentRecord());
		//System.out.println(s1.getAddress().getCity());
	}

}
