<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2025/11/16
  Time: 上午12:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"%>
<html>
<head>
    <title>后台系统</title>
</head>
<body>
<li>您好:${ USER_SESSION.username }</li>
<li><a href=logout>退出</a></li>
<li><a href=orderinfo>订单信息</a></li>
</body>
</html>
