package com.aiti.java.project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aiti.java.project.entities.AdminProfile;

public interface AdminProfileRepos extends JpaRepository<AdminProfile, Long> {
	
	List<AdminProfile> findByFullName(String full_name);

}
