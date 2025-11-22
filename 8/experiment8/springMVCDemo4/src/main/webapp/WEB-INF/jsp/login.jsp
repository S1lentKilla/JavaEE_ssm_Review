<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2025/11/16
  Time: 上午12:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"%>
<html>
<head>
    <title>用户登录</title>
</head>
<body>
<form action="${pageContext.request.contextPath }/login"
      method="POST"><div>${msg}</div>
    用户名：<input type="text" name="username"/><br/>
    密&nbsp;&nbsp;码：
    <input type="password" name="password"/><br/>
    <input type="submit" value="登录"/>
</form>
</body>
</html>
