<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>技术难题</title>
<link rel="stylesheet" type="text/css" href="./css/styles.css">
</head>
<body>

<%@ include file="../index.jsp"%>
		<table id="list">
		<thead>
			<tr>
				<td>ID</td>
				<td>标题</td>
				<td>行业分类</td>
				<td>预投入资金</td>
				<td>截止日期</td>
				<td>关键字</td>
				<td>难题详情</td>
			</tr>
		</thead>
		<s:iterator value="#result" var="tecProblem">
			<tr>
					<td>
						<a href="tecProblemAction_listById?id=<s:property value="#tecProblem.tecProblemId" />">
						<s:property value="#tecProblem.tecProblemId" />
						</a></td>
					<td><s:property value="#tecProblem.head" /></td>
					<td><s:property value="#tecProblem.industry" /></td>
					<td><s:property value="#tecProblem.expectMoney" /></td>
					<td><s:property value="#tecProblem.endTime" /></td>
					<td><s:property value="#tecProblem.searchKey" /></td>
					<td><s:property value="#tecProblem.descri" /></td>
			</tr>
		</s:iterator>
		</table>
		<s:url id="pageAction" includeContext="false" action="tecProblemAction_list" namespace="/">
		</s:url>
	    <s:include value="/pageUtil.jsp"></s:include>
</body>
</html>