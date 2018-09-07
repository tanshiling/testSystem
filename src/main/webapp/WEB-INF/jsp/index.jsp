<%--
  Created by IntelliJ IDEA.
  User: TSL
  Date: 2018/4/3
  Time: 14:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
    <style type="text/css">
        body{
            background: url(/img/4.jpg) no-repeat center center;



        }
        table.hovertable td {
            border-width: 1px;
            padding: 8px;
            border-style: solid;
            border-color: #a9c6c9;
            color:red;
        }

    </style>
</head>
<body>
<form  method="post" action="LoginServlet">
    <table align="center">
        <tr>
            <td>用户名</td>
            <td><input type="text" name="username"/></td>
        </tr>
        <tr>
            <td>密码</td>
            <td><input type="password" name="password"></td>
        </tr>

    </table>
    <div align="center">
        <input type="submit"  value="登录"  /></div>
</form>
</body>
</html>
