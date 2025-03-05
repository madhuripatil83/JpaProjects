
package com.jpa.one2one.one2one.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpa.one2one.one2one.entity.Student;
import com.jpa.one2one.one2one.repo.StudentRepo;

import jakarta.transaction.Transactional;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepo repo;

	@Transactional
	public void saveStudent(Student s) {
		repo.save(s);
		
	}
	
	@Transactional
	public Optional<Student> fetchStudentRecord() {
		return Optional.of(repo.findById(6).get());
	}

}
