<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
 <%@ taglib prefix="s" uri="/struts-tags" %>
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
				<td>专利号</td>
				<td>专利类型</td>
				<td>专利权人</td>
				<td>基本法律状态</td>
				<td>合作方式</td>
				<td>意向转让费</td>
				<td>关键词</td>
				<td>成果介绍</td>
			</tr>
		</thead>
		<s:iterator value="#result" var="patentTran">
			<tr>
					<td><s:property value="#patentTran.patentTransferId" /></td>
					<td><s:property value="#patentTran.industry" /></td>
					<td><s:property value="#patentTran.patentNum" /></td>
					<td><s:property value="#patentTran.patent.patentDesc" /></td>
					<td><s:property value="#patentTran.patentee" /></td>
					<td><s:property value="#patentTran.lawStatus" /></td>
					<td><s:property value="#patentTran.cooperation" /></td>
					<td><s:property value="#patentTran.transferFee" /></td>
					<td><s:property value="#patentTran.searchKey" /></td>
					<td><s:property value="#patentTran.descri" /></td>
			</tr>
		</s:iterator>
		</table>
		<s:url id="pageAction" includeContext="false" action="patentTranAction_list" namespace="/">
		</s:url>
	    <s:include value="/pageUtil.jsp"></s:include>

</body>
</html>