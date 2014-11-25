<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
 <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>专利转让</title>
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
				<td>专利号</td>	
				<td>专利类型</td>
				<td>专利权人</td>
				<td>基本法律状态</td>
				<td>合作方式</td>
				<td>意向转让费</td>
				<td>关键词</td>
				<td>专利介绍</td>
			</tr>
		</thead>
		<s:iterator value="#result" var="patentTran">
			<tr>
					<td>
					<a href="patentTranAction_listById?id=<s:property value="#patentTran.patentTransferId" />">
					<s:property value="#patentTran.patentTransferId" />
					</a></td>
					<td><s:property value="#patentTran.head" /></td>
					<td><s:property value="#patentTran.industry" /></td>
					<td><s:property value="#patentTran.patentNum" /></td>
					<td><s:property value="#patentTran.patent.patentDesc" /></td>
					<td><s:property value="#patentTran.patentee" /></td>
					<td><s:property value="#patentTran.lawStatus" /></td>
					<td><s:property value="#patentTran.cooperation.cooperationDesc" /></td>
					<td><s:property value="#patentTran.transferFee" /></td>
					<td><s:property value="#patentTran.searchKey" /></td>
					<td><s:property value="#patentTran.descri" /></td>
			</tr>
		</s:iterator>
		</table>
		</div>
		<div class="container" style="width:1000px;position:absolute;top:520px;left:175px">
		<s:url id="pageAction" includeContext="false" action="patentTranAction_list" namespace="/">
		</s:url>
	    <s:include value="/pageUtil.jsp"></s:include>
	    </div>

</body>
</html>