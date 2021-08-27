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

import com.aiti.java.project.entities.Modules;
import com.aiti.java.project.repository.ModulesRepository;

@RestController
@RequestMapping("/modules")
public class ModulesController {
	
	@Autowired
	ModulesRepository modulesRepo;
	
	@PostMapping("/saveModules")
	public Modules saveModules(@RequestBody Modules module) {
		return modulesRepo.save(module);
	}
	
	@PutMapping("/updateModules")
	public Modules updateModules(@RequestBody Modules module) {
		
		return modulesRepo.save(module);
	}
	
	@GetMapping("/getAllModules")
	public List<Modules> getAllModules(){
		return modulesRepo.findAll();
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteModules(@PathVariable ("id") Long id) {
		modulesRepo.deleteById(id);
	}
	
	@GetMapping("/findModulesById/{id}")
	public void findById(@PathVariable("id") Long id) {
		modulesRepo.findById(id);
	}
	

}
