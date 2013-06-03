/*
 * 新增学生信息的验证规则及处理方法
 * 
 * 具体用法参考在线文档
 * http://rickharrison.github.com/validate.js/
 * 
 * author getan
 */
var validator = new FormValidator('studentForm', 
	[ 
		{
			name : 'sno',
			display : '学号',
			rules : 'required'},// 非空
		{
			name : 'sname',
			display : '姓名',
			rules : 'required|min_length[2]'},// 非空及至少2位字符
		{
			name : 'sage',
			display : '年龄',
			rules : 'required|integer'},// 非空及整数
		{
			name : 'ssex',
			display : '性别',
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
	}
	});