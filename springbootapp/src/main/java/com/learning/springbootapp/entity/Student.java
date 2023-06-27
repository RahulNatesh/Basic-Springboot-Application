package com.learning.springbootapp.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
	private Integer id;
	private String name;
	private Integer age;
	private String course;
	private float gpa;
	
   

	public Student() {
	}

	public Student(Integer id, String name,Integer age,String course, float gpa) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.course=course;
		this.gpa=gpa;
	}

	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getage() {
		return age;
	}
	
	public void setage(Integer age) {
		this.age = age;
	}

	public String getcourse() {
		return course;
	}

	public void setcourse(String course) {
		this.course = course;
	}

	public float getgpa() {
		return gpa;
	}

	public void setgpa(float gpa) {
		this.gpa = gpa;
	}

}