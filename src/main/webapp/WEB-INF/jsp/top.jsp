<%@ page import="com.tsl.model.Manager" %><%--
  Created by IntelliJ IDEA.
  User: wyy
  Date: 2017/12/31
  Time: 13:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
</head>
<%
    String show = "";
    Object o = session.getAttribute("manager");
    if (o != null){
        show = ((Manager)o).getMname() + "" ;
    }
%>
<body background="/images/top_01.jpg" style="background-repeat: no-repeat">
<table width="100%" height="92%" border="0" cellspacing="0" cellpadding="0">
    <tr>
        <td>
            <%--<img width="100%" src="${pageContext.request.contextPath}/images/top_01.jpg">--%>
        </td>
    </tr>
    <table width="100%" border="0" cellspacing="0" cellpadding="0">
        <tr>
            <td height="20" valign="bottom">
                <table width="100%" border="0" cellspacing="0" cellpadding="0">
                    <tr>
                        <td width="85%" align="left">
                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                            <%--<font color="#000000">
                                <script language="JavaScript">
                                    <!--
                                    tmpDate = new Date();
                                    date = tmpDate.getDate();
                                    month = tmpDate.getMonth() + 1;
                                    year = tmpDate.getFullYear();
                                    document.write(year);
                                    document.write("年");
                                    document.write(month);
                                    document.write("月");
                                    document.write(date);
                                    document.write("日 ");

                                    myArray = new Array(6);
                                    myArray[0] = "星期日"
                                    myArray[1] = "星期一"
                                    myArray[2] = "星期二"
                                    myArray[3] = "星期三"
                                    myArray[4] = "星期四"
                                    myArray[5] = "星期五"
                                    myArray[6] = "星期六"
                                    weekday = tmpDate.getDay();
                                    if (weekday == 0 | weekday == 6) {
                                        document.write(myArray[weekday])
                                    }
                                    else {
                                        document.write(myArray[weekday])
                                    }
                                    ;
                                    // -->
                                </script>
                            </font>--%>
                        </td>
                        <td width="15%">
                            <table width="100%" border="0" cellspacing="0" cellpadding="0">
                                <tr>
                                    <%--<td width="16"
                                        background="${pageContext.request.contextPath}/images/mis_05b.jpg">
                                        <img
                                                src="${pageContext.request.contextPath}/images/mis_05a.jpg"
                                                width="6" height="18">
                                    </td>
                                    <td width="155" valign="bottom"
                                        background="${pageContext.request.contextPath}/images/mis_05b.jpg">
                                        用户名：
                                        &lt;%&ndash;<%=manger.getMname() %>&ndash;%&gt;
                                    </td>
                                    <td width="10" align="right"
                                        background="${pageContext.request.contextPath}/images/mis_05b.jpg">
                                        <img src="${pageContext.request.contextPath}/images/mis_05c.jpg" width="6"
                                             height="18">
                                    </td>--%>
                                    <td bgcolor="#caede2">&nbsp;&nbsp;管理员：<%=show %></td>
                                    <td bgcolor="#dc143c" width="25%"><a href="">&nbsp;&nbsp;退出</a></td>
                                </tr>
                            </table>
                        </td>
                    </tr>
                </table>
            </td>
        </tr>
    </table>
</table>
</body>
</html>
