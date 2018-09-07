<%--
  Created by IntelliJ IDEA.
  User: TSL
  Date: 2018/4/3
  Time: 14:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>用户登录</title>
</head>
<body background=/images/bg.jpg style="background-repeat: no-repeat">
<form action="${pageContext.request.contextPath }/login.action" method="post">
    <table  style="margin-top: 80px;margin-left: 1050px;">
        <tr>
            <td>用户名：</td>
            <td><input type="text" name="mname"></td>
        </tr>
        <tr>
            <td>密&nbsp;&nbsp;&nbsp;&nbsp;码：</td>
            <td><input type="password" name="mpassword"></td>
        </tr>
        <tr>
            <td colspan="2" align="center">
                <input type="submit" value="登  录" name="登录">
            </td>
        </tr>
    </table>
</form>
</body>
</html>
