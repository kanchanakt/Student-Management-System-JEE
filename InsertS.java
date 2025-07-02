package com.student.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.student.model.Student;
import com.studentDAOImpl.StudentDAOImpl;


@WebServlet("/InsertS")
public class InsertS extends HttpServlet {
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String courses = req.getParameter("courses");
		
		Student s = new Student(name, email, courses);
		StudentDAOImpl sdaoi = new StudentDAOImpl();
		
		if(sdaoi.insert(s)!=0) {
			resp.sendRedirect("success.jsp");
		}else {
			resp.sendRedirect("failure.jsp");
		}
		
	}

}
