<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html >
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>智游管理系统</title>

<link href="${pageContext.request.contextPath }/css/bootstrap.min.css"
	rel="stylesheet">

<script
	src="${pageContext.request.contextPath }/js/jquery-1.12.4.min.js"></script>
<script src="${pageContext.request.contextPath }/js/bootstrap.min.js"></script>
<style>
.jumbotron {
	margin-left: 150px;
	margin-right: 150px;
	padding-top: 10px;
	padding-bottom: 10px;
}
</style>
</head>

<body>
		<nav class="navbar navbar-inverse">
			<div class="container-fluid" style="margin-left: 150px;">
				<div class="navbar-header">
					<a class="navbar-brand" href="#">视频管理系统</a>
				</div>
				<div class="collapse navbar-collapse">

					<ul class="nav navbar-nav">
						<li>
							<a href="#">视频管理</a>
						</li>
						<li>
							<a href="#">主讲人管理</a>
						</li>
						<li>
							<a href="#">课程管理</a>
						</li>
						<li>
							<a href="#">统计分析</a>
						</li>
						<li>
						<a href="#"> 
						<li> admin
							<span class="glyphicon glyphicon-log-out" aria-hidden="true"></span>
							<span class="glyphicon-class"></span>
					</li></a>
					</li>
					</ul>
				</div>
			</div>
		</nav>
		
		
		
		
		
		<div class="jumbotron">
			<h2>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;添加主讲人-主讲人管理</h2>
		</div>
		
	
	
	
	<form class="form-horizontal" action="${pageContext.request.contextPath }/speaker/addSpeaker.action"
			method="post">
		<div class="form-group">
			<label for="inputEmail3" class="col-md-3 control-label">名字</label>
			<div class="col-md-8">
				<input type="text" class="form-control" name="speakerName" placeholder="">
			</div>
		</div>
		<div class="form-group">
			<label  class="col-md-3 control-label">职业</label>
			<div class="col-md-8">
				<input type="text" class="form-control" name="speakerJob" placeholder="">
			</div>
		</div>
		<div class="form-group">
			<label  class="col-md-3 control-label">头像图片</label>
			<div class="col-md-8">
				<input type="text" class="form-control" name="speakerHeadUrl" placeholder="">
			</div>
			</div>
		<div class="form-group">
			<label  class="col-md-3 control-label">简介</label>
			<div class="col-md-8">
				<textarea class="p100" name="speakerDescr" placeholder="请填写部门描述" style="width: 1000px; height: 100px;"></textarea>
			</div>
	
		<div class="form-group">
			<label  class="col-md-4 control-label">
				<input class="btn btn-primary va-bottom" type="submit" value="保存">&nbsp;&nbsp;
				<a class="btn btn-default" href="javascript:history.go(-1)">返回列表</a>
			</label>
			</div>
		</div>
		
	</form>
	
	</body>

</html>