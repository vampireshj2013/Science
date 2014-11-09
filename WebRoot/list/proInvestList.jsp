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
				<td>投资领域</td>
				<td>投资区域</td>
				<td>投资方式</td>
				<td>投资额度</td>
				<td>截止日期</td>
				<td>关键字</td>
				<td>投资要求</td>
			</tr>
		</thead>
		<s:iterator value="#result" var="proInvest">
			<tr>
					<td><s:property value="#proInvest.proInvestId" /></td>
					<td><s:property value="#proInvest.industry" /></td>
					<td><s:property value="#proInvest.city"/></td>
					<td><s:property value="#proInvest.invest.investDesc" /></td>
					<td><s:property value="#proInvest.investMoney" /></td>
					<td><s:property value="#proInvest.endTime" /></td>
					<td><s:property value="#proInvest.searchKey" /></td>
					<td><s:property value="#proInvest.desci" /></td>
			</tr>
		</s:iterator>
		</table>
		<s:url id="pageAction" includeContext="false" action="proInvestAction_list" namespace="/">
		</s:url>
	    <s:include value="/pageUtil.jsp"></s:include>
</body>
</html>