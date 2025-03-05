package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entity.Employee;
import com.example.demo.repo.EmployeeService;

@SpringBootApplication
public class JpaDemoApplication implements CommandLineRunner {

	@Autowired
	private EmployeeService service;

	public static void main(String[] args) {
		SpringApplication.run(JpaDemoApplication.class, args);
		// EmployeeService service=ctx.getBean(EmployeeService.class);
//		Employee emp1 = new Employee();
//		//emp1.getEmpId();
//		emp1.setEmpName("john");
//		
		// service.saveEmployee();
//		//System.out.println(emp1);

//	 Optional<Employee> e = service.getEmployeeById(2);
//		System.out.println(e);
	}

	@Override
	public void run(String... args) throws Exception {
		// service.saveEmployee();

		Optional<Employee> e = service.getEmployeeById(2);
		System.out.println(e);

		List<Employee> empList = service.getAllEmployees();

		for (Employee e1 : empList) {
			System.out.println(e1);
		}
//		
//		
    	Employee updatedEmp  = service.updateEmployee(52);
//		
//		System.out.println(updatedEmp);
//		//System.out.println(empList);

//		Employee deletedEmp = service.deleteEmployee(352);
//		System.out.println(deletedEmp);
//		
	}

}
