<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Admission Confirmation</title>
</head>
<body>

<div class="container">
  <h2>Admission Confirmation</h2>
  <p>Thank you for submitting your admission form. Below are the details you provided:</p>

  <ul>
    <li><strong>First Name:</strong> <%= request.getSession().getAttribute("firstName") %></li>
    <li><strong>Last Name:</strong> <%= request.getSession().getAttribute("lastName") %></li>
    <li><strong>Email:</strong> <%= request.getSession().getAttribute("email") %></li>
    <li><strong>Phone:</strong> <%= request.getSession().getAttribute("phone") %></li>
    <li><strong>Date of Birth:</strong> <%= request.getSession().getAttribute("dob") %></li>
    <li><strong>Address:</strong> <%= request.getSession().getAttribute("address") %></li>
  </ul>
</div>

</body>
</html>
