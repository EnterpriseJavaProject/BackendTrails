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

import com.aiti.java.project.entities.StudentProfile;
import com.aiti.java.project.repository.StudentProfileRepository;

@RestController
@RequestMapping("/student")
public class StudentProfileController {
	
	@Autowired
	StudentProfileRepository studentRepos;
	
	
	@PostMapping("/saveStudent")
	public StudentProfile saveStudent(@RequestBody StudentProfile student) {
		return studentRepos.save(student);
	}
	
	
	@PutMapping("updateStudent")
	public StudentProfile updateStudent(@RequestBody StudentProfile student) {
		return studentRepos.save(student);
	}
	
	@GetMapping("/getAllStudent")
	public List<StudentProfile> getAllStudent(){
		return studentRepos.findAll();
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteStudent(@PathVariable ("id") Long id) {
		studentRepos.deleteById(id);
	}
	
	@GetMapping("/findStudentById/{id}")
	public void findById(@PathVariable ("id") Long id) {
		 studentRepos.findById(id);
	}
	
	
	  @GetMapping("/findByName/{studentName}") 
	  public List<StudentProfile> findByName(String studentName){ 
		  return studentRepos.findByFullName(studentName); 
		  
	  }
	  
	  @GetMapping("/module/{module}")
	  public List<StudentProfile> getModule(String module){
		  
		  return studentRepos.getModule(module);
	  }
	  
	  @GetMapping("/countStudent")
	  public String countStudent() {
		  return studentRepos.countStudent();
	  }
	 

}
