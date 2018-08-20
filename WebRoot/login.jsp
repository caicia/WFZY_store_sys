<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>


<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>SCT-后台系统</title>
<link href="style/authority/login_css.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="scripts/jquery/jquery-1.7.1.js"></script>
<script type="text/javascript">
	$(document).ready(function(){
		$("#login_sub").click(function(){
			$("#submitForm").attr("action", "index.html").submit();
		});
	});
	
	/*回车事件*/
	function EnterPress(e){ //传入 event 
		var e = e || window.event; 
		if(e.keyCode == 13){ 
			$("#submitForm").attr("action", "index.html").submit();
		} 
	} 
</script>
</head>
<body>
	<div id="login_center">
		<div id="login_area">
			<div id="login_box">
				<div id="login_form">
					<form id="submitForm" action="" method="post">
						<div id="login_tip">
							<span id="login_err" class="sty_txt2"></span>
						</div>
						<div>
							 用户名：<input type="text" name="userEntity.userCode" class="username" id="name">
						</div>
						<div>
							密&nbsp;&nbsp;&nbsp;&nbsp;码：<input type="password" name="userEntity.password" class="pwd" id="pwd" onkeypress="EnterPress(event)" onkeydown="EnterPress()">
						</div>
						<div id="btn_area">
							<input type="button" class="login_btn" id="login_sub"  value="登  录">
							<input type="reset" class="login_btn" id="login_ret" value="重 置">
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
<script type="text/javascript">
$('#islogin').click(function() {
    
	var loginName = document.getElementById("name").value;
	var loginPwd = document.getElementById("pwd").value;
	if(loginName==null || loginPwd==null){
		alert("账号密码不能为空");
	}else{
	$.ajax({				   
			url : '${pageContext.request.contextPath }/pc/user/userLogin.action',
			contentType:'application/x-www-form-urlencoded',
			type : "POST",
			data:{
				"loginName":loginName,
				"loginPwd":loginPwd
			},
			dataType : "json",
			async : false,
			success : function(data) {
				if(data.flag){
					alert("登录成功");
					window.location='${pageContext.request.contextPath }/pc/user/allSelectUser.action';
				}
				else{
					alert("登录失败,账号/密码错误");
					window.location='${pageContext.request.contextPath }/login.jsp';
				}
			},
		   error : function() {
					alert("数据错误");
					},
		})
}
})
</script>
</body>
</html>