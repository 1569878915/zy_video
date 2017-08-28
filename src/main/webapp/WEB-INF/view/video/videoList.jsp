<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="tyl" uri="http://zhiyou100.com/common/"%>
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
<script type="text/javascript">
function selectAll(theCheck){
	alert(theCheck.checked); 
	var arr=document.getElementsByName("rowCheck");
	for( var i=0;i<arr.length;i++){
		arr[i].checked=theCheck.checked;
	}
}
</script>
<style>
.jumbotron {
	margin-left: 150px;
	margin-right: 150px;
	padding-top: 10px;
	padding-bottom: 10px;
}

form {
	display: inline-block;
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
<!-- course -->
					<li><a href="#">视频管理</a></li>
					<li><a href="${pageContext.request.contextPath }/speaker/speakerList.action">主讲人管理</a></li>
					<li><a href="${pageContext.request.contextPath }/course/courseList.action">课程管理</a></li>
					<li><a href="#">统计分析</a></li>
					<li><a href="#"><li>admin <span
								class="glyphicon glyphicon-log-out" aria-hidden="true"></span> <span
								class="glyphicon-class"></span>
						</li></a></li>
				</ul>
			</div>
		</div>
	</nav>

	<div class="jumbotron">
		<h2>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;视频列表-视频管理</h2>
	</div>
	<div style="margin-left: 150px;">
		<a class="btn btn-primary" href="${pageContext.request.contextPath }/video/addVideo.action">添加视频</a> 
		<!-- <td><a href="<c:url value="/video/updateVideo.action?id=" />${Video.id}"><span class="glyphicon glyphicon-edit"
								aria-hidden="blue"></span></a> -->
		<%-- 						
		<from id="id" 
		action="${pageContext.request.contextPath }/video/batchDeleteVideo.action">
		<button class="btn btn-primary" type="button" >
				批量删除 <span class="badge">${Video.id}</span>
			</button>
		</from>			 --%>			
								
								
								
								
		<a href="${pageContext.request.contextPath }/video/batchDeleteVideo.action">
			<button class="btn btn-primary" type="button" >
				批量删除 <span class="badge">4 </span>
			</button>
		</a>
		<form id="searchForm"
			action="${pageContext.request.contextPath }/video/videoList.action"
			method="post">
			<div style="margin-left: 300px;">
				<input type="text" name="videoTitleKeyWord" value="${videoTitleKeyWord }"
					placeholder="视频标题"> 
					<select name="speakerSearchField">
					<option>请选择主讲人</option>
					<c:forEach var="speaker" items="${speaker}" varStatus="status">
						<option value="${speaker.id}">${speaker.speakerName }</option>
					</c:forEach>
				</select> <select name="courseSearchField">
					<option>请选择课程</option>
					<c:forEach var="course" items="${course}" varStatus="status">
      		        <option value="${course.id }">${course.courseName }</option>
					</c:forEach>
				</select> 
				<input type="submit" class="btn btn-primary" value="查询">
			</div>


		</form>
		<div class="bs-example" data-example-id="table-within-panel"></div>
		<table class="table"
			style="margin-left: 30px; margin-right: 30px; width: 1200px;">
			<thead>
				<tr>
					<th><input type="checkbox"onclick="selectAll(this)"></th>
					<th>序号</th>
					<th>名称</th>
					<th>介绍</th>
					<th>讲师</th>
					<th>课程</th>
					<th>时长(秒)</th>
					<th>播放次数</th>
					<th>编辑</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="Video" items="${page.rows}" varStatus="status">
				<!-- value="${Video.id }"-->
					<tr>
						<td><input type="checkbox" name="rowCheck" id="${Video.id}"></td>
						<td scope="row">${status.count+(page.page-1)*5 }</td>
						<td>${Video.videoTitle }</td>
						<td>${Video.videoDescr }</td>
						<td>${Video.sp.speakerName }</td>
						<td>${Video.cs.courseName }</td>
						<td>${Video.videoLength }</td>
						<td>${Video.videoPlayTimes }</td>
						<td><a href="<c:url value="/video/updateVideo.action?id=" />${Video.id}"><span class="glyphicon glyphicon-edit"
								aria-hidden="blue"></span></a>
								 &nbsp; <a onclick="return confirm('确定将此记录删除?')" href="<c:url value="/video/deleteVideo.action?id=" />${Video.id}"><span
								class="glyphicon glyphicon-trash" aria-hidden="blue"></span></a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<tyl:page
			url="${pageContext.request.contextPath }/video/videoList.action"></tyl:page>
	</div>

</body>


</body>
</html>