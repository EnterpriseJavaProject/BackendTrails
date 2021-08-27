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

import com.aiti.java.project.entities.AddModuleToCourse;
import com.aiti.java.project.repository.AddModuleToCourseRepository;

@RestController
@RequestMapping("/addModuleToCourse")
public class AddModuleToCourseController {
	
	@Autowired
	AddModuleToCourseRepository addModulesRepo;
	
	@PostMapping("/saveAddModuleToCourse")
	public AddModuleToCourse saveaddModule(@RequestBody AddModuleToCourse addModule) {
		return addModulesRepo.save(addModule);
	}
	
	@PutMapping("/updateAddModuleToCourse")
	public AddModuleToCourse updateaddModule(@RequestBody AddModuleToCourse addModule) {
		
		return addModulesRepo.save(addModule);
	}
	
	@GetMapping("/getAllAddModuleToCourses")
	public List<AddModuleToCourse> getAlladdModule(){
		return addModulesRepo.findAll();
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteaddModule(@PathVariable ("id") Long id) {
		addModulesRepo.deleteById(id);
	}
	
	@GetMapping("/findAddModuleToCourseById/{id}")
	public void findById(@PathVariable("id") Long id) {
		addModulesRepo.findById(id);
	}
	

}
