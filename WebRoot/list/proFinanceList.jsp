<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>项目融资</title>
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
				<td>融资领域</td>
				<td>融资方式</td>
				<td>融资额度</td>
				<td>截止日期</td>
				<td>关键字</td>
				<td>融资要求</td>
			</tr>
		</thead>
		<s:iterator value="#result" var="proFinance">
			<tr>
					<td>
					<a href="proFinanceAction_listById?id=<s:property value="#proFinance.proFinanceId" />">
					<s:property value="#proFinance.proFinanceId" />
					</a></td>
					<td><s:property value="#proFinance.head" /></td>
					<td><s:property value="#proFinance.industry" /></td>
					<td><s:property value="#proFinance.finance.financeDesc" /></td>
					<td><s:property value="#proFinance.financeMoney" /></td>
					<td><s:property value="#proFinance.endTime" /></td>
					<td><s:property value="#proFinance.searchKey" /></td>
					<td><s:property value="#proFinance.descri" /></td>
			</tr>
		</s:iterator>
		</table>
		</div>
		<div class="container" style="width:1000px;position:absolute;top:520px;left:175px">
		<s:url id="pageAction" includeContext="false" action="proFinanceAction_list" namespace="/">
		</s:url>
	    <s:include value="/pageUtil.jsp"></s:include>
	    </div>
</body>
</html>