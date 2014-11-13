<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form id="form" method="post" action="${basePath }tecProblemAction_update">
		ID:<input name="tecProblem.tecProblemId" type="hidden" value="<s:property value="tecProblem.tecProblemId" />"><br/>
		标题：<input name="tecProblem.head" type="text" value="<s:property value="tecProblem.head" />"><br/>
		行业分类:<input name="tecProblem.industry" type="text" value="<s:property value="tecProblem.industry" />"><br/>
		预投入金额:<input name="tecProblem.expectMoney" type="text" value="<s:property value="tecProblem.expectMoney" />"><br/>
		截止日期:<input name="tecProblem.endTime" type="text" value="<s:property value="tecProblem.endTime" />"><br/>
		关键词:<input name="tecProblem.searchKey" type="text" value="<s:property value="tecProblem.searchKey" />"><br/>
		难题详情:<input name="tecProblem.descri" type="text" value="<s:property value="tecProblem.descri" />"><br/>
		
		<input  type="submit" value="提交"/>
	</form>
</body>
</html>