<%--
  Created by IntelliJ IDEA.
  User: 12573
  Date: 2020/11/17
  Time: 20:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>信息展示</title>
</head>
<body>
    <table border="1px">
        <tr>
            <th>id</th>
            <th>用户名</th>
            <th>存款</th>
        </tr>
        <c:forEach var="user" items="${userList}">
            <tr>
                <td>${user.id}</td>
                <td>${user.username}</td>
                <td>${user.money}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
