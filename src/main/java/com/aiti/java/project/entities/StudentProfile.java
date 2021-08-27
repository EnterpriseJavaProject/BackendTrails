package com.aiti.java.project.entities;

import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="students")
public class StudentProfile {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private Long users_id;
	private String student_id;
	@Column(name="full_name")
	private String fullName;
	private Date date_of_birth;
	private String contact;
	private String gender;
	private String address;
	private Long course_id;
	private String user_type;
	private Timestamp created_at;
	private Timestamp updated_at;
	
	
	

	
	/*
	 * @Id
	 * 
	 * @GeneratedValue(strategy = GenerationType.IDENTITY) private Long id;
	 * 
	 * @Column(name="student_id") private String student_id;
	 * 
	 * @Column(name="student_name") private String studentName; private String
	 * course;
	 * 
	 * @Column(name="course_level") private String course_level;
	 * 
	 * @Column(name="date_of_birth") private String date_of_birth; private String
	 * email;
	 * 
	 * @Column(name="phone") private Integer phone; private String gender; private
	 * String address;
	 * 
	 * @Column(name="course_start_date") private String course_start_date;
	 * 
	 * @Column(name="course_end_date") private String course_end_date;
	 * 
	 * @Column(name="date_of_issue") private String date_of_issue;
	 * 
	 * @Column(name="registration_date") private String reg_date;
	 * 
	 * @Column(name="update_time") private String update_time;
	 */
	
	
	public StudentProfile() {
		
	}





	public StudentProfile(Long id, Long users_id, String student_id, String fullName, Date date_of_birth,
			String contact, String gender, String address, Long course_id, String user_type, Timestamp created_at,
			Timestamp updated_at) {
		super();
		this.id = id;
		this.users_id = users_id;
		this.student_id = student_id;
		this.fullName = fullName;
		this.date_of_birth = date_of_birth;
		this.contact = contact;
		this.gender = gender;
		this.address = address;
		this.course_id = course_id;
		this.user_type = user_type;
		this.created_at = created_at;
		this.updated_at = updated_at;
	}





	public Long getId() {
		return id;
	}





	public void setId(Long id) {
		this.id = id;
	}





	public Long getUsers_id() {
		return users_id;
	}





	public void setUsers_id(Long users_id) {
		this.users_id = users_id;
	}





	public String getStudent_id() {
		return student_id;
	}





	public void setStudent_id(String student_id) {
		this.student_id = student_id;
	}





	public String getFull_name() {
		return fullName;
	}





	public void setFull_name(String fullName) {
		this.fullName = fullName;
	}





	public Date getDate_of_birth() {
		return date_of_birth;
	}





	public void setDate_of_birth(Date date_of_birth) {
		this.date_of_birth = date_of_birth;
	}





	public String getContact() {
		return contact;
	}





	public void setContact(String contact) {
		this.contact = contact;
	}





	public String getGender() {
		return gender;
	}





	public void setGender(String gender) {
		this.gender = gender;
	}





	public String getAddress() {
		return address;
	}





	public void setAddress(String address) {
		this.address = address;
	}





	public Long getCourse_id() {
		return course_id;
	}





	public void setCourse_id(Long course_id) {
		this.course_id = course_id;
	}





	public String getUser_type() {
		return user_type;
	}





	public void setUser_type(String user_type) {
		this.user_type = user_type;
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
		return "StudentProfile [id=" + id + ", users_id=" + users_id + ", student_id=" + student_id + ", full_name="
				+ fullName + ", date_of_birth=" + date_of_birth + ", contact=" + contact + ", gender=" + gender
				+ ", address=" + address + ", course_id=" + course_id + ", user_type=" + user_type + ", created_at="
				+ created_at + ", updated_at=" + updated_at + "]";
	}


	
	
	
	}
