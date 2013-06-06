<%@ page language="java" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>文件上传页面</title>
  </head>
  
  <body>
     <form action="imgUpload.action" method="post" enctype="multipart/form-data">
        图像文件<input type="file" name="img"/>(大小小于2M)<BR>
        <input type="submit" value="上传"/>
     </form>
  </body>
</html>
