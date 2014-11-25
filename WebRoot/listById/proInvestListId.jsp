<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>项目投资</title>
<link rel="stylesheet" type="text/css" href="./css/styles.css"/>
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" />
<style type="text/css">
    body{
    font-family: "Helvetica Neue",Helvetica,Arial,sans-serif;
    font-size: 13px;
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
<%@ include file="../head.jsp"%>
	<div class="container" style="width:800px;position:absolute;top:130px;left:250px;">

	<div id="left" >
		<img id="detail" class="thumbnail" src="./image/2.png" /> 
	</div>
	<div id="right">
	<ul>
				<li>ID:&nbsp;&nbsp;<s:property value="proInvest.proInvestId" /></li>
				<li>标题:&nbsp;&nbsp;<s:property value="proInvest.head" /></li>
				<li>投资领域:&nbsp;&nbsp;<s:property value="proInvest.industry" /></li>
				<li>投资区域:&nbsp;&nbsp;<s:property value="proInvest.city" /></li>
				<li>投资方式:&nbsp;&nbsp;<s:property value="proInvest.invest.investDesc" /></li>
				<li>投资额度:&nbsp;&nbsp;<s:property value="proInvest.investMoney" /></li>
				<li>截止日期:&nbsp;&nbsp;<s:property value="proInvest.endTime" /></li>
				<li>关键词:&nbsp;&nbsp;<s:property value="proInvest.searchKey" /></li>
				<li>投资要求:&nbsp;&nbsp;<s:property value="proInvest.descri" /></li>
				   </ul>
	 </div>
	 </div>
		<s:url id="pageAction" includeContext="false" action="proInvestAction_listId" namespace="/" >
		</s:url>
</body>
</html>