<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>上传图像显示页面</title>
  </head>
  
  <body>
    <div> 
        <img src ='${pageContext.request.contextPath}/uploadImgs/${imgFileName} ' />
        <br /> 
    </div > 
    
  </body>
</html>
