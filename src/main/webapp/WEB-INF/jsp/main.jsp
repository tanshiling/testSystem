<%--
  Created by IntelliJ IDEA.
  User: wyy
  Date: 2017/12/31
  Time: 13:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>后台管理</title>
</head>
<div style="margin-top: 20px">
<frameset rows="180,*" frameborder=0 border="0" framespacing="0">
    <frame src="${pageContext.request.contextPath}/index/top.action" name="topFrame" scrolling="NO" noresize >
    <frameset cols="180,*" frameborder="0" border="0" framespacing="0">
        <frame src="${pageContext.request.contextPath}/index/left.action" name="leftFrame" noresize scrolling="YES">
        <frame src="${pageContext.request.contextPath}/index/right.action" name="mainFrame" style="background-color: #dbede7">
    </frameset>
    <%--<frame src="bottom.jsp" name="bottomFrame" scrolling="NO" noresize>--%>
</frameset>
</div>
</html>
