<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form id="form" method="post" action="${basePath }proInvestAction_update">
		ID:<input name="proInvest.proInvestId" type="hidden" value="<s:property value="proInvest.proInvestId" />"><br/>
		标题:<input name="proInvest.head" type="text" value="<s:property value="proInvest.head" />"><br/>
		投资领域:<input name="proInvest.industry" type="text" value="<s:property value="proInvest.industry" />"><br/>
		投资区域：<input name="proInvest.city" type="text" value="<s:property value="proInvest.city"/>"><br/>
		投资金额:<input name="proInvest.investMoney" type="text" value="<s:property value="proInvest.investMoney" />"><br/>
		投资方式:
		<s:select headerKey="0" headerValue="===请选择===" list="#invests"
		                  		name="proInvest.invest.investId" listKey="investId" listValue="investDesc">
		</s:select><br/>
		截止日期:<input name="proInvest.endTime" type="text" value="<s:property value="proInvest.endTime" />"><br/>
		关键词:<input name="proInvest.searchKey" type="text" value="<s:property value="proInvest.searchKey" />"><br/>
		投资要求:<input name="proInvest.descri" type="text" value="<s:property value="proInvest.descri" />"><br/>
		
		<input  type="submit" value="提交"/>
	</form>
</body>
</html>