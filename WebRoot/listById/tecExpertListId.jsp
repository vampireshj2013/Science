<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>技术专家</title>
<link rel="stylesheet" type="text/css" href="./css/styles.css">
</head>
<body>
<%@ include file="../index.jsp"%>
	<table id="listId">
		<thead>
			<tr>
				<td>ID</td>
				<td><s:property value="tecExpert.tecExpertId" /></td>
			</tr>
			<tr>
				<td>标题</td>
				<td><s:property value="tecExpert.head" /></td>
			</tr>
			<tr>
				<td>性别</td>
				<td><s:property value="tecExpert.sex" /></td>
			</tr>
			<tr>
				<td>研究领域</td>
				<td><s:property value="tecExpert.industry" /></td>
			</tr>
			<tr>
				<td>所属机构</td>
				<td><s:property value="tecExpert.institution" /></td>
			</tr>
			<tr>
				<td>技术专长</td>
				<td><s:property value="tecExpert.major" /></td>
			</tr>
			<tr>
				<td>职称</td>
				<td><s:property value="tecExpert.title" /></td>
			</tr>
			<tr>
				<td>职务</td>
				<td><s:property value="tecExpert.duty" /></td>
			</tr>
			
			<tr>
				<td>学历</td>
				<td><s:property value="tecExpert.education" /></td>
			</tr>
			<tr>
				<td>关键词</td>
				<td><s:property value="tecExpert.searchKey" /></td>
			</tr>
			<tr>
				<td>专家介绍</td>
				<td><s:property value="tecExpert.descri" /></td>
			</tr>
	     </thead>	
		 </table>
		 
		<s:url id="pageAction" includeContext="false" action="tecExpertAction_listId" namespace="/" >
		</s:url>
</body>
</html>