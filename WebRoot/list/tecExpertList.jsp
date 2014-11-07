<%@ page language="java" pageEncoding="UTF-8"%>
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
				<td>性别</td>
				<td>求购详情</td>
			</tr>
		</thead>
		<s:iterator value="#result" var="patentBuy">
			<tr>
					<td><s:property value="#patentBuy.patentBuyId" /></td>
					<td><s:property value="#patentBuy.industry" /></td>
					<td><s:property value="#patentBuy.buyType" /></td>
					<td><s:property value="#patentBuy.patent.patentDesc" /></td>
					<td><s:property value="#patentBuy.expectMoney" /></td>
					<td><s:property value="#patentBuy.searchkey" /></td>
					<td><s:property value="#patentBuy.descri" /></td>
			</tr>
		</s:iterator>
		</table>
		<s:url id="pageAction" includeContext="false" action="patentBuyAction_list" namespace="/">
		</s:url>
	    <s:include value="/pageUtil.jsp"></s:include>
</body>
</html>