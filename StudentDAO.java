package com.studentDAO;

import java.util.List;

import com.student.model.Student;

public interface StudentDAO {
	
	int insert(Student s);
	List<Student> fetchAll();
	Student fetchOne(int id);
	int update(Student s);
	int delete(int id);
	
	
}
