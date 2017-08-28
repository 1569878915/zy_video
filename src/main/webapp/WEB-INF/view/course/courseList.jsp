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

					<li><a href="#">视频管理</a></li>
					<li><a href="#">主讲人管理</a></li>
					<li><a href="#">课程管理</a></li>
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
		<h2>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;课程列表-课程管理</h2>
	</div>
	<div style="margin-left: 150px;">
		<a class="btn btn-primary"
			href="${pageContext.request.contextPath }/speaker/addCourse.action">添加课程</a>


		<div class="bs-example" data-example-id="table-within-panel"></div>
		<table class="table"
			style="margin-left: 30px; margin-right: 30px; width: 1200px;">
			<thead>
				<tr>
					<th>序号</th>
					<th>标题</th>
					<th>学科</th>
					<th>简介</th>
					<th>编辑</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="course" items="${cours}" varStatus="status">
					<tr>
						<td scope="row">${status.count }</td>
						<td>${course.sb.subjectName }</td> 
				        <td>${course.courseName }</td>
						<td>${course.courseDescr }</td>
						
						<td><a
							href="<c:url value="/speaker/updateCourse.action?id=" />${course.id}"><span
								class="glyphicon glyphicon-edit" aria-hidden="blue"></span></a>
							&nbsp; <a onclick="return confirm('确定将此记录删除?')"
							href="<c:url value="/speaker/deleteCourse.action?id=" />${course.id}"><span
								class="glyphicon glyphicon-trash" aria-hidden="blue"></span></a></td>
					</tr>
				</c:forEach>
				
			</tbody>
		</table>
		<tyl:page
			url="${pageContext.request.contextPath }/speaker/speakerList.action"></tyl:page>
	</div>




</body>
</html>