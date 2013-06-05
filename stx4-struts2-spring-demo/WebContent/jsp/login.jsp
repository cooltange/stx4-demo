<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>stx4-struts2-spring演示登录</title>
	<link href="<%=request.getContextPath()%>/bootstrap/2.1.1/css/bootstrap.min.css" type="text/css" rel="stylesheet" /> 
	<link href="<%=request.getContextPath()%>/css/default.css" type="text/css" rel="stylesheet" /> 
</head>

<body>
	<div class="container">
		<div id="header">
			<div id="title">
		    <h1>stx4-struts2-spring演示</h1>
			</div>
		</div>
		<div id="content"> 
		
			<form id="loginForm" name='loginForm' action="<%=request.getContextPath()%>/login" method="post" class="form-horizontal">
				<fieldset>
					<legend>
						<small>用户登录</small>
					</legend>
					<!-- 用于显示提示信息的层 -->
					<div id="msgs"></div>
					<s:actionerror cssClass="alert alert-error"/>
					<div class="control-group">
						<label for="loginName" class="control-label">用户名:</label>
						<div class="controls">
							<input type="text" id="loginName" name="user.loginName"  value="${param.loginName}" />
						</div>
					</div>
					<div class="control-group">
						<label for="password" class="control-label">密码:</label>
						<div class="controls">
							<input type="password" id="password" name="user.password" />
						</div>
					</div>
							
					<div class="control-group">
						<div class="controls">
							<input id="submit_btn" class="btn btn-primary" type="submit" value="登录"/> <a class="btn" href="<%=request.getContextPath()%>/jsp/register.jsp">注册</a>
						</div>
					</div>
				</fieldset>
			</form>
		</div>
	</div>
</body>
</html>
