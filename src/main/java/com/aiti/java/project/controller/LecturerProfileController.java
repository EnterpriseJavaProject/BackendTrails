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

import com.aiti.java.project.entities.LecturerProfile;
import com.aiti.java.project.repository.LecturerProfileRepository;

@RestController
@RequestMapping("/lecturer")
public class LecturerProfileController {
	
	@Autowired
	LecturerProfileRepository lecturerRepos;
	
	
	@PostMapping("/saveLecturer")
	public LecturerProfile saveLecturer(@RequestBody LecturerProfile lecturer) {
		return lecturerRepos.save(lecturer);
	}
	
	
	@PutMapping("/updateLecturer")
	public LecturerProfile updateLecturer(@RequestBody LecturerProfile lecturer) {
		return lecturerRepos.save(lecturer);
	}
	
	@GetMapping("/getAllLecturer")
	public List<LecturerProfile> getAllLecturer(){
		return lecturerRepos.findAll();
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteLecturer(@PathVariable ("id") Long id) {
		lecturerRepos.deleteById(id);
	}
	
	@GetMapping("/findLecturerById/{id}")
	public void findById(@PathVariable("id") Long id) {
		lecturerRepos.findById(id);
	}

}
