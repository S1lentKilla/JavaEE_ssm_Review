<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2025/11/23
  Time: 下午7:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--也可以${pageContext.request.contextPath}/welcome--%>
<form action="welcome" method="post">
    用户信息<br>
    <input type="text" name="user" size="30"><br>
    <input type="submit" value="提交"> <input type="reset" value="重置">
</form>
</body>
</html>
