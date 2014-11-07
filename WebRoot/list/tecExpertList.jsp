<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<table>
		<thead>
			<tr>
				<td>ID</td>
				<td>研究领域</td>
				<td>所属机构</td>
				<td>技术专长</td>
				<td>职称</td>
				<td>职务</td>
				<td>性别</td>
				<td>学历</td>
				<td>关键字</td>
			</tr>
		</thead>
		<s:iterator value="#result" var="tecExpert">
			<tr>
					<td><s:property value="#tecExpert.tecExpertId" /></td>
					<td><s:property value="#tecExpert.industry" /></td>
					<td><s:property value="#tecExpert.institution" /></td>
					<td><s:property value="#tecExpert.major" /></td>
					<td><s:property value="#tecExpert.title" /></td>
					<td><s:property value="#tecExpert.duty" /></td>
					<td><s:property value="#tecExpert.sex" /></td>
					<td><s:property value="#tecExpert.education" /></td>
					<td><s:property value="#tecExpert.searchKey" /></td>
			</tr>
		</s:iterator>
		</table>
		<s:url id="pageAction" includeContext="false" action="tecExpertAction_list" namespace="/">
		</s:url>
	    <s:include value="/pageUtil.jsp"></s:include>
</body>
</html>