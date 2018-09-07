<%--
  Created by IntelliJ IDEA.
  User: TSL
  Date: 2018/3/25
  Time: 8:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>学生管理</title>
</head>
<body>
<div align="center">
    <br>
    <br>
<div style="text-align: right;width: 80%"><a href="${pageContext.request.contextPath }/student/newStudent.action">添加</a></div>
<table border="1" cellpadding="0" cellspacing="0" width="80%" align="center">
    <tr align="center">
        <td>学生ID</td>
        <td>姓名</td>
        <td>密码</td>
        <td>电话</td>
        <td>地址</td>
        <td>更新</td>
        <td>删除</td>
    </tr>

    <c:forEach items="${studentList}" var="student">
        <tr align="center">
            <td>${student.stid}</td>
            <td>${student.stname}</td>
            <td>${student.stpassword}</td>
            <td>${student.sttel}</td>
            <td>${student.staddress}</td>
            <td><a href="/student/findStudentById.action?stid=${student.stid}">修改</a></td>
            <td><a onclick="return window.confirm('确认删除吗？')" href="/student/deleteStudent.action?stid=${student.stid}">删除</a></td>
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
