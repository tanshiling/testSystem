<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: TSL
  Date: 2018/3/26
  Time: 19:04
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
        <h2>修改选择题</h2>
        <div class="manage">
            <form action="/selectques/updateSelectQues.action" method="post">
                <table class="form">
                    <tr>
                        <td class="field">ID：</td>
                        <td><input type="text" class="text" name="sid" value="${selectQuesVo.sid}" readonly="readonly"/></td>
                    </tr>
                    <tr>
                        <td class="field">知识点名：</td>
                        <%--<td><input type="text" class="text" name="kno" value="${selectQues.kno}" /></td>--%>
                        <td>
                            <select name="kname" id="kkk">
                                <c:forEach items="${kkk}" var="k" varStatus="kk">
                                    <option value="${k.kname}" <c:if test="${k.kname eq selectQuesVo.kname }">selected="selected"</c:if>>
                                            ${k.kname}
                                    </option>
                                </c:forEach>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td class="field">内容：</td>
                        <td><input type="text" class="text" name="scontent" value="${selectQuesVo.scontent}" /></td>
                    </tr>
                    <tr>
                        <td class="field">选项A：</td>
                        <td><input type="text" class="text" name="sa" value="${selectQuesVo.sa}" /></td>
                    </tr>
                    <tr>
                        <td class="field">选项B：</td>
                        <td><input type="text" class="text" name="sb" value="${selectQuesVo.sb}" /></td>
                    </tr>
                    <tr>
                        <td class="field">选项C：</td>
                        <td><input type="text" class="text" name="sc" value="${selectQuesVo.sc}" /></td>
                    </tr>
                    <tr>
                        <td class="field">选项D：</td>
                        <td><input type="text" class="text" name="sd" value="${selectQuesVo.sd}" /></td>
                    </tr>
                    <tr>
                        <td class="field">答案：</td>
                        <%--<td><input type="text" class="text" name="sanswer" value="${selectQuesVo.sanswer}" /></td>--%>
                        <td>
                            <select name="sanswer" id="selectQuesVo">
                                <option value="">=重新选择答案=</option>
                                <option value="A">A</option>
                                <option value="B">B</option>
                                <option value="C">C</option>
                                <option value="D">D</option>
                            </select>
                            原答案${selectQuesVo.sanswer}
                        </td>
                    </tr>
                    <tr>
                        <td class="field">难度：</td>
                        <%--<td><input type="text" class="text" name="slevel" value="${selectQuesVo.slevel}" /></td>--%>
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
                            原难度${selectQuesVo.slevel}
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
