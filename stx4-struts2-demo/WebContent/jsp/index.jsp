<%@ page contentType="text/html; charset=UTF-8" import="com.stx.demo.entity.User" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>stx4-struts2演示欢迎页</title>
	<link href="<%=request.getContextPath()%>/bootstrap/2.1.1/css/bootstrap.min.css" type="text/css" rel="stylesheet" /> 
	<link href="<%=request.getContextPath()%>/css/default.css" type="text/css" rel="stylesheet" /> 
</head>

<body>
	<div class="container">
		<div id="header">
			<div id="title">
		    <h1>stx4-struts2演示欢迎页</h1>
			</div>
		</div>
		<div id="content"> 
				<fieldset>
					<%-- 从session(会话)对象中获得当前已登录用户对象 --%>
					<% User currentUser = (User)session.getAttribute("currentUser"); %>
					<legend>
						<%-- 从已登录用户对象获得该用户的用户名 --%>
						<%if(currentUser!=null){ %> 
							欢迎您, <%=currentUser.getUserName()%>
							<a class="btn" href="<%=request.getContextPath()%>/jsp/logout.jsp">退出</a>
						<%} else{ %>
							未登录 
							<a class="btn" href="<%=request.getContextPath()%>/jsp/login.jsp">重新登录</a>
						<% } %>
					</legend>
					
					<%if(currentUser!=null){ %>
					<div class="control-group">
						<a href="<%=request.getContextPath()%>/studentQuery">学生信息列表</a>
					</div>
					<div class="control-group">
						<a href="<%=request.getContextPath()%>/jsp/student/studentAdd.jsp">新增学生信息</a>
					</div>
					<% } %>		
				</fieldset>
		</div>
	</div>
</body>
</html>
