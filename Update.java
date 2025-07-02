package com.student.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import com.student.model.Student;
import com.studentDAOImpl.StudentDAOImpl;

@WebServlet("/Update")
public class Update extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		int id = Integer.parseInt(req.getParameter("id")) ;
//		String name = req.getParameter("name");
//		String email = req.getParameter("email");
//		String courses = req.getParameter("courses");
//		
//		Student s = new Student(id, name, email, courses);
//		StudentDAOImpl sdaoi = new StudentDAOImpl();
//		sdaoi.update(s);
		
		
	HttpSession session = req.getSession();
	int x =	new StudentDAOImpl().update(new Student((int) session.getAttribute("id"),
			(String)req.getParameter("name"),
			(String)req.getParameter("email"),
			(String)req.getParameter("courses")));
		
		if(x==0) {
			resp.sendRedirect("failure.jsp");
		}else {
			resp.sendRedirect("FetchAll");
		}
		
	}

}
