<%@ page import="java.util.List" %>
<%@ page import="org.example.entities.User" %>
<%@ page import="org.example.dto.UserDto" %>
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <title>User Management System</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap/5.1.3/css/bootstrap.min.css">
</head>
<body>
<div class="container mt-5">
    <h2>User Management System</h2>

    <div class="mb-3">
        <a href="<%= request.getContextPath() %>/users/new" class="btn btn-primary">Add New User</a>
    </div>

    <table class="table table-bordered">
        <thead>
        <tr>
            <th>ID</th>
            <th>First Name</th>
            <th>Last Name</th>
            <th>ID Document</th>
            <th>Nationality</th>
            <th>Registration Date</th>
            <th>Expiration Date</th>
            <th>Actions</th>
        </tr>
        </thead>
        <tbody>
        <% List<UserDto> users = (List<UserDto>) request.getAttribute("users");
        if (users != null) { %>
        <%for (UserDto user : users) { %>
        <tr>
            <td><%= user.id() %></td>
            <td><%= user.firstName() %></td>
            <td><%= user.lastName() %></td>
            <td><%= user.identificationDocument() %></td>
            <td><%= user.nationality() %></td>
            <td><%= user.registrationDate() %></td>
            <td><%= user.expirationDate() %></td>
            <td>
                <a href="<%= request.getContextPath() %>/users/edit/<%= user.id() %>" class="btn btn-warning">Edit</a>
                <a href="<%= request.getContextPath() %>/users/delete/<%= user.id() %>" class="btn btn-danger">Delete</a>
            </td>
        </tr>
        <% } %>
        <% }else { %>
        <tr>
            <td colspan="8">No users found</td>
        </tr>
        <% } %>

        </tbody>
    </table>
</div>

<script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap/5.1.3/js/bootstrap.bundle.min.js"></script>
</body>
</html>