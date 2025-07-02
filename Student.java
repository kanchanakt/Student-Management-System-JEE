package com.student.model;

public class Student {
	
	private int id;
	private String name;
	private String email;
	private String courses;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCourses() {
		return courses;
	}
	public void setCourses(String courses) {
		this.courses = courses;
	}
	public Student() {
		super();
	}
	public Student(String name, String email, String courses) {
		super();
		this.name = name;
		this.email = email;
		this.courses = courses;
	}
	public Student(int id, String name, String email, String courses) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.courses = courses;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", courses=" + courses + "]";
	}
	
	
}
	

