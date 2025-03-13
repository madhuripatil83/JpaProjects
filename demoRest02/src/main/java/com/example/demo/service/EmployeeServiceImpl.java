package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repo.IEmployeeRepository;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	IEmployeeRepository repo;

	@Override
	public Employee saveEmployee(Employee employee) {
		return repo.save(employee);
	}

	@Override
	public List<Employee> getAllEmployees() {
		return repo.findAll();
	}

	@Override
	public Optional<Employee> getEmployeeById(long id) {
		Optional<Employee> employee = repo.findById(id);
		if (employee.isPresent()) {
			return Optional.of(employee.get());
		} else {
			throw new RuntimeException();
		}

	}

	@Override
	public Employee updateEmployee(Employee employee, long id) {

		Employee updatedEmp = repo.findById(id).orElseThrow(() -> new RuntimeException());

		updatedEmp.setFirstName(employee.getFirstName());
		updatedEmp.setLastName(employee.getFirstName());
		updatedEmp.setEmail(employee.getEmail());
		repo.save(updatedEmp);
		return updatedEmp;

	}

	@Override
	public Employee deleteEmployee(long id) {

		Employee deletedEmp =repo.findById(id).orElseThrow(() -> new RuntimeException());
	     repo.deleteById(id);
		return deletedEmp;

	}

}
