package com.example.demo.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Address;

@Service
public class AddressService {
	
	@Autowired
	AddressRepository repo;
	
	//insert
	public Address saveAddress() {
		
		Address addr = new Address();
		addr.setCity("bangalore");
		addr.setState("Karnataka");
		
		return repo.save(addr);
	}
	
	

}
