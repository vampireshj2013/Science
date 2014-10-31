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
	<form id="form" method="post" action="${basePath }sciAction_update">
		ID:<input name="sciAchievement.sciAchievementId" type="hidden" value="<s:property value="sciAchievement.sciAchievementId" />"><br/>
		简述:<input name="sciAchievement.descri" type="text" value="<s:property value="sciAchievement.descri" />"><br/>
		期望金额:<input name="sciAchievement.expectMoney" type="text" value="<s:property value="sciAchievement.expectMoney" />"><br/>
		技术成熟度:
		<s:select headerKey="0" headerValue="===请选择==="  list="#maturitys"
		              			name="sciAchievement.maturity.maturityId" listKey="maturityId" listValue="maturityDesc">
		              
		</s:select>
		<input  type="submit" value="提交"/>
	</form>
</body>
</html>