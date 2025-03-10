package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entity.Car;
import com.example.demo.entity.Driver;
import com.example.demo.service.CarService;
import com.example.demo.service.DriverService;

@SpringBootApplication
public class OneToOneBidirectionalApplication implements CommandLineRunner {

	
	@Autowired
	DriverService driverService;
	
	@Autowired
	CarService carService;
	
	public static void main(String[] args) {
		SpringApplication.run(OneToOneBidirectionalApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Driver d1 = new Driver();
		
		d1.setName("xyz");
		
		
		Car c1 = new Car();
	    c1.setBrand("maruti");
	    c1.setHorsepower(120);
	    
	    d1.setCar(c1);
	    c1.setDriver(d1);
	    
	    driverService.saveDriver(d1);
	    
	    System.out.println(d1.getCar().getBrand());
	    System.out.println(c1.getDriver().getName());
	}

}
