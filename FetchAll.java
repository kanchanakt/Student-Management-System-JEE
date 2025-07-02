package com.student.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.List;

import com.student.model.Student;
import com.studentDAOImpl.StudentDAOImpl;


@WebServlet("/FetchAll")
public class FetchAll extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		StudentDAOImpl sdaoi = new StudentDAOImpl();
		List<Student> sList = sdaoi.fetchAll();
		HttpSession session = req.getSession();
		session.setAttribute("sList", sList);
		resp.sendRedirect("display.jsp");
	}

}
