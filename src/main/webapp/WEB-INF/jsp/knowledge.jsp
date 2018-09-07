<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: TSL
  Date: 2018/3/27
  Time: 20:00
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
<div style="text-align: right;width: 80%"><a href="${pageContext.request.contextPath }/knowledge/newKnowledge.action">添加</a></div>
<table border="1" cellpadding="0" cellspacing="0" width="80%" align="center">
    <tr align="center">
        <td>知识点ID</td>
        <td>所属章节</td>
        <td>知识点名</td>
        <td>更新</td>
        <td>删除</td>
    </tr>

    <c:forEach items="${knowledgeList}" var="knowledge">
        <tr align="center">
            <td>${knowledge.kno}</td>
            <td>${knowledge.cname}</td>
            <td>${knowledge.kname}</td>
            <td><a onclick="return window.confirm('请谨慎修改！')" href="/knowledge/findKnowledgeByKno.action?kno=${knowledge.kno}">修改</a></td>
            <td><a onclick="return window.confirm('请谨慎删除！')" href="/knowledge/deleteKnowledge.action?kno=${knowledge.kno}">删除</a></td>
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
