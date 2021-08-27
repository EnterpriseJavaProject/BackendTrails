package com.aiti.java.project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.aiti.java.project.entities.StudentProfile;

public interface StudentProfileRepository extends JpaRepository<StudentProfile, Long> {
	
	List<StudentProfile> findByFullName(String name);
	
	@Query(value="select * from admission_table where course_level like '%1.1%' ", nativeQuery = true)
	public List<StudentProfile> getModule(String module);

	@Query(value="select count(*) from admission_table", nativeQuery=true)
	public String countStudent();
}
