package com.jpa.one2one.one2one.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpa.one2one.one2one.entity.Address;
import com.jpa.one2one.one2one.repo.AddressRepo;

import jakarta.transaction.Transactional;

@Service
public class AddressService {

	@Autowired
	private AddressRepo repo;
	
	@Transactional
	public void saveAddress(Address addr) {
		repo.save(addr);
	}
	
	
}
