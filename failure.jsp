<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Submission Failed</title>
<style>
    body {
        font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
        background-color: #fcebea;
        margin: 0;
        height: 100vh;
        display: flex;
        justify-content: center;
        align-items: center;
        animation: fadeIn 0.8s ease-in-out;
    }

    @keyframes fadeIn {
        from {
            opacity: 0;
            transform: translateY(-20px);
        }
        to {
            opacity: 1;
            transform: translateY(0);
        }
    }

    .message-box {
        background-color: #fff;
        padding: 30px 40px;
        border-radius: 10px;
        box-shadow: 0 6px 16px rgba(0, 0, 0, 0.1);
        text-align: center;
        max-width: 500px;
    }

    .message-box h2 {
        color: #dc3545;
        margin-bottom: 15px;
    }

    .message-box p {
        font-size: 16px;
        color: #555;
        margin-bottom: 25px;
    }

    a {
        display: inline-block;
        text-decoration: none;
        background-color: #007bff;
        color: white;
        padding: 10px 20px;
        border-radius: 5px;
        font-weight: bold;
        transition: background-color 0.3s;
    }

    a:hover {
        background-color: #0056b3;
    }
</style>
</head>
<body>
<div class="message-box">
    <h2>Submission Failed</h2>
    <p>There was an error processing your request. Please check your input and try again.</p>
    <a href="javascript:history.back()">← Go Back</a>
</div>
</body>
</html>
