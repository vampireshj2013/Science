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
		
		
		<s:iterator value="province" var="pro">
			<s:a action="city_list.action">
				<s:param name="id" value="#pro.classId" />
				<s:property value="#pro.className"/>
			</s:a>
		</s:iterator>
		<br><br><br>
		<s:iterator value="citys" var="pro">
			<s:a action="city_list.action">
				<s:param name="id" value="#pro.classId" />
				<s:property value="#pro.className"/>
			</s:a>
		</s:iterator>
		<br><br><br>
		<s:iterator value="areas" var="pro">
				<s:property value="#pro.className"/>
		</s:iterator>
</body>
</html>