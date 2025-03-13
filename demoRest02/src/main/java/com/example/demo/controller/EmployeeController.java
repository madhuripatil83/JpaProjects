package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.service.IEmployeeService;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

	@Autowired
	IEmployeeService service;

	@PostMapping
	public Employee saveEmployee(@RequestBody Employee employee) {

		return service.saveEmployee(employee);

	}

	@GetMapping
	public List<Employee> getAllEmployee(){
		return service.getAllEmployees();
	}
	
	
	@GetMapping("{id}")
    public Optional<Employee> getEmployeeById(@PathVariable("id") long employeeID){
        return service.getEmployeeById(employeeID);
    }

    @PutMapping("{id}")
    public Employee updateEmployee(@PathVariable("id") long id,
                                                   @RequestBody Employee employee){
        return service.updateEmployee(employee,id);
    }

    @DeleteMapping("{id}")
    public Employee deleteEmployee(@PathVariable("id") long id){
    	
       return  service.deleteEmployee(id);
    }
}
