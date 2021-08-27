package com.aiti.java.project.entities;



import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="lecturers")
public class LecturerProfile {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String staff_id;
	private Long users_id;
	@Column(name="full_name")
	private String fullName;
	private String contact;
	private String user_type;
	private Long course_id;
	private Timestamp created_at;
	private Timestamp updated_at;
	
	/*
	 * @Id
	 * 
	 * @GeneratedValue(strategy = GenerationType.AUTO) private Long id; private
	 * String name;
	 * 
	 * @Column(name="phone") private Integer phoneNumber; private String email;
	 * private String password;
	 * 
	 * @Column(name="course_handle") private String courseHandle;
	 */
	
	
	public LecturerProfile() {
		
	}

	public LecturerProfile(Long id, String staff_id, Long users_id, String fullName, String contact, String user_type,
			Long course_id, Timestamp created_at, Timestamp updated_at) {
		super();
		this.id = id;
		this.staff_id = staff_id;
		this.users_id = users_id;
		this.fullName = fullName;
		this.contact = contact;
		this.user_type = user_type;
		this.course_id = course_id;
		this.created_at = created_at;
		this.updated_at = updated_at;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStaff_id() {
		return staff_id;
	}

	public void setStaff_id(String staff_id) {
		this.staff_id = staff_id;
	}

	public Long getUsers_id() {
		return users_id;
	}

	public void setUsers_id(Long users_id) {
		this.users_id = users_id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFull_name(String fullName) {
		this.fullName = fullName;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getUser_type() {
		return user_type;
	}

	public void setUser_type(String user_type) {
		this.user_type = user_type;
	}

	public Long getCourse_id() {
		return course_id;
	}

	public void setCourse_id(Long course_id) {
		this.course_id = course_id;
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
		return "LecturerProfile [id=" + id + ", staff_id=" + staff_id + ", users_id=" + users_id + ", full_name="
				+ fullName + ", contact=" + contact + ", user_type=" + user_type + ", course_id=" + course_id
				+ ", created_at=" + created_at + ", updated_at=" + updated_at + "]";
	}


	
	

}
	