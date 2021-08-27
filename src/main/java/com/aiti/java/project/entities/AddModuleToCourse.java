package com.aiti.java.project.entities;

import java.sql.Timestamp;

import javax.persistence.*;

@Entity
@Table(name="add_module_to_course")
public class AddModuleToCourse {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Long course_id;
	private Long module_id;
	private Timestamp created_at;
	private Timestamp updated_at;
	
	
	public AddModuleToCourse() {
		super();
		// TODO Auto-generated constructor stub
	}


	public AddModuleToCourse(Long id, Long course_id, Long module_id, Timestamp created_at, Timestamp updated_at) {
		super();
		this.id = id;
		this.course_id = course_id;
		this.module_id = module_id;
		this.created_at = created_at;
		this.updated_at = updated_at;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Long getCourse_id() {
		return course_id;
	}


	public void setCourse_id(Long course_id) {
		this.course_id = course_id;
	}


	public Long getModule_id() {
		return module_id;
	}


	public void setModule_id(Long module_id) {
		this.module_id = module_id;
	}


	public Timestamp getCreated_at() {
		return created_at;
	}


	public void setCreated_at(Timestamp created_at) {
		this.created_at = created_at;
	}


	public Timestamp getUpdated_at() {
		return updated_at;
	}


	public void setUpdated_at(Timestamp updated_at) {
		this.updated_at = updated_at;
	}


	@Override
	public String toString() {
		return "AddModuleToCourse [id=" + id + ", course_id=" + course_id + ", module_id=" + module_id + ", created_at="
				+ created_at + ", updated_at=" + updated_at + "]";
	}
	
	
	

}
