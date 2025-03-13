package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Employee;

public interface IEmployeeService {

	Employee saveEmployee(Employee employee);

	List<Employee> getAllEmployees();

	Optional<Employee> getEmployeeById(long id);

	Employee updateEmployee(Employee employee, long id);

	Employee deleteEmployee(long id);

}
