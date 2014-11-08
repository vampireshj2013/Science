<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form id="form" method="post" action="${basePath }proFinanceAction_update">
		ID:<input name="proFinance.proFinanceId" type="hidden" value="<s:property value="proFinance.proFinanceId" />"><br/>
		融资领域:<input name="proFinance.industry" type="text" value="<s:property value="proFinance.industry" />"><br/>
		融资金额:<input name="proFinance.financeMoney" type="text" value="<s:property value="proFinance.financeMoney" />"><br/>
		融资方式:
		<s:select headerKey="0" headerValue="===请选择===" list="#finances"
		                  		name="proFinance.finance.financeId" listKey="financeId" listValue="financeDesc">
		</s:select><br/>
		截止日期:<input name="proFinance.endTime" type="text" value="<s:property value="proFinance.endTime" />"><br/>
		关键词:<input name="proFinance.searchKey" type="text" value="<s:property value="proFinance.searchKey" />"><br/>
		融资要求:<input name="proFinance.descri" type="text" value="<s:property value="proFinance.descri" />"><br/>
		
		<input  type="submit" value="提交"/>
	</form>
</body>
</html>