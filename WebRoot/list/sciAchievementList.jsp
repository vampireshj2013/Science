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
    font-size: 13px;}
    </style>
</head>
<body>
<%@ include file="../head.jsp"%>
	<div class="container" style="width:1000px;position:absolute;top:130px;left:175px">
		<table class="table table-hover" >
		<thead>
			<tr>
				<td>ID</td>
				<td>标题</td>
				<td>所属行业</td>
				<td>合作方式</td>
				<td>技术成熟度</td>
				<td>技术水平</td>
				<td>是否国际技术</td>
				<td>预期投资额</td>
				<td>关键词</td>
				<td>成果介绍</td>
			</tr>
		</thead>
		<s:iterator value="#result" var="sci">
			<tr>
					<td>
					<a href="sciAction_listById?id=<s:property value="#sci.sciAchievementId" />">
					<s:property value="#sci.sciAchievementId" />
					</a></td>
					<td><s:property value="#sci.head" /></td>
					<td><s:property value="#sci.industry" /></td>
					<td><s:property value="#sci.cooperation.cooperationDesc" /></td>
					<td><s:property value="#sci.maturity.maturityDesc" /></td>
					<td><s:property value="#sci.tecLevel" /></td>
					<td><s:property value="#sci.interTec" /></td>
					<td><s:property value="#sci.expectMoney" /></td>
					<td><s:property value="#sci.searchKey" /></td>
					<td><s:property value="#sci.descri" /></td>
			</tr>
		</s:iterator>
		</table>
		</div>
		<div class="container" style="width:1000px;position:absolute;top:520px;left:175px">
		<s:url id="pageAction" includeContext="false" action="sciAction_list" namespace="/">
		</s:url>
	
	    <s:include value="/pageUtil.jsp"></s:include>
	    </div>
</body>
</html>