package com.student.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.student.model.Student;
import com.studentDAOImpl.StudentDAOImpl;

/**
 * Servlet implementation class Delete
 */
@WebServlet("/Delete")
public class Delete extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		
		Student s = new Student();
		StudentDAOImpl sdaoi = new StudentDAOImpl();
		
		int result = sdaoi.delete(id); 

        if (result != 0) {
            resp.sendRedirect("success.jsp");
        } else {
            resp.sendRedirect("failure.jsp");
        }
	}

}
