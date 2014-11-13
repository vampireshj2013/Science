<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>项目投资</title>
<link rel="stylesheet" type="text/css" href="./css/styles.css">
</head>
<body>
<%@ include file="../index.jsp"%>
	<table id="listId">
		<thead>
			<tr>
				<td>ID</td>
				<td><s:property value="proInvest.proInvestId" /></td>
			</tr>
			<tr>
				<td>标题</td>
				<td><s:property value="proInvest.head" /></td>
			</tr>
			<tr>
				<td>投资领域</td>
				<td><s:property value="proInvest.industry" /></td>
			</tr>
			<tr>
				<td>投资区域</td>
				<td><s:property value="proInvest.city" /></td>
			</tr>
			<tr>
				<td>投资方式</td>
				<td><s:property value="proInvest.investDesc" /></td>
			</tr>
			<tr>
				<td>投资额度</td>
				<td><s:property value="proInvest.investMoney" /></td>
			</tr>
			<tr>
				<td>截止日期</td>
				<td><s:property value="proInvest.endTime" /></td>
			</tr>
			<tr>
				<td>关键词</td>
				<td><s:property value="proInvest.searchKey" /></td>
			</tr>
			<tr>
				<td>投资要求</td>
				<td><s:property value="proInvest.descri" /></td>
			</tr>
	     </thead>	
		 </table>
		 
		<s:url id="pageAction" includeContext="false" action="proInvestAction_listId" namespace="/" >
		</s:url>
</body>
</html>