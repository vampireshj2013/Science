<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>专利求购</title>
<link rel="stylesheet" type="text/css" href="./css/styles.css">
</head>
<body>
<%@ include file="../index.jsp"%>
	<table id="listId">
		<thead>
			<tr>
				<td>ID</td>
				<td><s:property value="patentBuy.patentBuyId" /></td>
			</tr>
			<tr>
				<td>标题</td>
				<td><s:property value="patentBuy.head" /></td>
			</tr>
			<tr>
				<td>所属行业</td>
				<td><s:property value="patentBuy.industry" /></td>
			</tr>
			<tr>
				<td>求购方式</td>
				<td><s:property value="patentBuy.buyType.buyTypeDesc" /></td>
			</tr>
			<tr>
				<td>专利类型</td>
				<td><s:property value="patentBuy.patent.patentDesc" /></td>
			</tr>
			<tr>
				<td>预算金额</td>
				<td><s:property value="patentBuy.expectMoney" /></td>
			</tr>
			<tr>
				<td>关键词</td>
				<td><s:property value="patentBuy.searchKey" /></td>
			</tr>
			<tr>
				<td>求购详情</td>
				<td><s:property value="patentBuy.descri" /></td>
			</tr>
	     </thead>	
		 </table>
		 
		<s:url id="pageAction" includeContext="false" action="patentBuyAction_listId" namespace="/" >
		</s:url>
</body>
</html>