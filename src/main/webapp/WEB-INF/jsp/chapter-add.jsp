<%--
  Created by IntelliJ IDEA.
  User: TSL
  Date: 2018/3/27
  Time: 18:40
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
        <h2>章节添加</h2>
        <div class="manage">
            <form action="/chapter/addChapter.action" method="post">
                <table class="form">
                    <tr>
                        <td class="field">章节名称：</td>
                        <td><input type="text" class="text" name="cname" value="" /></td>
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
