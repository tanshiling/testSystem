<%--
  Created by IntelliJ IDEA.
  User: TSL
  Date: 2018/3/25
  Time: 16:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div id="main" class="wrap">
    <div class="main">
        <h2>新增用户</h2>
        <div class="manage">
            <form action="/student/addStudent.action" method="post">
                <table class="form">
                    <tr>
                        <td class="field">姓名：</td>
                        <td><input type="text" class="text" name="stname" value="" /></td>
                    </tr>
                    <tr>
                        <td class="field">密码：</td>
                        <td><input type="text" class="text" name="stpassword" value="" /></td>
                    </tr>
                    <tr>
                        <td class="field">电话：</td>
                        <td><input type="text" class="text" name="sttel" value="" /></td>
                    </tr>
                    <tr>
                        <td class="field">地址：</td>
                        <td><input type="text" class="text" name="staddress" value="" /></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td><label class="ui-blue"><input type="submit" name="submit" value="添加" /></label></td>
                    </tr>
                </table>
            </form>
        </div>
    </div>
    <div class="clear"></div>
</div>
</body>
</html>
