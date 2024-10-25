<%@ page import="java.util.List" %>
<%@ page import="org.example.entities.User" %>
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
        <a href="/users/new" class="btn btn-primary">Add New User</a>
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
        <% List<User> users = (List<User>) request.getAttribute("users");
        if (users != null) { %>
        <%for (User user : users) { %>
        <tr>
            <td><%= user.getId() %></td>
            <td><%= user.getFirstName() %></td>
            <td><%= user.getLastName() %></td>
            <td><%= user.getIdentificationDocument() %></td>
            <td><%= user.getNationality() %></td>
            <td><%= user.getRegistrationDate() %></td>
            <td><%= user.getExpirationDate() %></td>
            <td>
                <a href="/users/edit?id=<%= user.getId() %>" class="btn btn-warning">Edit</a>
                <a href="/users/delete?id=<%= user.getId() %>" class="btn btn-danger">Delete</a>
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