package com.aiti.java.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aiti.java.project.entities.Courses;
import com.aiti.java.project.repository.CoursesRepository;

@RestController
@RequestMapping("/courses")
public class CoursesController {
	
	@Autowired
	CoursesRepository coursesRepo;
	
	@PostMapping("/saveCourses")
	public Courses saveCourses(@RequestBody Courses courses) {
		return coursesRepo.save(courses);
	}
	
	@PutMapping("/updateCourses")
	public Courses updateCourses(@RequestBody Courses course) {
		
		return coursesRepo.save(course);
	}
	
	@GetMapping("/getAllCourses")
	public List<Courses> getAllCourses(){
		return coursesRepo.findAll();
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteCourse(@PathVariable ("id") Long id) {
		coursesRepo.deleteById(id);
	}
	
	@GetMapping("/findCourseById/{id}")
	public void findById(@PathVariable("id") Long id) {
		coursesRepo.findById(id);
	}
	

}
