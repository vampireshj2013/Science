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
		所属行业:<input name="sciAchievement.industry" type="text" value="<s:property value="sciAchievement.industry" />"><br/>
		合作方式:
		<s:select headerKey="0" headerValue="===请选择===" list="#cooperations"
		                  		name="sciAchievement.cooperation.cooperationId" listkey="cooperationId" listValue="cooperationDesc">
		</s:select><br/>
		技术成熟度:
		<s:select headerKey="0" headerValue="===请选择==="  list="#maturitys"
		              			name="sciAchievement.maturity.maturityId" listKey="maturityId" listValue="maturityDesc">
		              
		</s:select><br/>
		技术水平:<input name="sciAchievement.technologyLevel" type="text" value="<s:property value="sciAchievement.technologyLevel" />"><br/>
		是否国际技术:<input name="sciAchievement.internationalTec" type="radio" value="<s:property value="sciAchievement.internationalTec" />">是
                  <input name="sciAchievement.internationalTec" type="radio" value="<s:property value="sciAchievement.internationalTec"/>">否<br/>      
		预期投资额:<input name="sciAchievement.expectMoney" type="text" value="<s:property value="sciAchievement.expectMoney" />"><br/>
		关键词:<input name="sciAchievement.searchkey" type="text" value="<s:property value="sciAchievement.searchkey" />"><br/>
		成果介绍:<input name="sciAchievement.descri" type="text" value="<s:property value="sciAchievement.descri" />"><br/>
		
		<input  type="submit" value="提交"/>
	</form>
</body>
</html>