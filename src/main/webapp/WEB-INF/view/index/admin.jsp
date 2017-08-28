<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html >
<html>
<head>
<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<title>登录界面</title>
		<!-- Bootstrap -->
		<link rel="stylesheet" href="${pageContext.request.contextPath }/css/index.css">
		<!-- <link href="../css/index.css" rel="stylesheet"> -->
		<script src="${pageContext.request.contextPath }/js/jquery-1.12.4.min.js"></script>
		<script src="${pageContext.request.contextPath }/js/bootstrap.min.js"></script>
		<script  src="${pageContext.request.contextPath }/js/jquery.validate.min.js"></script>
        <script  src="${pageContext.request.contextPath }/js/messages_zh.min.js"></script>
	
<script type="text/javascript">
	$(function() {
		$("#checkFrom").validate({
			rules : {
				username : {
					required : true,
					minlength : 2
				},
				password : {
					required : true
				},
				rpassword : {
					required : true,
					//选择器
					equalTo : "input[name=password]"
				}
			},
			messages : {
				username : {
					required : "用户名不能为空",
					minlength : "长度太小"
				},

				password : {
					required : "请输入密码"
				},

				rpassword : {
					required : "请确认密码",
					equalTo : "密码必须一致"
				}
			}

		});
	});
</script>
</head>
<body>
<!--  <form action="#" method="post" id="checkFrom">
		用户名<input type="text" name="user"><span></span><br> 密码<input
			type="text" name="pwd"><br> 确认密码<input type="text"
			name="rpwd"><br> <input type="submit">
	</form>-->
		<div class="login"><br />
			<img src="${pageContext.request.contextPath }/img/logo.png" />
			<form action="${pageContext.request.contextPath }/index/index.action" method="post" id="checkFrom" >
				<div>
					<input type="text"  name="username" value="admin" placeholder="用户名">
				</div>
				<div>
					<input type="password"  name="password" value="admin" placeholder="密码">
				</div>
				<div>
					<input type="password"  name="rpassword"  placeholder="请重新输入密码">
				</div>
				<div>
					<input type="submit" value="登录">
				</div>
			</form>
		</div>

	</body>
</html>