package com.studentDAOImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.student.model.Student;
import com.studentDAO.StudentDAO;

public class StudentDAOImpl implements StudentDAO {
	
	List<Student> sList = new ArrayList<Student>();
	private Connection con;
	private PreparedStatement pstmt;
	private ResultSet res;
	private Statement stmt;
	
	public StudentDAOImpl() {
		String url = "jdbc:mysql://localhost:3306/kanch";
		String username = "root";
		String password = ""; //enter your password here
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url, username, password);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public int insert(Student s) {
		try {
			String query = "insert into student1 (name, email, courses) values(?,?,? )";
			pstmt = con.prepareStatement(query);
			
			pstmt.setString(1, s.getName());
			pstmt.setString(2, s.getEmail());
			pstmt.setString(3, s.getCourses());
			
			return pstmt.executeUpdate();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return 0;
		
	}
	public List<Student> fetchAll(){
		try {
			String query2 = "select *from student1";
			stmt = con.createStatement();
			res = stmt.executeQuery(query2);
			sList = extractStudentFromResulset(res);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return sList;
		
	}
	public Student fetchOne(int id) {
		try {
			String sql = "select *from student1 where id=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, id);
			res = pstmt.executeQuery();
			sList = extractStudentFromResulset(res);
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		return sList.getFirst();
	}
	List <Student> extractStudentFromResulset(ResultSet res){
		try {
			while(res.next()) {
				sList.add(new Student(
				res.getInt(1),
				res.getString(2),
				res.getString(3),
				res.getString(4)));
				
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return sList;
	}
	@Override
	public int update(Student s) {
		// TODO Auto-generated method stub
		try {
			String sql="update student1 set name=?, email=?, courses=? where id =?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, s.getName());
			pstmt.setString(2, s.getEmail());
			pstmt.setString(3, s.getCourses());
			pstmt.setInt(4, s.getId());
			return  pstmt.executeUpdate();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return 0;
		
		
	}
	@Override
	public int delete(int id) {
		try {
			String query="delete from student1 where id = ?";
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, id);
			return pstmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
	
}
