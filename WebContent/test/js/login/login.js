/**
 * 
 */

	function logins(form){
	
	$.post(form.action,/* 提交地址 */
			{username:form.username.value,password:form.password.value},/* 需要传递到后台参数 */
			function(data){alert(data);}/* 返回后处理工作，data为后台返回的数据 */ );
	}
