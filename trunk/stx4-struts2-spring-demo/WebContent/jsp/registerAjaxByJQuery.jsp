<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>stx4-struts2-spring演示注册页</title>
	<link href="<%=request.getContextPath()%>/bootstrap/2.1.1/css/bootstrap.min.css" type="text/css" rel="stylesheet" /> 
	<link href="<%=request.getContextPath()%>/css/default.css" type="text/css" rel="stylesheet" /> 
	<!-- 引入javascript验证框架的js库文件 -->
	<script type="text/javascript" src="<%=request.getContextPath()%>/js/validate.js"></script>
	<!-- 引入jquery框架的js库文件 -->
	<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-1.8.2.js"></script>
</head>
<script language="javascript">
	$(function() {
		$('#loginName').blur(function() {
			var url = '<%=request.getContextPath()%>/checkLoginName?loginName=' + $('#loginName').val();
			$.get(url, function(result) {
				if (result == "true") {
					$('#divLoginName').removeClass('success').addClass('error');
					$('#errorLoginName').html('该登录名已存在');
					$('#submit_btn').attr('disabled', true);
				} else {
					$('#divLoginName').removeClass('error').addClass('success');
					$('#errorLoginName').html('该登录名可以使用');
					$('#submit_btn').attr('disabled', false);
				}
			});
		});
	})
</script>		
<body>
	<div class="container">
		<div id="header">
			<div id="title">
		    <h1>stx4-struts2-spring演示</h1>
			</div>
		</div>
		<div id="content"> 
			<form id="registerForm" action="<%=request.getContextPath()%>/register" method="post" class="form-horizontal">
				<fieldset>
					<legend><small>用户注册(未完成,后台开发中......)</small></legend>
					<!-- 用于显示提示信息的层 -->
					<div id="msgs"></div>
					<div class="control-group" id='divLoginName'>
						<label for="loginName" class="control-label">登录名:</label>
						<div class="controls">
							<input type="text" id="loginName" name="loginName" class="input-large required" onblur="checkLoginName()" />
							<span id='errorLoginName' class="help-inline"></span>
						</div>
					</div>
					<div class="control-group">
						<label for="userName" class="control-label">用户名:</label>
						<div class="controls">
							<input type="text" id="userName" name="userName" class="input-large required"/>
						</div>
					</div>
					<div class="control-group">
						<label for="password" class="control-label">密码:</label>
						<div class="controls">
							<input type="password" id="password" name="password" class="input-large required"/>
						</div>
					</div>
					<div class="control-group">
						<label for="confirmPassword" class="control-label">确认密码:</label>
						<div class="controls">
							<input type="password" id="confirmPassword" name="confirmPassword" class="input-large required"/>
						</div>
					</div>
					<div class="form-actions">
						<input id="submit_btn" class="btn btn-primary" type="submit" value="提交"/>&nbsp;	
						<input id="cancel_btn" class="btn" type="button" value="返回" onclick="history.back()"/>
					</div>
				</fieldset>
			</form>
			</div>
	</div>
<!-- 引入验证规则及处理方法的js,该文件必须位于待验证表单后,建议放置在</body>前一行(仅使用validatejs框架时适用) -->
<script type="text/javascript" src="<%=request.getContextPath()%>/js/user/register.js"></script>
</body>
</html>
