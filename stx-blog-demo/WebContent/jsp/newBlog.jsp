<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!--
Design by http://www.FreeWebsiteTemplateZ.com
Released for free under a Creative Commons Attribution 3.0 License
-->
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>我的博客</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<link href="<%=request.getContextPath()%>/css/style.css" rel="stylesheet" type="text/css" />
</head>
<body>
<div class="main">
  <div class="header">
    <div class="header_resize">
      <div class="logo">
        <h1><a href="homepage.html">Cai<span>Ye</span><small>口号</small></a></h1>
      </div>
      <div class="menu_nav">
        <ul>
          <li><a href="#">我的主页</a></li>
          <li class="active"><a href="#">我的博文</a></li>
          <li><a href="#">我的资料</a></li>
          <li><a href="#">我的收藏</a></li>
          <li><a href="#">退出</a></li>
        </ul>
      </div>
      <div class="clr"></div>
      <div class="hbg"><img src="<%=request.getContextPath()%>/images/logo.gif" width="235" height="100" alt="header images" class="fl" />
        <h3>菜叶项目小组博客</h3>
        <p><strong>小组简介</strong></p>
        <div class="clr"></div>
      </div>
    </div>
    <div class="clr"></div>
  </div>
  <div class="content">
    <div class="mainbar">
      <div class="article">
      	${message}
      	<form action="<%=request.getContextPath()%>/bloggerAdd" method="post">
	       <font class="floatr"><a href="#">发布新的博客</a></font>
	        <p class="post-data"><span class="date" id="atitle"><strong>博客标题:</strong></span>
	        	<input type="text" id="btiatle" name="btitle"/>
	        </p>
	        <strong>博客内容:</strong>
	        <p>
	        	<textarea id="message" name="message" rows="8" cols="50"></textarea>
	        </p>
	        <div class="clr">
	        </div>
	        <div>
	         </div>
	        <br/>
	        <input type="submit" value="提交" name="imageField" id="imageField" class="send" />
	        <br/>
        </form>
      </div>
      
    </div>
    <div class="sidebar">
      <div class="gadget">
        <div class="search">
          <form method="get" id="search" action="">
            <span>
            <input type="text" value="搜索..." name="s" id="s" />
            <input name="searchsubmit" type="image" src="<%=request.getContextPath()%>/images/search.gif" value="Go" id="searchsubmit" class="btn"  />
            </span>
          </form>
          <!--/searchform -->
          <div class="clr"></div>
        </div>
      </div>
      <div class="gadget"> <font class="floatr"><a href="#">管理</a></font>
        <h2 class="star"><span>个人</span>资料</h2>
        <div class="clr"></div>
        <ul class="sb_menu">
          用户昵称：
          <li><a href="#">双体实训</a></li>
          博文数量：
          <li><a href="#">50条</a></li>
        </ul>
      </div>
      <div class="gadget"> <font class="floatr"><a href="#">管理</a></font>
        <h2 class="star">分<span>类</span></h2>
        <div class="clr"></div>
        <ul class="sb_menu">
          <li><a href="#">双体实训</a></li>
          <li><a href="#">50条</a></li>
        </ul>
      </div>
    </div>
    <div class="clr"></div>
  </div>
</div>
<div class="footer">
  <div class="footer_resize">
    <p class="lf">© Copyright <a href="#">MyWebSite</a>.</p>
    <div class="clr"></div>
  </div>
</div>
</body>
</html>