<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2025/11/6
  Time: 18:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>商品列表</title>
</head>
<body>
<table border="1">
    <thead>
    <tr>
        <th>名称</th>
        <th>价格</th>
        <th>创建时间</th>
        <th>详情</th>
        <th>操作</th>
    </tr>
    </thead>
    <tbody>
    <c:choose>
        <c:when test="${not empty itemList}">
            <c:forEach items="${itemList}" var="item">
                <tr>
                    <td>${item.name}</td>
                    <td>${item.price}</td>
                    <td><fmt:formatDate value="${item.createtime}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
                    <td>${item.detail}</td>
                    <td><a href="${pageContext.request.contextPath}/itemList.action?id=${item.id}">查看详情</a></td>
                </tr>
            </c:forEach>
        </c:when>
        <c:otherwise>
            <tr>
                <td colspan="5" align="center">暂无商品数据</td>
            </tr>
        </c:otherwise>
    </c:choose>
    </tbody>
</table>
</body>
</html>
