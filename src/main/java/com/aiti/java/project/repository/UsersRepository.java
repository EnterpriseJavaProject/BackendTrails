package com.aiti.java.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aiti.java.project.entities.Users;

public interface UsersRepository extends JpaRepository<Users, Long> {

}
