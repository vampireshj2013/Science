<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>项目融资</title>
<link rel="stylesheet" type="text/css" href="./css/styles.css">
</head>
<body>
<%@ include file="../index.jsp"%>
	<table id="listId">
		<thead>
			<tr>
				<td>ID</td>
				<td><s:property value="proFinance.proFinanceId" /></td>
			</tr>
			<tr>
				<td>标题</td>
				<td><s:property value="proFinance.head" /></td>
			</tr>
			<tr>
				<td>融资领域</td>
				<td><s:property value="proFinance.industry" /></td>
			</tr>
			<tr>
				<td>融资方式</td>
				<td><s:property value="proFinance.financeDesc" /></td>
			</tr>
			<tr>
				<td>融资额度</td>
				<td><s:property value="proFinance.financeMoney" /></td>
			</tr>
			<tr>
				<td>截止日期</td>
				<td><s:property value="proFinance.endTime" /></td>
			</tr>
			<tr>
				<td>关键词</td>
				<td><s:property value="proFinance.searchKey" /></td>
			</tr>
			<tr>
				<td>融资要求</td>
				<td><s:property value="proFinance.descri" /></td>
			</tr>
	     </thead>	
		 </table>
		 
		<s:url id="pageAction" includeContext="false" action="proFinanceAction_listId" namespace="/" >
		</s:url>
</body>
</html>