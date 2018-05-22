package com.web.curd.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="student_tab")
public class Student {
	@Id
	@Column(name="STUDENT_ID")
	@GeneratedValue(generator="std_id")
	@GenericGenerator(name="std_id",strategy="increment")
	private Long studentId;
	@Column(name="FIRST_NAME")
	private String firstName;
	@Column(name="LAST_NAME")
	private String lastName;
	@Column(name="SCHOOL_NAME")
	private String schoolName;
	@Column(name="CONT_NUMBER")
	private String contNumber;
	@Column(name="ADMISSION_DATE")
	@Temporal(TemporalType.DATE)
	private Date  AdmissionDate;
	public Long getStudentId() {
		return studentId;
	}
	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public String getContNumber() {
		return contNumber;
	}
	public void setContNumber(String contNumber) {
		this.contNumber = contNumber;
	}
	public Date getAdmissionDate() {
		return AdmissionDate;
	}
	public void setAdmissionDate(Date admissionDate) {
		this.AdmissionDate = admissionDate;
	}
	public Student(Long studentId) {
		super();
		this.studentId = studentId;
	}
	public Student() {
		super();
	}
	

}

