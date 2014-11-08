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
				<td>融资领域</td>
				<td>融资方式</td>
				<td>融资额度</td>
				<td>截止日期</td>
				<td>关键字</td>
				<td>融资要求</td>
			</tr>
		</thead>
		<s:iterator value="#result" var="proFinance">
			<tr>
					<td><s:property value="#proFinance.proFinanceId" /></td>
					<td><s:property value="#proFinance.industry" /></td>
					<td><s:property value="#proFinance.finance.financeDesc" /></td>
					<td><s:property value="#proFinance.financeMoney" /></td>
					<td><s:property value="#proFinance.endTime" /></td>
					<td><s:property value="#proFinance.searchKey" /></td>
					<td><s:property value="#proFinance.desci" /></td>
			</tr>
		</s:iterator>
		</table>
		<s:url id="pageAction" includeContext="false" action="proFinanceAction_list" namespace="/">
		</s:url>
	    <s:include value="/pageUtil.jsp"></s:include>
</body>
</html>