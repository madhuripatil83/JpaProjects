package com.jpa.one2one.one2one.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jpa.one2one.one2one.entity.Address;

@Repository
public interface AddressRepo extends JpaRepository<Address, Integer>{

}
