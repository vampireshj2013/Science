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
<style>
#daohanglan {
	border-left: none;
	border-right: : none;
	width: 900px;
	height: 80px;
	padding: 25px;
}

.btn-group {
	margin: 10px 50px;
}
</style>

</head>
<body>
	<%@ include file="head.jsp"%>
	
	
<div class="Container"
			style="width: 1000px; position: absolute; top: 120px; left: 175px">
		
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
			<a class="left carousel-control" href="#image-trun" role="button" data-slide="prev">
				 <span class="glyphicon glyphicon-chevron-left"></span> 
				 <span class="sr-only">p</span>
			</a> 
			<a class="right carousel-control" href="#image-trun" role="button" data-slide="next">
				 <span class="glyphicon glyphicon-chevron-right"></span>
				 <span class="sr-only">n</span>
			</a>
		</div>

		<!-- 导航栏 -->
		<div id="daohanglan">
			<p>
				<img src="bootstrap/img/shenghuo.png">
			</p>
			<div class="btn-group">
				<button class="btn" contenteditable="true">农产品加工：</button>
				<button class="btn dropdown-toggle" data-toggle="dropdown">
					<span class="caret"></span>
				</button>
				<ul class="dropdown-menu" contenteditable="true">
					<li><a href="#">工艺与机械</a></li>
					<li><a href="#">果蔬加工</a></li>
					<li><a href="#">粮食作物加工</a></li>
					<li><a href="#">经济作物加工</a></li>
					<li><a href="#">水产品加工</a></li>
					<li><a href="#">畜牧产品加工</a></li>
					<li><a href="#">农产品加工</a></li>
					<li><a href="#">其他</a></li>
				</ul>
			</div>
			<div class="btn-group">
				<button class="btn" contenteditable="true">种 植 业：</button>
				<button class="btn dropdown-toggle" data-toggle="dropdown">
					<span class="caret"></span>
				</button>
				<ul class="dropdown-menu" contenteditable="true">
					<li><a href="#">粮食作物</a></li>
					<li><a href="#">经济作物</a></li>
					<li><a href="#">种植机具</a></li>
					<li><a href="#">花草园艺</a></li>
					<li><a href="#">果木种植</a></li>
					<li><a href="#">蔬菜作物</a></li>
					<li><a href="#">饲料作物</a></li>
					<li><a href="#">其他</a></li>
				</ul>
			</div>
			<div class="btn-group">
				<button class="btn" contenteditable="true">养 殖 业：</button>
				<button class="btn dropdown-toggle" data-toggle="dropdown">
					<span class="caret"></span>
				</button>
				<ul class="dropdown-menu" contenteditable="true">
					<li><a href="#">禽类</a></li>
					<li><a href="#">畜类</a></li>
					<li><a href="#">特种养殖</a></li>
					<li><a href="#">饲料、添加剂</a></li>
					<li><a href="#">水产品</a></li>
					<li><a href="#">养殖机具</a></li>
					<li><a href="#">其他</a></li>
				</ul>
			</div>
		</div>

		<div id="daohanglan">
			<p>
				<img src="bootstrap/img/shengchan.png">
			</p>
			<div class="btn-group">
				<button class="btn" contenteditable="true">新 材 料：</button>
				<button class="btn dropdown-toggle" data-toggle="dropdown">
					<span class="caret"></span>
				</button>
				<ul class="dropdown-menu" contenteditable="true">
					<li><a href="#">有机材料</a></li>
					<li><a href="#">生物质材料</a></li>
					<li><a href="#">有机合成材料</a></li>
					<li><a href="#">无机非金属/a></li>
					<li><a href="#">金属合成材料</a></li>
					<li><a href="#">稀土材料</a></li>
					<li><a href="#">纳米及超细材料</a></li>
					<li><a href="#">其他</a></li>
				</ul>
			</div>
			<div class="btn-group">
				<button class="btn" contenteditable="true">自 动 化：</button>
				<button class="btn dropdown-toggle" data-toggle="dropdown">
					<span class="caret"></span>
				</button>
				<ul class="dropdown-menu" contenteditable="true">
					<li><a href="#">控制系统</a></li>
					<li><a href="#">自动化技术应用</a></li>
					<li><a href="#">自动化元件</a></li>
					<li><a href="#">人工智能</a></li>
					<li><a href="#">其他</a></li>
				</ul>
			</div>
			<div class="btn-group">
				<button class="btn" contenteditable="true">生物 科技：</button>
				<button class="btn dropdown-toggle" data-toggle="dropdown">
					<span class="caret"></span>
				</button>
				<ul class="dropdown-menu" contenteditable="true">
					<li><a href="#">基因工程</a></li>
					<li><a href="#">细胞工程</a></li>
					<li><a href="#">酶工程</a></li>
					<li><a href="#">发酵工程</a></li>
					<li><a href="#">超微技术</a></li>
					<li><a href="#">微生物</a></li>
					<li><a href="#">其他</a></li>
				</ul>
			</div>
		</div>
	</div>


</body>
</html>
