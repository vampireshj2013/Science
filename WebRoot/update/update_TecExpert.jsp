<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form id="form" method="post" action="${basePath }tecExpertAction_update">
		ID:<input name="tecExpert.tecExpertId" type="hidden" value="<s:property value="tecExpert.tecExpertId" />"><br/>
		标题:<input name="tecExpert.head" type="text" value="<s:property value="tecExpert.head" />"><br/>
		研究领域:<input name="tecExpert.industry" type="text" value="<s:property value="tecExpert.industry" />"><br/>
		所属机构:<input name="tecExpert.institution" type="text" value="<s:property value="tecExpert.institution" />"><br/>
		技术专长:<input name="tecExpert.major" type="text" value="<s:property value="tecExpert.major" />"><br/>
		职称:<input name="tecExpert.title" type="text" value="<s:property value="tecExpert.title" />"><br/>
		职务:<input name="tecExpert.duty" type="text" value="<s:property value="tecExpert.duty" />"><br/>
		性别:<input name="tecExpert.sex" type="text" value="<s:property value="tecExpert.sex" />"><br/>
		学历:<input name="tecExpert.education" type="text" value="<s:property value="tecExpert.education" />"><br/>
		关键词:<input name="tecExpert.searchKey" type="text" value="<s:property value="tecExpert.searchKey" />"><br/>
		专家介绍:<input name="tecExpert.descri" type="text" value="<s:property value="tecExpert.descri" />"><br/>
		
		<input  type="submit" value="提交"/>
	</form>
</body>
</html>