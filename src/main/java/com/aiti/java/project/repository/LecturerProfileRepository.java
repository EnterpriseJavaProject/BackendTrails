package com.aiti.java.project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aiti.java.project.entities.LecturerProfile;

public interface LecturerProfileRepository extends JpaRepository<LecturerProfile, Long> {
	
	List<LecturerProfile> findByFullName(String name);

}
