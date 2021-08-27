package com.aiti.java.project.controller;

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

import com.aiti.java.project.entities.AdminProfile;
import com.aiti.java.project.repository.AdminProfileRepos;

@RestController
@RequestMapping("/admin")
public class AdminProfileController {
	
	@Autowired
	AdminProfileRepos adminRepos;
	
	
	@PostMapping("/saveAdmin")
	public AdminProfile saveAdmin(@RequestBody AdminProfile admin) {
		return adminRepos.save(admin);
	}
	
	
	@PutMapping("updateAdmin")
	public AdminProfile updateAdmin(@RequestBody AdminProfile admin) {
		return adminRepos.save(admin);
	}
	
	@GetMapping("/getAllAdmin")
	public List<AdminProfile> getAllAdmin(){
		return adminRepos.findAll();
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteAdmin(@PathVariable ("id") Long id) {
		adminRepos.deleteById(id);
	}
	
	@GetMapping("/findAdminById/{id}")
	public Optional<AdminProfile> findById(@PathVariable("id") Long id) {
		return adminRepos.findById(id);
	}
	
	@GetMapping("/findByName/{name}")
	public List<AdminProfile> findByName(String name){
		
		return adminRepos.findByFullName(name);
	}

}
