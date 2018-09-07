<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: TSL
  Date: 2018/3/29
  Time: 11:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div align="center">
    <br>
    <br>
    <div style="text-align: right;width: 80%"><a href="${pageContext.request.contextPath }/application/newApplication.action">添加</a></div>
    <table border="1" cellpadding="0" cellspacing="0" width="80%" align="center">
        <tr align="center">
            <td>综合应用题ID</td>
            <td>知识点名</td>
            <td>题目</td>
            <td>题图</td>
            <td>要点</td>
            <td>答案</td>
            <td>答图</td>
            <td>难度</td>
            <td>更新</td>
            <td>删除</td>
        </tr>

        <c:forEach items="${applicationList}" var="application">
            <tr align="center">
                <td>${application.aid}</td>
                <td>${application.kname}</td>
                <td align="left">${application.acontent}</td>
                <%--<td>${application.apicture}</td>--%>
                <td><img alt="" src="/img/${application.apicture}"></td>
                <td align="left">${application.abasis}</td>
                <td align="left">${application.aanswer}</td>
                <td><img alt="" src="/img/${application.aanswerp}"></td>
                <td>${application.alevel}</td>
                <td><a href="/application/findApplicationById.action?aid=${application.aid}">修改</a></td>
                <td><a onclick="return window.confirm('确认删除吗？')" href="/application/deleteApplication.action?aid=${application.aid}">删除</a></td>
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
