package com.aiti.java.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aiti.java.project.entities.Courses;

public interface CoursesRepository extends JpaRepository<Courses, Long> {

}
