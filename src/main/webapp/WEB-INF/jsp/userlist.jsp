<%--
  Created by IntelliJ IDEA.
  User: zhanghong
  Date: 2019-02-22
  Time: 17:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>用户列表</title>
</head>
<body>
    <table>
        <tr>
            <td>ID</td>
            <td>用户名</td>
            <td>年龄</td>
        </tr>
       <c:forEach items="${list}" var="user" >
           <tr>
               <td>${user.id}</td>
               <td>${user.name}</td>
               <td>${user.age}</td>
           </tr>
       </c:forEach>

    </table>
</body>
</html>
