package com.example.demo.entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="Student_Table")
@Data

public class Student {
	
	   @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long studentId;

	    private String name;



	    @ManyToMany(fetch = FetchType.EAGER)
	    @JoinTable(
	            name = "student_courses",
	            joinColumns = @JoinColumn(name = "student_id", referencedColumnName = "studentId"),
	            inverseJoinColumns = @JoinColumn(name = "course_id", referencedColumnName = "courseId"))
	    private Set<Course> courses = new HashSet<>();

}
