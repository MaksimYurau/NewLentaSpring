<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 07.10.2020
  Time: 21:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Posts</title>
</head>
<body>
<a href="/post">
    create post
</a>

    <c:forEach items="${post}" var="item">
        ${item.title}

    </c:forEach>
</body>
</html>
