<%@ page language="java" pageEncoding="UTF-8"%>
<%
	// 让当前session(会话)对象失效
	session.invalidate();
	// 重定向到web应用首页(登录页面)
	response.sendRedirect(request.getContextPath() + "/");
%>