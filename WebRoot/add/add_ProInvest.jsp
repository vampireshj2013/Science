<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form id="form" method="post" action="${basePath }proInvestAction_add">
		ID:<input name="proInvest.proInvestId" type="hidden" value=""><br/>
		标题:<input name="proInvest.head" type="text" value=""><br/>
		投资领域:<input name="proInvest.industry" type="text" value=""><br/>
		投资区域：<input name="proInvest.city" type="text" value=""><br/>
		投资金额:<input name="proInvest.investMoney" type="text" value=""><br/>
		投资方式:
		<select name="proInvest.invest.investId" >
		<option value="">===请选择===</option>
		<option value="1">合资</option>
		<option value="2">合作</option>
		<option value="3">控股</option>
		<option value="4">参股</option>
		<option value="5">借款</option>
		<option value="6">风险投资</option>
		<option value="7">面谈</option>
		
		</select><br/>
		截止日期:<input name="proInvest.endTime" type="text" value=""><br/>
		关键词:<input name="proInvest.searchKey" type="text" value=""><br/>
		投资要求:<input name="proInvest.descri" type="text" value=""><br/>
		
		<input  type="submit" value="提交"/>
	</form>
</body>
</html>