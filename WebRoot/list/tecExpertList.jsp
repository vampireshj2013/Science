<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>技术专家</title>
<link rel="stylesheet" type="text/css" href="./css/styles.css">
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" />
<style type="text/css">
    body{
    font-family: "Helvetica Neue",Helvetica,Arial,sans-serif;
    font-size: 13px;}
    </style>
</head>
<body>

<%@ include file="../index.jsp"%>
	<div class="container" style="width:1000px;position:absolute;top:130px;left:175px">
		<table class="table table-hover" >
		<thead>
			<tr>
				<td>ID</td>
				<td>标题</td>
				<td>性别</td>
				<td>研究领域</td>
				<td>所属机构</td>
				<td>技术专长</td>
				<td>职称</td>
				<td>职务</td>			
				<td>学历</td>
				<td>关键字</td>
				<td>专家介绍</td>
			</tr>
		</thead>
		<s:iterator value="#result" var="tecExpert">
			<tr>
					<td>
					<a href="tecExpertAction_listById?id=<s:property value="#tecExpert.tecExpertId" />">
					<s:property value="#tecExpert.tecExpertId" />
					</a></td>
					<td><s:property value="#tecExpert.head" /></td>
					<td><s:property value="#tecExpert.sex" /></td>
					<td><s:property value="#tecExpert.industry" /></td>
					<td><s:property value="#tecExpert.institution" /></td>
					<td><s:property value="#tecExpert.major" /></td>
					<td><s:property value="#tecExpert.title" /></td>
					<td><s:property value="#tecExpert.duty" /></td>
					
					<td><s:property value="#tecExpert.education" /></td>
					<td><s:property value="#tecExpert.searchKey" /></td>
					<td><s:property value="#tecExpert.descri" /></td>
			</tr>
		</s:iterator>
		</table>
		</div>
		<div class="container" style="width:1000px;position:absolute;top:520px;left:175px">
		<s:url id="pageAction" includeContext="false" action="tecExpertAction_list" namespace="/">
		</s:url>
	    <s:include value="/pageUtil.jsp"></s:include>
	    </div>
</body>
</html>