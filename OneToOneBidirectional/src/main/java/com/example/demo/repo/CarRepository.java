package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Car;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {

}
