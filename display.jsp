<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List, com.student.model.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Dashboard</title>
<style>
    body {
        font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
        background-color: #eaf0f6;
        margin: 0;
        padding: 40px 0;
        display: flex;
        justify-content: center;
    }
    .container {
        width: 90%;
        max-width: 900px;
        background-color: #fff;
        padding: 20px 30px;
        box-shadow: 0 4px 12px rgba(0,0,0,0.1);
        border-radius: 10px;
    }
    a.button {
        text-decoration: none;
        padding: 6px 12px;
        border-radius: 4px;
        font-weight: bold;
        transition: background-color 0.3s;
    }
    .add-btn {
        background-color: #28a745;
        color: white;
        margin-bottom: 15px;
        display: inline-block;
    }
    .add-btn:hover {
        background-color: #218838;
    }
    .edit-btn {
        background-color: #17a2b8;
        color: white;
    }
    .edit-btn:hover {
        background-color: #138496;
    }
    .delete-btn {
        background-color: #dc3545;
        color: white;
    }
    .delete-btn:hover {
        background-color: #c82333;
    }
    h2 {
        color: #333;
        margin-bottom: 10px;
        text-align: center;
    }
    table {
        width: 100%;
        border-collapse: collapse;
        margin-top: 20px;
        background-color: white;
        box-shadow: 0 2px 8px rgba(0,0,0,0.1);
    }
    table td, table th {
        padding: 12px 15px;
        border: 1px solid #ddd;
        text-align: left;
    }
    table th {
        background-color: #007bff;
        color: white;
    }
    table tr:nth-child(even) {
        background-color: #f9f9f9;
    }
    .no-data {
        color: #888;
        font-size: 16px;
        margin-top: 20px;
        text-align: center;
    }
    .action-links {
        display: flex;
        gap: 10px;
    }
</style>
</head>
<body>
<div class="container">
    <a href="index.jsp" class="button add-btn">+ Add Student</a>
    <%
    List<Student> sList = (List<Student>) session.getAttribute("sList");
    if(sList == null || sList.isEmpty()) {
    %>
        <p class="no-data">No data found</p>
    <% } else { %>
        <h2>Student Dashboard</h2>
        <table>
            <tr>
                <th>Id</th>
                <th>Name</th>
                <th>Email</th>
                <th>Courses</th>
                <th colspan="2">Actions</th>
            </tr>
            <%
            for(Student s : sList) {
            %>	
                <tr>
                    <td><%=s.getId() %></td>
                    <td><%=s.getName() %></td>
                    <td><%=s.getEmail() %></td>
                    <td><%=s.getCourses() %></td>
                    <td><a href="Edit?id=<%=s.getId() %>" class="button edit-btn">Edit</a></td>
                    <td><a href="Delete?id=<%=s.getId() %>" class="button delete-btn" onclick="return confirm('Are you sure you want to delete this student?')">Delete</a></td>
                </tr>
            <%
            }	
            %>
        </table>
    <% } %>
</div>
</body>
</html>
