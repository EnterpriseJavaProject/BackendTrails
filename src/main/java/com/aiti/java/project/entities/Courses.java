package com.aiti.java.project.entities;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="courses")
public class Courses {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private Long code;
	private String course_name;
	private String course_level;
	private Long users_id;
	private Date course_start_date;
	//private Date end_date;
	private Date certificate_issuedate;
	private Timestamp created_at;
	private Timestamp updated_at;
	
	public Courses() {
		
	}

	public Courses(Long id, Long code, String course_name, String course_level, Long users_id, Date course_start_date,
			Date certificate_issuedate, Timestamp created_at, Timestamp updated_at) {
		super();
		this.id = id;
		this.code = code;
		this.course_name = course_name;
		this.course_level = course_level;
		this.users_id = users_id;
		this.course_start_date = course_start_date;
		this.certificate_issuedate = certificate_issuedate;
		this.created_at = created_at;
		this.updated_at = updated_at;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCode() {
		return code;
	}

	public void setCode(Long code) {
		this.code = code;
	}

	public String getCourse_name() {
		return course_name;
	}

	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}

	public String getCourse_level() {
		return course_level;
	}

	public void setCourse_level(String course_level) {
		this.course_level = course_level;
	}

	public Long getUsers_id() {
		return users_id;
	}

	public void setUsers_id(Long users_id) {
		this.users_id = users_id;
	}

	public Date getCourse_start_date() {
		return course_start_date;
	}

	public void setCourse_start_date(Date course_start_date) {
		this.course_start_date = course_start_date;
	}

	public Date getCertificate_issuedate() {
		return certificate_issuedate;
	}

	public void setCertificate_issuedate(Date certificate_issuedate) {
		this.certificate_issuedate = certificate_issuedate;
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
		return "Courses [id=" + id + ", code=" + code + ", course_name=" + course_name + ", course_level="
				+ course_level + ", users_id=" + users_id + ", course_start_date=" + course_start_date
				+ ", certificate_issuedate=" + certificate_issuedate + ", created_at=" + created_at + ", updated_at="
				+ updated_at + "]";
	}
		
	
	
	

}
