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
		<style>
			.container {
				border: 1px solid black;
			}
			
			.container-fluid {
				border: 1px solid blue;
			}
		</style>

</head>
<body>

		<div class="login"><br />
			<img src="../img/logo.png" />
			<form action="#" method="post">
				<div>
					<input type="text" id="username" name="uName" value="田银龙" placeholder="用户名">
				</div>
				<div>
					<input type="password" id="password" name="uPwd" value="123" placeholder="密码">
				</div>
				<div>
					<input type="submit" value="登录">
				</div>
			</form>
		</div>

	</body>
</html>