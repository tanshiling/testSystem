<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: TSL
  Date: 2018/3/26
  Time: 17:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>管理员</title>
</head>
<body>
<div align="center">
    <br>
    <br>
<div style="text-align: right;width: 80%"><a href="${pageContext.request.contextPath }/host/newManager.action">添加</a></div>
<table border="1" cellpadding="0" cellspacing="0" width="80%" align="center">
    <tr align="center">
        <td>管理员ID</td>
        <td>姓名</td>
        <td>密码</td>
        <td>电话</td>
        <td>地址</td>
        <td>超管？</td>
        <td>更新</td>
        <td>删除</td>
    </tr>

    <c:forEach items="${managerList}" var="manager">
        <tr align="center">
            <td>${manager.mid}</td>
            <td>${manager.mname}</td>
            <td>${manager.mpassword}</td>
            <td>${manager.mtel}</td>
            <td>${manager.maddress}</td>
            <td>${manager.mm}</td>
            <td><a href="/host/findManagerById.action?mid=${manager.mid}">修改</a></td>
            <td><a onclick="return window.confirm('确认删除吗？')" href="/host/deleteManager.action?mid=${manager.mid}">删除</a></td>
        </tr>
    </c:forEach>

</table>
<div>
    <a href="?start=0">首  页</a> |
    <a href="?start=${page.start-page.count}">上一页</a> |
    <a href="?start=${page.start+page.count}"> 下一页</a> |
    <a href="?start=${page.last}">末  页</a>
</div>
</div>
</body>
</html>
