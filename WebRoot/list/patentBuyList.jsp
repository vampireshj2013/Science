<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="./css/styles.css">
<title>专利求购</title>

</head>
<body>
		<%@ include file="../index.jsp"%>
		<table id="list">
		<thead>
			<tr>
				<td>ID</td>
				<td>标题</td>
				<td>所属行业</td>
				<td>求购方式</td>
				<td>专利类型</td>
				<td>预算金额</td>
				<td>关键词</td>
				<td>求购详情</td>
			</tr>
		</thead>
		<s:iterator value="#result" var="patentBuy">
			<tr>
					<td><a href="patentBuyAction_listById?id=<s:property value="#patentBuy.patentBuyId" />"><s:property value="#patentBuy.patentBuyId" /></a>
					</td>
					<td><s:property value="#patentBuy.head" /></td>
					<td><s:property value="#patentBuy.industry" /></td>
					<td><s:property value="#patentBuy.buyType.buyTypeDesc" /></td>
					<td><s:property value="#patentBuy.patent.patentDesc" /></td>
					<td><s:property value="#patentBuy.expectMoney" /></td>
					<td><s:property value="#patentBuy.searchKey" /></td>
					<td><s:property value="#patentBuy.descri" /></td>
			</tr>
		</s:iterator>
		 </table>
		<s:url id="pageAction" includeContext="false" action="patentBuyAction_list" namespace="/">
		</s:url>
	    <s:include value="/pageUtil.jsp"></s:include>
        
</body>
</html>