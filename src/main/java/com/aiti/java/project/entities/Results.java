package com.aiti.java.project.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="results")
public class Results {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private Long course_id;
	private Long module_id;
	private String student_id;
	private Long marks;
	private String grade;
	
	
	public Results() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Results(Long id, Long course_id, Long module_id, String student_id, Long marks, String grade) {
		super();
		this.id = id;
		this.course_id = course_id;
		this.module_id = module_id;
		this.student_id = student_id;
		this.marks = marks;
		this.grade = grade;
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


	public String getStudent_id() {
		return student_id;
	}


	public void setStudent_id(String student_id) {
		this.student_id = student_id;
	}


	public Long getMarks() {
		return marks;
	}


	public void setMarks(Long marks) {
		this.marks = marks;
	}


	public String getGrade() {
		return grade;
	}


	public void setGrade(String grade) {
		this.grade = grade;
	}


	@Override
	public String toString() {
		return "Results [id=" + id + ", course_id=" + course_id + ", module_id=" + module_id + ", student_id="
				+ student_id + ", marks=" + marks + ", grade=" + grade + "]";
	}
	
	
	
	
	
	
}
