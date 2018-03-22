<%--
  Created by IntelliJ IDEA.
  User: changduo
  Date: 18-3-22
  Time: 下午9:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>所有用户</title>
</head>
<body>
<table style="border: 2px solid black">
    <%--${userList}--%>
<%=request.getSession().getAttribute("userList")%>
</table>
</body>
</html>
