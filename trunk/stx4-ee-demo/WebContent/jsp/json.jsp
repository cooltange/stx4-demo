<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>test json</title>
<script type="text/javascript">
var xmlHttpRequest;

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
				xmlHttpRequest = null;
			}
		}
	}
}

function showusers() {
	createXMLHttpRequest();
//	alert(xmlHttpRequest);
	xmlHttpRequest.onreadystatechange = showstus;
	xmlHttpRequest.open("GET","<%=request.getContextPath()%>/getstus", true);
	xmlHttpRequest.send(null);
}

function showstus() {
//	alert("showstus");
	if (xmlHttpRequest.readyState == 4) { // 判断对象状态
		if (xmlHttpRequest.status == 200) {
			var stus = eval("(" + xmlHttpRequest.responseText + ")");
			var obj = document.getElementById("msg");
			for (var i=0;i<stus.length;i++) {
//				alert(stus[i].username + ":" + stus[i].age);
				obj.innerHTML += stus[i].username + stus[i].age + "<br>";
			}
		}
	}
}

</script>
</head>
<body>
	<div id="msg"></div>
	<input type="button" value="testJSON" onclick="showusers()" />
</body>
</html>