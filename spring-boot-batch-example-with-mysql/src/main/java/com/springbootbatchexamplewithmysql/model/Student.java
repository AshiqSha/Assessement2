package com.springbootbatchexamplewithmysql.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "student_result")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "roll_number")
	private Integer rollNumber;
	@Column(name = "name")
	private String name;
	@Column(name = "student_class")
	private String studentClass;
	@Column(name = "total_marks")
	private Integer totalMarks;
	@Column(name = "marks_obtained")
	private Integer marksObtained;
	@Column(name = "percentage")
	private Float percentage;
	@Enumerated(EnumType.STRING)
	@Column(name = "over_all_result")
	private Result overAllResult;
	@Column(name = "division")
	private String division;
	@Column(name = "date_updated")
	private Date dateUpdated;
	public Integer getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(Integer rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStudentClass() {
		return studentClass;
	}
	public void setStudentClass(String studentClass) {
		this.studentClass = studentClass;
	}
	public Integer getTotalMarks() {
		return totalMarks;
	}
	public void setTotalMarks(Integer totalMarks) {
		this.totalMarks = totalMarks;
	}
	public Integer getMarksObtained() {
		return marksObtained;
	}
	public void setMarksObtained(Integer marksObtained) {
		this.marksObtained = marksObtained;
	}
	public Float getPercentage() {
		return percentage;
	}
	public void setPercentage(Float percentage) {
		this.percentage = percentage;
	}
	public Result getOverAllResult() {
		return overAllResult;
	}
	public void setOverAllResult(Result overAllResult) {
		this.overAllResult = overAllResult;
	}
	public String getDivision() {
		return division;
	}
	public void setDivision(String division) {
		this.division = division;
	}
	public Date getDateUpdated() {
		return dateUpdated;
	}
	public void setDateUpdated(Date dateUpdated) {
		this.dateUpdated = dateUpdated;
	}

	
	
}
