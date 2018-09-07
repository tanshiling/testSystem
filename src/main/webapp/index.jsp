<%--
  Created by IntelliJ IDEA.
  User: TSL
  Date: 2018/4/4
  Time: 22:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link href="easyui/themes/default/easyui.css" rel="stylesheet" />
    <link href="easyui/themes/icon.css" rel="stylesheet" />
    <link href="easyui/locale/easyui-lang-zh_CN.js" rel="stylesheet">
    <script src="easyui/jquery.min.js"></script>
    <script src="easyui/jquery.easyui.min.js"></script>
    <style type="text/css">
        a{
            text-decoration-line: none;
        }
        a:link {
            color: #000000;
            text-decoration: none
        }
        a:visited {
            color: #000000;
            text-decoration: none
        }
        a:hover {
            color: #ff7f24;
            text-decoration: none;
        }
        a:active {
            color: #ff7f24;
            text-decoration: none;
        }
    </style>
</head>
<body>
<div id="cc" class="easyui-layout" style="width:1366px;height:631px;margin:-8px ">
    <div data-options="region:'north',title:''" style="height:120px;">
        <h2 align="center">题库管理系统</h2>
    </div>
    <div data-options="region:'south',title:''" style="height:50px;">
        <h5 align="center">中北大学</h5>
    </div>
    <div data-options="region:'west',title:'题库分类展示'" style="width:180px;">
        <table>
            <tr>
                <td>&nbsp;</td>
            </tr>
            <tr>
                <td><a href="/selectques1/getAllSelectQues1.action" target="_self"> &nbsp;&nbsp;选择题</a></td>
            </tr>
            <tr>
                <td><a href="/judgeques1/getAllJudgeQues1.action" target="_self"> &nbsp;&nbsp;判断题</a></td>
            </tr>
            <tr>
                <td><a href="/insertques1/getAllInsertQues1.action" target="_self"> &nbsp;&nbsp;填空题</a></td>
            </tr>
            <tr>
                <td><a href="/code1/getAllCode1.action" target="_self"> &nbsp;&nbsp;编程题</a></td>
            </tr>
            <tr>
                <td><a href="/shortanswer1/getAllShortAnswer1.action" target="_self"> &nbsp;&nbsp;简答题</a></td>
            </tr>
            <tr>
                <td><a href="/application1/getAllApplication1.action" target="_self">&nbsp;&nbsp;综合应用题</a></td>
            </tr>
        </table>
    </div>
    <div data-options="region:'center',title:'&nbsp;&nbsp;&nbsp;&nbsp;真题'" style="padding:5px;background:#eee;">
        <img src="images/welcome.gif">
    </div>
</div>
</body>
</html>
