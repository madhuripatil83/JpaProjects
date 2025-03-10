package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Driver;
import com.example.demo.repo.DriverRepo;

@Service
public class DriverService {
	
	@Autowired
	DriverRepo repo;
	
	
	public Driver saveDriver(Driver driver) {
		return repo.save(driver);
	}

}
