<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 07.10.2020
  Time: 21:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>CreatePost</title>
</head>
<body>
    <form action="/post" method="post">
        <input type="text" name="title">
        <br>
        <input type="text" name="description">
        <br>
        <button type="submit">
            save
        </button>
    </form>
</body>
</html>
