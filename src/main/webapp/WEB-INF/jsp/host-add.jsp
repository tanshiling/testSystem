<%--
  Created by IntelliJ IDEA.
  User: TSL
  Date: 2018/3/26
  Time: 18:28
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
        <h2>新增管理员</h2>
        <div class="manage">
            <form action="/host/addManager.action" method="post">
                <table class="form">
                    <tr>
                        <td class="field">姓名：</td>
                        <td><input type="text" class="text" name="mname" value="" /></td>
                    </tr>
                    <tr>
                        <td class="field">密码：</td>
                        <td><input type="text" class="text" name="mpassword" value="" /></td>
                    </tr>
                    <tr>
                        <td class="field">电话：</td>
                        <td><input type="text" class="text" name="mtel" value="" /></td>
                    </tr>
                    <tr>
                        <td class="field">地址：</td>
                        <td><input type="text" class="text" name="maddress" value="" /></td>
                    </tr>
                    <tr>
                        <td class="field">超管：</td>
                        <%--<td><input type="text" class="text" name="mm" value="" /></td>--%>
                        <td>
                            <select name="mm">
                                <option value="0">管理员</option>
                                <option value="1">教师</option>
                            </select>
                        </td>
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
