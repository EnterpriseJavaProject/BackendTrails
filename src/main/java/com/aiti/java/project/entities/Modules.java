package com.aiti.java.project.entities;

import java.sql.Timestamp;

import javax.persistence.*;

@Entity
@Table(name="modules")
public class Modules {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String module_name;
	private String module_code;
	private Timestamp created_at;
	private Timestamp updated_at;
	
	
	
	public Modules() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Modules(Long id, String module_name, String module_code, Timestamp created_at, Timestamp updated_at) {
		super();
		this.id = id;
		this.module_name = module_name;
		this.module_code = module_code;
		this.created_at = created_at;
		this.updated_at = updated_at;
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getModule_name() {
		return module_name;
	}



	public void setModule_name(String module_name) {
		this.module_name = module_name;
	}



	public String getModule_code() {
		return module_code;
	}



	public void setModule_code(String module_code) {
		this.module_code = module_code;
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
		return "Modules [id=" + id + ", module_name=" + module_name + ", module_code=" + module_code + ", created_at="
				+ created_at + ", updated_at=" + updated_at + "]";
	}
	
	
	
	
	
	
	
	

}
