package com.aiti.java.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aiti.java.project.entities.Results;

public interface ResultsRepository extends JpaRepository<Results, Long> {
	

}
