<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="com.stx.demo.entity.User"%>
<%@page import="com.stx.demo.entity.User"%>
<%@page import="com.stx.demo.entity.Blogger"%>
<%@page import="com.stx.demo.dao.BloggerDao"%>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="utf-8">
<title></title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">
<!-- Le styles -->
<link href="css/bootstrap.css" rel="stylesheet">
<style>
body {
	padding-top: 60px; /* 60px to make the container go all the way
      to the bottom of the topbar */
}
</style>
<link href="css/bootstrap-responsive.css" rel="stylesheet">
<!-- Le HTML5 shim, for IE6-8 support of HTML5 elements -->
<!--[if lt IE 9]>
      <script src="http://html5shim.googlecode.com/svn/trunk/html5.js">
      </script>
    <![endif]-->
<!-- Le fav and touch icons -->
<link rel="shortcut icon" href="assets/ico/favicon.ico">
<link rel="apple-touch-icon-precomposed" sizes="144x144"
	href="assets/ico/apple-touch-icon-144-precomposed.png">
<link rel="apple-touch-icon-precomposed" sizes="114x114"
	href="assets/ico/apple-touch-icon-114-precomposed.png">
<link rel="apple-touch-icon-precomposed" sizes="72x72"
	href="assets/ico/apple-touch-icon-72-precomposed.png">
<link rel="apple-touch-icon-precomposed"
	href="assets/ico/apple-touch-icon-57-precomposed.png">
<style>
</style>
</head>
<body>
	<div class="navbar navbar-fixed-top navbar-inverse">
		<div class="navbar-inner">
			<div class="container-fluid">
				<a class="btn btn-navbar" data-toggle="collapse"
					data-target=".nav-collapse"> <span class="icon-bar"> </span> <span
					class="icon-bar"> </span> <span class="icon-bar"> </span>
				</a> <a class="brand" href="#"> 双体博客 </a>
				<div class="nav-collapse">
					<ul class="nav">
						<li><a href="#"> Home </a></li>
						<li><a href="#"> About </a></li>
						<li><a href="#"> Contact </a></li>
					</ul>
				</div>
			</div>
		</div>
	</div>
	<div class="container-fluid">
		<div class="row-fluid">
			<div class="span3">
				<form>
					<div class="control-group">
						<label for="username"> 用户名

							<div
								id="xunlei_com_thunder_helper_plugin_d462f475-c18e-46be-bd10-327458d045bd">
								&nbsp;</div>
						</label> <input id="username" name="username" type="">
					</div>
					<div class="control-group">
						<label for="password">
							<div
								id="xunlei_com_thunder_helper_plugin_d462f475-c18e-46be-bd10-327458d045bd">
								密码</div>
							<div
								id="xunlei_com_thunder_helper_plugin_d462f475-c18e-46be-bd10-327458d045bd">
								&nbsp;</div>
						</label> <input name="password" type="">
					</div>
					<a class="btn btn-primary" href="#"> 登录 </a> <a
						class="btn btn-primary" href="#"> 注册 </a>
				</form>
			</div>
			<div class="span9">
				<ul class="nav nav-tabs">
					<li class="active"><a>最新更新的博客</a></li>

				</ul>
				<div class="hero-unit">
					<%
						ArrayList<Blogger> blogList = (ArrayList<Blogger>) request
										.getAttribute("bloggerList");
								if (blogList != null) {
					%>

					<%
						for (Blogger blogger : blogList) {
					%>
					<div class="row well">
						<div class="well">
							<div class="span4"><h4><%=blogger.getTitle()%></h4></div>
							<div class="span3 offset5"><%=blogger.getCreateTime()%></div>
						</div>
						<div class="well">
							<%=blogger.getContent() %>
						</div>
						<div class="span2"><a class="btn btn-primary" href="#"> 查看全文 » </a></div>
					</div>
					<%
						}
						}
					%>
				</div>



			</div>
		</div>
		<hr>
		<div>© Company 2012</div>
	</div>



	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.7.2/jquery.min.js">
		
	</script>
	<script src="assets/js/bootstrap.js">
		
	</script>
</body>
</html>
