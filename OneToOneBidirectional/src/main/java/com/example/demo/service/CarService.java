package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Car;
import com.example.demo.repo.CarRepository;

@Service
public class CarService {
	
	
	@Autowired
	CarRepository repo;
	
	
	public Car saveCar(Car car) {
		return repo.save(car);
	}

}
