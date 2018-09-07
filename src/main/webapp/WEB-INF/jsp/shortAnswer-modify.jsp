<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: TSL
  Date: 2018/3/26
  Time: 22:05
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
        <h2>修改简答题</h2>
        <div class="manage">
            <form action="/shortanswer/updateShortAnswer.action" method="post">
                <table class="form">
                    <tr>
                        <td class="field">ID：</td>
                        <td><input type="text" class="text" name="said" value="${shortAnswerVo.said}" readonly="readonly"/></td>
                    </tr>
                    <tr>
                        <td class="field">知识点名：</td>
                        <%--<td><input type="text" class="text" name="kno" value="${shortAnswer.kno}" /></td>--%>
                        <td>
                            <select name="kname" id="kkk">
                                <c:forEach items="${kkk}" var="k" varStatus="kk">
                                    <option value="${k.kname}" <c:if test="${k.kname eq shortAnswerVo.kname }">selected="selected"</c:if>>
                                            ${k.kname}
                                    </option>
                                </c:forEach>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td class="field">内容：</td>
                        <td><input type="text" class="text" name="sacontent" value="${shortAnswerVo.sacontent}" /></td>
                    </tr>
                    <tr>
                        <td class="field">答题要点：</td>
                        <td><input type="text" class="text" name="sabasis" value="${shortAnswerVo.sabasis}" /></td>
                    </tr>
                    <tr>
                        <td class="field">答案：</td>
                        <td><input type="text" class="text" name="saanswer" value="${shortAnswerVo.saanswer}" /></td>
                    </tr>
                    <tr>
                        <td class="field">难度：</td>
                        <%--<td><input type="text" class="text" name="salevel" value="${shortAnswerVo.salevel}" /></td>--%>
                        <td>
                            <select name="slevel">
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
                            原难度${shortAnswerVo.salevel}
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
