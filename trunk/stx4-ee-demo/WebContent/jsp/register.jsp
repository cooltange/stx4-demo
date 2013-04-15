<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>stx4-ee演示注册页</title>
	<link href="<%=request.getContextPath()%>/bootstrap/2.1.1/css/bootstrap.min.css" type="text/css" rel="stylesheet" /> 
	<link href="<%=request.getContextPath()%>/css/default.css" type="text/css" rel="stylesheet" /> 
	<!-- 引入javascript验证框架的js库文件 -->
	<script type="text/javascript" src="<%=request.getContextPath()%>/js/validate.js"></script>
</head>
<script language="javascript">
	var xmlHttpRequest;
  	//创建XMLHttpRequest对象       
	function createXMLHttpRequest() {
		if (window.XMLHttpRequest) { //判断游览器，Mozilla 浏览器
			xmlHttpRequest = new XMLHttpRequest();
		} else if (window.ActiveXObject) { // IE浏览器
			try {
				xmlHttpRequest = new ActiveXObject("Msxml2.XMLHTTP");
			} catch (e) {
				try {
					xmlHttpRequest = new ActiveXObject("Microsoft.XMLHTTP");
				} catch (e) {
				}
			}
		}
	}
	//发送匹配请求函数
	function checkLoginName() {
		//得到输入框的内容            
		var loginName = document.getElementById('loginName').value;
		//1.创建XMLHttpRequest对象
		createXMLHttpRequest();
		//2.将状态触发器绑定到一个函数(指定响应函数callback是后面定义的一个函数，在提交到后台执行成功后,会自动执行该callback函数)
		xmlHttpRequest.onreadystatechange = callback;
		//编写提交的地址   encodeURI()是处理乱码用的，转换中文字符为UTF-8编码，对西欧字符没有影响
		var url = "<%=request.getContextPath()%>" + "/checkLoginName?loginName=" + encodeURI(loginName);
		//3.使用open方法建立与服务器的连接
		xmlHttpRequest.open("GET", url, true);
		//4.向服务器端发送数据发送请求，异步提交到后台进行处理(GET方式只需要发送null即可)
		xmlHttpRequest.send(null);
	}
	// 5.在回调函数中对返回数据进行处理
	function callback() {
		if (xmlHttpRequest.readyState == 4) { // 判断对象状态
			if (xmlHttpRequest.status == 200) { // 信息已经成功返回，开始处理信息
				//得到返回的信息(responseText对象)
				var respText = xmlHttpRequest.responseText;
				//根据返回的结果进行业务逻辑处理
				if (respText == "true") {
					//alert('该用户登录名已存在,请重新输入!');
					document.getElementById('errorLoginName').innerHTML = '该登录名已存在';
					document.getElementById('divLoginName').className = 'control-group error';
					document.getElementById('submit_btn').disabled = 'disabled';
				}else{
					document.getElementById('errorLoginName').innerHTML = '';
					document.getElementById('divLoginName').className = 'control-group';
					document.getElementById('submit_btn').disabled = '';
				}
			} else { //页面不正常
				alert("您所请求的页面有异常!");
			}
		}
	}
</script>		
<body>
	<div class="container">
		<div id="header">
			<div id="title">
		    <h1>stx4-ee演示</h1>
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
