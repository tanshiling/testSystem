<%@ page language="java" pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>菜单</title>
<link rel="StyleSheet" href="${pageContext.request.contextPath}/css/dtree.css" type="text/css" />
</head>
<body bgcolor="#caede2">
<%--<table width="150" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td height="12"></td>
  </tr>
</table>--%>
<table width="100%" border="0">
  <tr>
    <td>
<div class="dtree">

	<a href="javascript: d.openAll();">展开所有</a> | <a href="javascript: d.closeAll();">关闭所有</a>
	<div>&nbsp;</div>
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/dtree.js"></script>
	<script type="text/javascript">
		d = new dTree('d');
		d.add('01',-1,'系统菜单树');

		d.add('0101','01','用户管理','','','mainFrame');
		d.add('010101','0101','学生','${pageContext.request.contextPath}/student/getAllStudent.action','','mainFrame');
		d.add('010102','0101','管理员','${pageContext.request.contextPath}/host/getAllManager.action','','mainFrame');

		d.add('0102','01','章节管理','','','mainFrame');
		d.add('010201','0102','章节管理','${pageContext.request.contextPath}/chapter/getAllChapter.action','','mainFrame');

        d.add('0103','01','知识点管理');
        d.add('010301','0103','知识点管理','${pageContext.request.contextPath}/knowledge/getAllKnowledge.action','','mainFrame');

        d.add('0104','01','题库系统管理','','','mainFrame');
        d.add('010401','0104','选择题','${pageContext.request.contextPath}/selectques/getAllSelectQues.action','','mainFrame');
        d.add('010402','0104','判断题','${pageContext.request.contextPath}/judgeques/getAllJudgeQues.action','','mainFrame');
        d.add('010403','0104','填空题','${pageContext.request.contextPath}/insertques/getAllInsertQues.action','','mainFrame');
        d.add('010404','0104','编程题','${pageContext.request.contextPath}/code/getAllCode.action','','mainFrame');
        d.add('010405','0104','简答题','${pageContext.request.contextPath}/shortanswer/getAllShortAnswer.action','','mainFrame');
        d.add('010406','0104','综合应用题','${pageContext.request.contextPath}/application/getAllApplication.action','','mainFrame');
       document.write(d);
	</script>
</div>	</td>
  </tr>
</table>
</body>
</html>
