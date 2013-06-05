<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>新增学生信息</title>
<!-- <%=request.getContextPath()%>可以获得该项目的部署后的Web应用名,常用于获取项目资源(css,js,图片等)的绝对路径 -->
<!-- <%=request.getContextPath()%>/css/yui.css 即路径 /stx-ee-demo/css/yui.css -->
<link href="<%=request.getContextPath()%>/css/yui.css" type="text/css" rel="stylesheet" />
<link href="<%=request.getContextPath()%>/css/style.css" type="text/css" rel="stylesheet" />
<!-- 引入javascript验证框架的js库文件 -->
<script type="text/javascript" src="<%=request.getContextPath()%>/js/validate.js"></script>
</head>
<body>
	<h3>新增学生信息</h3>
	<!-- 用于显示提示信息的层 -->
	<div id='msgs'><s:actionmessage/></div>
	<form id="studentForm" name="studentForm" action="<%=request.getContextPath()%>/addStudent" method="post" >
		<table>
			<tr>
				<td>学号</td>
				<td>
					<input type="text" name="student.sno" id="sno"/>
				</td>
			</tr>
			<tr>
				<td>姓名</td>
				<td>
					<input type="text" name="student.sname" id="sname"/>
				</td>
			</tr>
			<tr>
				<td>年龄</td>
				<td>
					<input type="text" name="student.sage" id="sage"/>
				</td>
			</tr>
			<tr>
				<td>性别</td>
				<td>
					<select name="student.ssex" id="ssex">
						<option value=""></option>
						<option value="男">男</option>
						<option value="女">女</option>
					</select>
				</td>
			</tr>
	
		</table>
		<input type="submit" value="提交"/>
		<input type="reset" value="重填"/>
		<!-- 通过对js内置对象location的赋值完成页面跳转功能(效果与"在地址栏输入网址然后跳转"一致) -->
		<input type="button" onclick="window.location='<%=request.getContextPath()%>/jsp/indexJSTL.jsp'" value="返回">
	</form>
<!-- 引入验证规则及处理方法的js,该文件必须位于待验证表单后,建议放置在</body>前一行(仅使用validatejs框架时适用) -->
<script type="text/javascript" src="<%=request.getContextPath()%>/js/student/studentAdd.js"></script>
</body>
</html>