package com.example.demo.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "Course_Table")
@Data

public class Course {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long courseId;

	private String name;

	private String courseCode;
}
