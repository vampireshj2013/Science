<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
		
		<table>
		<thead>
			<tr>
				<td>ID</td>
				<td>所属行业</td>
				<td>合作方式</td>
				<td>技术成熟度</td>
				<td>技术水平</td>
				<td>是否国际技术</td>
				<td>预期投资额</td>
				<td>关键词</td>
				<td>成果介绍</td>
			</tr>
		</thead>
		<s:iterator value="#result" var="sciAchievement">
			<tr>
					<td><s:property value="#sciAchievement.sciAchievementId" /></td>
					<td><s:property value="#sciAchievement.industry" /></td>
					<td><s:property value="#sciAchievement.cooperation" /></td>
					<td><s:property value="#sciAchievement.maturity.maturityDesc" /></td>
					<td><s:property value="#sciAchievement.technologyLevel" /></td>
					<td><s:property value="#sciAchievement.internationalTec" /></td>
					<td><s:property value="#sciAchievement.expectMoney" /></td>
					<td><s:property value="#sciAchievement.searchkey" /></td>
					<td><s:property value="#sciAchievement.descri" /></td>
			</tr>
		</s:iterator>
		</table>
		<s:url id="pageAction" includeContext="false" action="sciAction_list" namespace="/">
		</s:url>
	    <s:include value="/pageUtil.jsp"></s:include>
</body>
</html>