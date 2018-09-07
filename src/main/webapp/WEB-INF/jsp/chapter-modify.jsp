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
        <h2>修改章节</h2>
        <div class="manage">
            <form action="/chapter/updateChapter.action" method="post">
                <table class="form">
                    <tr>
                        <td class="field">章节ID：</td>
                        <td><input type="text" class="text" name="cno" value="${chapter.cno}" readonly="readonly"/></td>
                    </tr>
                    <tr>
                        <td class="field">章节名：</td>
                        <td><input type="text" class="text" name="cname" value="${chapter.cname}" /></td>
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
