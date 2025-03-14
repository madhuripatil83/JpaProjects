package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.entity.Course;
import com.example.demo.entity.Student;
import com.example.demo.service.CourseService;
import com.example.demo.service.StudentService;

@SpringBootApplication
public class ManyToManyApplication {

	public static void main(String[] args) {
		 ApplicationContext context = SpringApplication.run(ManyToManyApplication.class, args);

		  StudentService studentService = context.getBean(StudentService.class);

		  CourseService courseService= context.getBean(CourseService.class);
		  
		  Course course1 = new Course();
		  course1.setName("Course 101");
		  course1.setCourseCode("Python");

		  courseService.insertCourse(course1);


		  Course course2 = new Course();
		  course2.setName("Course 102");
		  course2.setCourseCode("Javascript");

		  courseService.insertCourse(course2);




		  // Create and save sample students
		  Student student1 = new Student();
		  student1.setName("Ravi");
		  student1.getCourses().add(course1);

		  studentService.insertStudent(student1);




		  Student student2 = new Student();
		  student2.setName("Deepak");
		  student2.getCourses().add(course1);
		  student2.getCourses().add(course2);

		  studentService.insertStudent(student2);



	
	}

}
