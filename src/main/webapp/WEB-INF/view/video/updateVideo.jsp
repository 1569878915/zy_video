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
</head>
<body>
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
						<li > admin
							<span class="glyphicon glyphicon-log-out" aria-hidden="true"></span>
							<span class="glyphicon-class"></span>
					</li></a>
					</li>
					</ul>
				</div>
			</div>
		</nav>
		
			<div class="jumbotron">
			<h2>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;添加视频信息-视频管理</h2>
		</div>
			<h3>&nbsp;&nbsp;&nbsp;&nbsp;修改用户</h3>
	<%-- <form  action="${pageContext.request.contextPath}/video/addVideo.action"
		method="post"> --%>
			<form class="form-horizontal" action="${pageContext.request.contextPath }/video/updateVideo.action"
			method="post">
				<div class="form-group">
					<label for="inputEmail3" class="col-md-3 control-label">视频标题</label>
					<div class="col-md-8">
						<input type="text" class="form-control" value="${ video.videoTitle}" name="videoTitle" placeholder="视频标题">
					</div>
				</div>
				<div class="form-group">
					<label class="col-md-3 control-label">主讲人</label>
					<div class="col-md-8">
				    <select name="speakerId" style="width: 650px; height: 40px;">
							<option>请选择主讲人</option><!-- ${ departmentList.d_id==user.u_departmentid?"selected":""} -->
					<c:forEach var="speaker" items="${speaker}" varStatus="status">
						<option value="${speaker.id}" ${speaker.id==video.speakerId?"selected":"" }>${speaker.speakerName }</option>
					</c:forEach>
					</select>	
					</div>
				</div>
				<div class="form-group">
					<label class="col-md-3 control-label">所属课程</label>
					<div class="col-md-8">
					<select name="courseId" style="width: 650px; height: 40px;">
						<option>请选择课程</option>
						<c:forEach var="course" items="${course}" varStatus="status">
                 	<option value="${course.id }"${course.id==video.courseId?"selected":"" }>${course.courseName }</option>
					</c:forEach>
					</select>		
					</div>	
			    </div>
			    <div class="form-group">
					<label class="col-md-3 control-label">视频时长</label>
					<div class="col-md-8">
						<input type="text" class="form-control" value="${video.videoLength}" name="videoLength" placeholder="视频时长">
					</div>	
			   </div>
			   
			    <div class="form-group">
					<label class="col-md-3 control-label">封面图片</label>
					<div class="col-md-8">
						<input type="text" class="form-control" value="${video.videoImageUrl}" name="videoImageUrl" placeholder="封面图片 ">
					</div>	
			   </div>
			   <div class="form-group">
					<label class="col-md-3 control-label">视频播放地址</label>
					<div class="col-md-8">
						<input type="text" class="form-control" value="${video.videoUrl}" name="videoUrl" placeholder="封面图片 ">
					</div>	
			   </div>
		        <div class="form-group ">
			        <label  class="col-md-3 control-label ">视频简介</label>
			        <div class="col-md-8 ">
				    <textarea class="p100 "  name="videoDescr"  placeholder="视频简介 " style="width: 1000px; height: 100px; ">${video.videoDescr }</textarea>
				    </div>
			    </div>
	
		<div class="form-group " style="margin-left: 160px;">
		<input type="hidden" name="id" value="${video.id }">
				<input class="btn btn-primary va-bottom " type="submit" value="保存 ">&nbsp;&nbsp;
				<a class="btn btn-default " href="javascript:history.go(-1) ">返回列表</a>
			</div>
		
		
	</form>
			</body>

</html>