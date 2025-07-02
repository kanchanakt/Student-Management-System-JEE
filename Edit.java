package com.student.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.student.model.Student;
import com.studentDAOImpl.StudentDAOImpl;

@WebServlet("/Edit")
public class Edit extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		Student s = new StudentDAOImpl().fetchOne(id);
		req.getSession().setAttribute("student", s);
		resp.sendRedirect("edit.jsp");
	}
}
