<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>科技成果</title>
<link rel="stylesheet" type="text/css" href="./css/styles.css">
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" />
<style type="text/css">
    body{
    font-family: "Helvetica Neue",Helvetica,Arial,sans-serif;
    font-size: 13px;
    }
   .table
  {
  font-family:"Trebuchet MS", Arial, Helvetica, sans-serif;
  width:60%;
  margin:0 auto; 
  border:0px ;
  border-collapse:collapse;
  }

.table td,.table th 
  {
  font-size:1em;
  border:none;
  padding:3px 7px 2px 7px;
  }

.table th 
  {
  font-size:1.1em;
  text-align:left;
  padding-top:5px;
  padding-bottom:4px;
  background-color:#A7C942;
  color:#ffffff;
  }

.table tr.alt td 
  {
  color:#000000;
  background-color:#EAF2D3;
  }
    #left{padding:50px;}
	#right{padding:50px;width:640px}
	#left{float:left}
	#right ul li{list-style-type: none;font-family: "微软雅黑";font-size:16px;line-height: 30px}
	#detail{
	width:300px;
	height:300px
	}
  </style>
</head>
<body>
<%@ include file="../index.jsp"%>
<div class="container" style="width:800px;position:absolute;top:130px;left:250px;">

	<div id="left" >
		<img id="detail" class="thumbnail" src="../image/2.png" /> 
	</div>
	<div id="right">
	<ul>
			<li>ID:&nbsp;&nbsp;<s:property value="sciAchievement.sciAchievementId" /></li>
			<li>标题:&nbsp;&nbsp;<s:property value="sciAchievement.head" /></li>
			<li>所属行业:&nbsp;&nbsp;<s:property value="sciAchievement.industry" /></li>
			<li>合作方式:&nbsp;&nbsp;<s:property value="sciAchievement.cooperation.cooperationDesc" /></li>
			<li>技术成熟度:&nbsp;&nbsp;<s:property value="sciAchievement.maturity.maturityDesc" /></li>
			<li>技术水平:&nbsp;&nbsp;<s:property value="sciAchievement.tecLevel" /></li>
			<li>是否国际技术:&nbsp;&nbsp;<s:property value="sciAchievement.interTec" /></li>
			<li>预期投资额:&nbsp;&nbsp;<s:property value="sciAchievement.expectMoney" /></li>
			<li>关键词:&nbsp;&nbsp;<s:property value="sciAchievement.searchKey" /></li>
			<li>求购详情:&nbsp;&nbsp;<s:property value="sciAchievement.descri" /></li>
		</ul>
	 </div>
	 </div>
		<s:url id="pageAction" includeContext="false" action="sciAction_listId" namespace="/" >
		</s:url>
</body>
</html>