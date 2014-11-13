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
				<td><s:property value="sciAchievement.sciAchievementId" /></td>
			</tr>
			<tr>
				<td>标题</td>
				<td><s:property value="sciAchievement.head" /></td>
			</tr>
			<tr>
				<td>所属行业</td>
				<td><s:property value="sciAchievement.industry" /></td>
			</tr>
			<tr>
				<td>合作方式</td>
				<td><s:property value="sciAchievement.cooperation.cooperationDesc" /></td>
			</tr>
			<tr>
				<td>技术成熟度</td>
				<td><s:property value="sciAchievement.maturity.maturityDesc" /></td>
			</tr>
			<tr>
				<td>技术水平</td>
				<td><s:property value="sciAchievement.tecLevel" /></td>
			</tr>
			<tr>
				<td>是否国际技术</td>
				<td><s:property value="sciAchievement.interTec" /></td>
			</tr>
			<tr>
				<td>预期投资额</td>
				<td><s:property value="sciAchievement.expectMoney" /></td>
			</tr>
			<tr>
				<td>关键词</td>
				<td><s:property value="sciAchievement.searchKey" /></td>
			</tr>
			<tr>
				<td>求购详情</td>
				<td><s:property value="sciAchievement.descri" /></td>
			</tr>
	     </thead>	
		 </table>
		 
		<s:url id="pageAction" includeContext="false" action="sciAction_listId" namespace="/" >
		</s:url>
</body>
</html>