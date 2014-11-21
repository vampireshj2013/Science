<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html lang="zh-cn">
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">
		<script src="bootstrap/js/bootstrap.js"></script>
	</head>
	<body>
		<%@ include file="head.jsp"%>
		<div class="container"
			style="width: 1000px; position: absolute; top: 80px; left: 175px">
			<div class="navbar navbar-default navbar-static-top">
				<div class="navbar-inner">
					<ul class="nav nav-pills nav-justified">
						<li>
							<a href="index.jsp">首页面</a>
						</li>
						<li>
							<a href="sciAction_list">科技成果</a>
						</li>
						<li>
							<a href="patentTranAction_list">专利转让</a>
						</li>
						<li>
							<a href="patentBuyAction_list">专利求购</a>
						</li>
						<li>
							<a href="tecExpertAction_list">技术专家</a>
						</li>
						<li>
							<a href="tecProblemAction_list">技术难题</a>
						</li>
						<li>
							<a href="proInvestAction_list">项目投资</a>
						</li>
						<li>
							<a href="proFinanceAction_list">项目融资</a>
						</li>
						<li>
							<a href="#">技术网店</a>
						</li>
						<li>
							<a href="#">技术论坛</a>
						</li>
					</ul>
				</div>
			</div>

			<!-- 首页轮换图片 -->
			<div id="image-trun" class="carousel slide" data-ride="carousel">
				<!-- Indicators -->
				<ol class="carousel-indicators">
					<li data-target="#image-trun" data-slide-to="0" class="active"></li>
					<li data-target="#image-trun" data-slide-to="1"></li>
					<li data-target="#image-trun" data-slide-to="2"></li>
				</ol>
				<!-- Wrapper for slides -->
				<div class="carousel-inner" role="listbox">
					<div class="item active">
						<img src="bootstrap/img/1.jpg">

					</div>
					<div class="item">
						<img src="bootstrap/img/2.jpg">

					</div>
					<div class="item">
						<img src="bootstrap/img/3.jpg">

					</div>
				</div>
				<!-- Controls -->
				<a class="left carousel-control" href="#image-trun" role="button"
					data-slide="prev"> <span
					class="glyphicon glyphicon-chevron-left"></span> <span
					class="sr-only">p</span> </a>
				<a class="right carousel-control" href="#image-trun" role="button"
					data-slide="next"> <span
					class="glyphicon glyphicon-chevron-right"></span> <span
					class="sr-only">n</span> </a>
			</div>
			<!-- 轮换图片 -->

		</div>
	</body>
</html>
