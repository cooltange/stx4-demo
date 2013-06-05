/*
 * 用户登录的验证规则及处理方法
 * 
 * 具体用法参考在线文档
 * http://rickharrison.github.com/validate.js/
 * 
 * author getan
 */
var validator = new FormValidator('loginForm', 
	[ 
		{
			name : 'loginName',
			display : '登录名',
			rules : 'required'},// 非空
		{
			name : 'password',
			display : '密码',
			rules : 'required'}// 非空
	], 
	function(errors, events) {
	if (errors.length > 0) {
		// 验证错误信息字符串
		var errorString = '';
		// 通过"验证规则"拼接errorString(错误信息字符串)
        for (var i = 0, errorLength = errors.length; i < errorLength; i++) {
            errorString += errors[i].message + '<br />';
        }
        // 将错误信息字符串显示在页面对应的div中(msgs对应页面的<div id='msgs'></div>)
        msgs.innerHTML = errorString;
        
        // 改变验证消息的样式(用红色的错误警告样式)
        msgs.className = "alert alert-error";
        
        // 隐藏jsp部分的提示信息(<div id='messages' class="alert alert-error"><%=request.getAttribute("messages")%></div>)
        messages.className = 'hide';
	}
	});