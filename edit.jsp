<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.student.model.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Student</title>
<style>
    body {
        font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
        background-color: #f0f2f5;
        margin: 0;
        padding: 40px 0;
        display: flex;
        justify-content: center;
    }

    .container {
        background-color: #fff;
        padding: 30px;
        border-radius: 10px;
        box-shadow: 0 4px 10px rgba(0, 0, 0, 0.1);
        width: 90%;
        max-width: 500px;
    }

    form {
        display: flex;
        flex-direction: column;
    }

    label {
        font-weight: bold;
        margin-bottom: 5px;
        color: #333;
    }

    input[type="text"] {
        padding: 10px;
        margin-bottom: 20px;
        border: 1px solid #ccc;
        border-radius: 5px;
        font-size: 15px;
    }

    input[disabled] {
        background-color: #eee;
    }

    input[type="submit"] {
        background-color: #ffc107;
        color: black;
        padding: 10px;
        font-weight: bold;
        border: none;
        border-radius: 5px;
        cursor: pointer;
    }

    input[type="submit"]:hover {
        background-color: #e0a800;
    }
</style>
</head>
<body>
<div class="container">
<%
    Student s = (Student) session.getAttribute("student");
    session.setAttribute("id", s.getId());
%>
    <form action="Update">
        <label>Id:</label>
        <input type="text" name="id" disabled value="<%= s.getId() %>"><br>

        <label>Name:</label>
        <input type="text" name="name" value="<%= s.getName() %>"><br>

        <label>Email:</label>
        <input type="text" name="email" value="<%= s.getEmail() %>"><br>

        <label>Courses:</label>
        <input type="text" name="courses" value="<%= s.getCourses() %>"><br>

        <input type="submit" value="Update">
    </form>
</div>
</body>
</html>
