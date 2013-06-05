<%@ page contentType="text/html; charset=UTF-8" import="com.stx.demo.entity.User" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>stx4-struts2-spring演示欢迎页(JSTL)</title>
	<link href="${pageContext.request.contextPath}/bootstrap/2.1.1/css/bootstrap.min.css" type="text/css" rel="stylesheet" /> 
	<link href="${pageContext.request.contextPath}/css/default.css" type="text/css" rel="stylesheet" /> 
</head>

<body>
	<div class="container">
		<div id="header">
			<div id="title">
		    <h1>stx4-struts2-spring演示欢迎页</h1>
			</div>
		</div>
		<div id="content"> 
				<fieldset>
					<legend>
						<%-- 从已登录用户对象获得该用户的用户名 --%>
						<c:if test="${sessionScope.currentUser != null}">
							欢迎, ${sessionScope.currentUser.userName}
							<a class="btn" href="${pageContext.request.contextPath}/jsp/logout.jsp">退出</a>
						</c:if>
						<c:if test="${sessionScope.currentUser == null}">
							未登录 
							<a class="btn" href="${pageContext.request.contextPath}/jsp/login.jsp">重新登录</a>
						</c:if>
					</legend>
					
					<c:if test="${sessionScope.currentUser != null}">
						<div class="control-group">
							<a href="${pageContext.request.contextPath}/queryStudent">学生信息列表</a>
						</div>
						<div class="control-group">
							<a href="${pageContext.request.contextPath}/queryStudentPage?student.ssex=">学生信息列表(分页查询)</a>
						</div>
						<div class="control-group">
							<a href="${pageContext.request.contextPath}/jsp/student/studentAdd.jsp">新增学生信息</a>
						</div>
						<div class="control-group">
							<a href="${pageContext.request.contextPath}/jsp/upload/upload.jsp">图像文件上传</a>
						</div>
					</c:if>	
				</fieldset>
		</div>
	</div>
</body>
</html>
