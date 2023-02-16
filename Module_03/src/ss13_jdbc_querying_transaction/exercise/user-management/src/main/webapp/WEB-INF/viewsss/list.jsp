<%--
  Created by IntelliJ IDEA.
  User: Test
  Date: 02/15/2023
  Time: 10:00 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">
<head>
    <title>User Manager</title>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
<h1>LIST USER</h1>
<button type="submit" class="btn-outline-info m-2"><a href="view?action=create">ADD NEW USER</a></button>
<br>
<button type="submit" class="btn-outline-warning m-2"><a href="view?action=sort">SORT BY NAME</a></button>
<br>
<form action="/User">
    <input type="text" name="country" value="country">
    <button type="submit" class="btn-outline-success m-2" name="action" value="search"><a>SEARCH USER</a></button>
    <br>
</form>
<table class="table table-active">
    <tr class="table-dark">
        <td>ID</td>
        <td>Name User</td>
        <td>Email</td>
        <td>Country</td>
        <td>Edit</td>
        <td>Delete</td>
    </tr>
    <c:forEach var="user" items="${userList}">
        <tr>
            <td>${user.getId}</td>
            <td>${user.getName}</td>
            <td>${user.getEmail}</td>
            <td>${user.getCountry}</td>
            <td>
                <button><a href="/view?action=edit&id=${user.getId}">edit</a></button>
            </td>
            <td>
                <button><a href="/view?action=delete&id=${user.getId}">delete</a></button>
            </td>
        </tr>
    </c:forEach>
</table>
<a href="/view?action=select"><h3>List user</h3></a>
<!-- Optional JavaScript -->
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
        integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
        crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
        integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
        crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
        integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
        crossorigin="anonymous"></script>
</body>
</html>
