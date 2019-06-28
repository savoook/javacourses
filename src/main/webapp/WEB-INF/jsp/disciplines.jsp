<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 05.06.2019
  Time: 20:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
</head>
<body>
<h2>Система управления студентами и их успеваемостью</h2>
<a href="/logout">Logout</a>
<a href="/">На главную</a>
<form action="/discipline_create" method="get">
    <input type="submit" value="Создать дисциплину...">
</form>
<input type="submit" value="Создать дисциплину">
<input type="submit" value="Модифицировать выбранную дисциплину">
<input type="submit" value="Удалить выбранную дисциплину дисциплину">
</body>
</html>
