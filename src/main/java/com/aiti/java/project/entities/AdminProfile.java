package com.aiti.java.project.entities;



import java.sql.Timestamp;

import javax.persistence.*;


@Entity
@Table(name="admin")
public class AdminProfile {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Column(name="full_name")
	private String fullName;
	private String user_type;
	private Long users_id;
	private Timestamp created_at;
	private Timestamp updated_at;
	
	/*
	 * @Id
	 * 
	 * @GeneratedValue(strategy = GenerationType.IDENTITY) private Long id; private
	 * String name; private String email; private String password;
	 */
	
	
	public AdminProfile() {
		
	}

	public AdminProfile(Long id, String fullName, String user_type, Long users_id, Timestamp created_at,
			Timestamp updated_at) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.user_type = user_type;
		this.users_id = users_id;
		this.created_at = created_at;
		this.updated_at = updated_at;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFull_name() {
		return fullName;
	}

	public void setFull_name(String fullName) {
		this.fullName = fullName;
	}

	public String getUser_type() {
		return user_type;
	}

	public void setUser_type(String user_type) {
		this.user_type = user_type;
	}

	public Long getUsers_id() {
		return users_id;
	}

	public void setUsers_id(Long users_id) {
		this.users_id = users_id;
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
		return "AdminProfile [id=" + id + ", full_name=" + fullName + ", user_type=" + user_type + ", users_id="
				+ users_id + ", created_at=" + created_at + ", updated_at=" + updated_at + "]";
	}
	
	
	
	

}
	