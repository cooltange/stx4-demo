<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@page import="com.stx.demo.entity.User"%>
<%@page import="com.stx.demo.entity.User"%>
<%@page import="com.stx.demo.entity.Blogger"%>
<%@page import="com.stx.demo.dao.BloggerDao"%>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title>双体博客</title>
	
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta name="description" content="">
	<meta name="author" content="">
	
	<!-- Le styles -->
	<link href="css/bootstrap.css" rel="stylesheet">
	<style>
	body {
		padding-top: 60px; /* 60px to make the container go all the way to the bottom of the topbar */
	}
	</style>
	
</head>
<body>
	<div class="navbar navbar-fixed-top navbar-inverse">
		<div class="navbar-inner">
			<div class="container-fluid">
				<a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse"> 
					<span class="icon-bar"> </span> 
					<span class="icon-bar"> </span>
					<span class="icon-bar"> </span>
				</a>
				<a class="brand" href="#"> 双体博客 </a>
				<div class="nav-collapse">
					<ul class="nav">
						<li><a href="#"> 主页 </a></li>
						<li><a href="#"> 关于我们 </a></li>
						<li><a href="mail:to#"> 联系我们 </a></li>
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
						<label for="username">用户名</label> 
						<input type="text" id="username" name="username" >
					</div>
					<div class="control-group">
						<label for="password">密码</label> 
						<input type="password" name="password" >
					</div>
					<a class="btn btn-primary" href="#"> 登录 </a> 
					<a class="btn btn-primary" href="#"> 注册 </a>
				</form>
			</div>
			<div class="span9">
				<ul class="nav nav-tabs">
					<li class="active"><a>最新更新的博客</a></li>
				</ul>
				<div class="hero-unit">
					<%
					ArrayList<Blogger> blogList = (ArrayList<Blogger>) request.getAttribute("bloggerList");
					if (blogList != null) {
					%>
					<%
						for (Blogger blogger : blogList) {
					%>
					<div class="row well">
						<div class="well">
							<div class="span4"><h4><%=blogger.getTitle()%></h4></div>
							<div class="span3 offset5"><%=blogger.getCreateTime().toString().substring(0,10)%></div>
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
		
		<div>©company 双体系 2013</div>
	</div>
	
</body>
</html>
