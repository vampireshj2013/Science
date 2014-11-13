<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>专利转让</title>
<link rel="stylesheet" type="text/css" href="./css/styles.css">
</head>
<body>
<%@ include file="../index.jsp"%>
	<table id="listId">
		<thead>
			<tr>
				<td>ID</td>
				<td><s:property value="patentTran.patentTranId" /></td>
			</tr>
			<tr>
				<td>标题</td>
				<td><s:property value="patentTran.head" /></td>
			</tr>
			<tr>
				<td>所属行业</td>
				<td><s:property value="patentTran.industry" /></td>
			</tr>
			<tr>
				<td>专利号</td>
				<td><s:property value="patentTran.patentNum" /></td>
			</tr>
			<tr>
				<td>专利类型</td>
				<td><s:property value="patentTran.patent.patentDesc" /></td>
			</tr>
			<tr>
				<td>专利权人</td>
				<td><s:property value="patentTran.patentee" /></td>
			</tr>
			<tr>
				<td>合作方式</td>
				<td><s:property value="patentTran.cooperation.cooperationDesc" /></td>
			</tr>
			<tr>
				<td>基本法律状态</td>
				<td><s:property value="patentTran.lawStatus" /></td>
			</tr>
			<tr>
				<td>意向转让费</td>
				<td><s:property value="patentTran.transferFee" /></td>
			</tr>
			<tr>
				<td>关键词</td>
				<td><s:property value="patentTran.searchKey" /></td>
			</tr>
			<tr>
				<td>求购详情</td>
				<td><s:property value="patentTran.descri" /></td>
			</tr>
	     </thead>	
		 </table>
		 
		<s:url id="pageAction" includeContext="false" action="patentTranAction_listId" namespace="/" >
		</s:url>
</body>
</html>