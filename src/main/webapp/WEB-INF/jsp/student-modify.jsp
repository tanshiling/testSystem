<%--
  Created by IntelliJ IDEA.
  User: TSL
  Date: 2018/3/25
  Time: 11:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div id="main" class="wrap">
    <div class="main">
        <h2>修改用户</h2>
        <div class="manage">
            <form action="/student/updateStudent.action" method="post">
                <table class="form">
                    <tr>
                        <td class="field">ID：</td>
                        <td><input type="text" class="text" name="stid" value="${student.stid}" readonly="readonly"/></td>
                    </tr>
                    <tr>
                        <td class="field">姓名：</td>
                        <td><input type="text" class="text" name="stname" value="${student.stname}" /></td>
                    </tr>
                    <tr>
                        <td class="field">密码：</td>
                        <td><input type="text" class="text" name="stpassword" value="${student.stpassword}" /></td>
                    </tr>
                    <tr>
                        <td class="field">电话：</td>
                        <td><input type="text" class="text" name="sttel" value="${student.sttel}" /></td>
                    </tr>
                    <tr>
                        <td class="field">地址：</td>
                        <td><input type="text" class="text" name="staddress" value="${student.staddress}" /></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td><label class="ui-blue"><input type="submit" name="submit" value="更新" /></label></td>
                    </tr>
                </table>
            </form>
        </div>
    </div>
    <div class="clear"></div>
</div>
</body>
</html>
