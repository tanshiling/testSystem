<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: TSL
  Date: 2018/3/26
  Time: 21:30
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
        <h2>修改编程题</h2>
        <div class="manage">
            <form action="/code/updateCode.action" method="post">
                <table class="form">
                    <tr>
                        <td class="field">ID：</td>
                        <td><input type="text" class="text" name="cid" value="${codeVo.cid}" readonly="readonly"/></td>
                    </tr>
                    <tr>
                        <td class="field">知识点名：</td>
                        <%--<td><input type="text" class="text" name="kno" value="${code.kno}" /></td>--%>
                        <td>
                            <select name="kname" id="kkk">
                                <c:forEach items="${kkk}" var="k" varStatus="kk">
                                    <option value="${k.kname}" <c:if test="${k.kname eq codeVo.kname }">selected="selected"</c:if>>
                                            ${k.kname}
                                    </option>
                                </c:forEach>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td class="field">内容：</td>
                        <td><input type="text" class="text" name="ccontent" value="${codeVo.ccontent}" /></td>
                    </tr>
                    <tr>
                        <td class="field">答题要点：</td>
                        <td><input type="text" class="text" name="cbasis" value="${codeVo.cbasis}" /></td>
                    </tr>
                    <tr>
                        <td class="field">答案：</td>
                        <td><input type="text" class="text" name="canswer" value="${codeVo.canswer}" /></td>
                    </tr>
                    <tr>
                        <td class="field">答图：</td>
                        <td><input type="text" class="text" name="canswerp" value="${codeVo.canswerp}" readonly="readonly"/></td>
                    </tr>
                    <tr>
                        <td class="field">难度：</td>
                        <%--<td><input type="text" class="text" name="clevel" value="${code.clevel}" /></td>--%>
                        <td>
                            <select name="clevel">
                                <option value="">=重新选择难度=</option>

                                <option value="1">1</option>
                                <option value="2">2</option>
                                <option value="3">3</option>
                                <option value="4">4</option>
                                <option value="5">5</option>
                                <option value="6">6</option>
                                <option value="7">7</option>
                                <option value="8">8</option>
                                <option value="9">9</option>
                                <option value="10">10</option>
                            </select>
                            原难度${codeVo.clevel}
                        </td>
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
