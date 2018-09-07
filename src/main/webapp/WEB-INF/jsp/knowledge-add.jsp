<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: TSL
  Date: 2018/3/27
  Time: 20:01
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
        <h2>新增知识点</h2>
        <div class="manage">
            <form action="/knowledge/addKnowledge.action" method="post">
                <table class="form">
                    <tr>
                        <td class="field">所属章节名：</td>
                        <%--<td><input type="text" class="text" name="cname" value="" /></td>--%>
                        <td>
                            <select name="cname" id="ccc">
                                <option value="">===选择章节名===</option>
                                <c:forEach items="${ccc}" var="c" varStatus="cc">
                                    <option value="${c.cname}">
                                            ${c.cname}
                                    </option>
                                </c:forEach>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td class="field">知识点名：</td>
                        <td><input type="text" class="text" name="kname" value="" /></td>
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
