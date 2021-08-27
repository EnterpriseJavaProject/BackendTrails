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

import com.aiti.java.project.entities.Results;
import com.aiti.java.project.repository.ResultsRepository;

@RestController
@RequestMapping("/results")
public class ResultsController {
	
	@Autowired
	ResultsRepository resultsRepos;
	
	
	@PostMapping("/saveResults")
	public Results saveResults(@RequestBody Results results) {
		return resultsRepos.save(results);
	}
	
	
	@PutMapping("updateResults")
	public Results updateResults(@RequestBody Results results) {
		return resultsRepos.save(results);
	}
	
	@GetMapping("/getAllResults")
	public List<Results> getAllResults(){
		return resultsRepos.findAll();
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteResults(@PathVariable ("id") Long id) {
		resultsRepos.deleteById(id);
	}
	
	@GetMapping("/findResultsById/{id}")
	public void findById(@PathVariable("id") Long id) {
		resultsRepos.findById(id);
	}

}
