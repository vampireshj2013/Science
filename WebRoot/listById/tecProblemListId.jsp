<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>技术难题</title>
<link rel="stylesheet" type="text/css" href="./css/styles.css">
</head>
<body>
<%@ include file="../index.jsp"%>
	<table id="listId">
		<thead>
			<tr>
				<td>ID</td>
				<td><s:property value="tecProblem.tecProblemId" /></td>
			</tr>
			<tr>
				<td>标题</td>
				<td><s:property value="tecProblem.head" /></td>
			</tr>
			<tr>
				<td>行业分类</td>
				<td><s:property value="tecProblem.industry" /></td>
			</tr>
			
			<tr>
				<td>预投入资金</td>
				<td><s:property value="tecProblem.expectMoney" /></td>
			</tr>
			<tr>
				<td>截止日期</td>
				<td><s:property value="tecProblem.endTime" /></td>
			</tr>
			<tr>
				<td>关键词</td>
				<td><s:property value="tecProblem.searchKey" /></td>
			</tr>
			<tr>
				<td>难题详情</td>
				<td><s:property value="tecProblem.descri" /></td>
			</tr>
	     </thead>	
		 </table>
		 
		<s:url id="pageAction" includeContext="false" action="tecProblemAction_listId" namespace="/" >
		</s:url>
</body>
</html>