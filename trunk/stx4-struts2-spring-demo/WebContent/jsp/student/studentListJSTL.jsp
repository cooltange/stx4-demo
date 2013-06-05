<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
	import="java.util.ArrayList,com.stx.demo.entity.Student"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>学生信息列表(JSTL)</title>
<!-- ${pageContext.request.contextPath}可以获得该项目的部署后的Web应用名,常用于获取项目资源(css,js,图片等)的绝对路径 -->
<!-- ${pageContext.request.contextPath}/css/yui.css 即路径 /stx-ee-demo/css/yui.css -->
<link href="${pageContext.request.contextPath}/css/yui.css"
	type="text/css" rel="stylesheet" />
<link href="${pageContext.request.contextPath}/css/style.css"
	type="text/css" rel="stylesheet" />
<script type="text/javascript">
	function checkAll() {
		var status = document.getElementById('cbStatus').checked;
		var cbs = document.getElementsByName('cbs');
		for ( var i = 0; i < cbs.length; i++) {
			var cb = cbs[i];
			cb.checked = status;
		}
	}
	
	/**
	 * 检查(删除用)复选框是否至少被选中yig	
	 */
	function checkNull() {
		// 标记变量默认设为false(默认复选框都没有被选中)
		var flag = false;
		// 获得所有的name为cbs的复选框对象
		var cbs = document.getElementsByName('cbs');
		// 遍历所有的name为cbs的复选框对象
		for ( var i = 0; i < cbs.length; i++) {
			// 获取第i个复选框对象
			var cb = cbs[i];
			// 只要有任一复选框被选中
			if (cb.checked == true) {
				// 标记变量设为true
				flag = true;
				// 结束遍历
				break;
			}
		}
		// 如果未选中任一复选框
		if (flag == false) {
			alert("请至少选择一个学生!~");
		}

		// 返回标记变量
		return flag;
	}
</script>


</head>
<body>
	<h3>学生信息列表</h3>
	<!-- 用于显示提示信息的层 -->
	<div id='msgs'><s:actionmessage/></div>
	<form action="${pageContext.request.contextPath}/delStudents"
		method="get">
		<table>
			<tr>
				<th><input type="checkbox" onclick="checkAll()" id='cbStatus'></th>
				<th>学号</th>
				<th>姓名</th>
				<th>年龄</th>
				<th>性别</th>
				<th>操作</th>
			</tr>
			<c:forEach items="${requestScope.stuList}" var="stu">
				<tr>
					<td><input type="checkbox" name="cbs" value="${stu.sno}">
					</td>
					<td>${stu.sno}&nbsp;</td>
					<td>${stu.sname}&nbsp;</td>
					<td>${stu.sage}&nbsp;</td>
					<td>${stu.ssex}&nbsp;</td>
					<td><a href="studentUpdate?sno=${stu.sno}">修改</a>&nbsp; <a
						href="delStudent?sno=${stu.sno}">删除</a></td>
				</tr>
			</c:forEach>
		</table>
		<!-- 通过对js内置对象location的赋值完成页面跳转功能(效果与"在地址栏输入网址然后跳转"一致) -->
		<input type="submit" value="删除" onclick="return checkNull()">
		<input type="button"
			onclick="window.location='${pageContext.request.contextPath}/jsp/indexJSTL.jsp'"
			value="返回">
	</form>
</body>
</html>