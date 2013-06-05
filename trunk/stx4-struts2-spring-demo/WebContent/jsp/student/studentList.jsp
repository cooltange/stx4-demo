<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.ArrayList,com.stx.demo.entity.Student"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>学生信息列表</title>
<!-- request.getContextPath()可以获得该项目的部署后的Web应用名,常用于获取项目资源(css,js,图片等)的绝对路径 -->
<!-- <%=request.getContextPath()%>/css/yui.css 即路径 /stx-ee-demo/css/yui.css -->
<link href="<%=request.getContextPath()%>/css/yui.css" type="text/css" rel="stylesheet" />
<link href="<%=request.getContextPath()%>/css/style.css" type="text/css" rel="stylesheet" />
</head>
<body>
	<h3>学生信息列表</h3>
	<!-- 用于显示提示信息的层 -->
	<div id='msgs'>${messages}</div>
	<table>
		<tr>
			<th>编号</th>
			<th>姓名</th>
			<th>年龄</th>
			<th>性别</th>
			<th>操作</th>
		</tr>
		<%
			// 从request中获取学生信息列表对象
			ArrayList<Student> stuList = (ArrayList<Student>)request.getAttribute("stuList");
			// 遍历学生信息列表
			for(Student student : stuList)
			{
		%>
		<tr>
			<td><%=student.getSno()%>&nbsp;</td>
			<td><%=student.getSname()%>&nbsp;</td>
			<td><%=student.getSage()%>&nbsp;</td>
			<td><%=student.getSsex()%>&nbsp;</td>
			<td>
				<a href="studentUpdate?sno=<%=student.getSno()%>">修改</a>&nbsp;
				<a href="studentDel?sno=<%=student.getSno()%>">删除</a>
			</td>
		</tr>
		<%	} %>
	</table>
	
	<!-- 通过对js内置对象location的赋值完成页面跳转功能(效果与"在地址栏输入网址然后跳转"一致) -->
	<input type="button" onclick="window.location='<%=request.getContextPath()%>/jsp/indexJSTL.jsp'" value="返回">
</body>
</html>