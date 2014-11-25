<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form id="form" method="post" action="${basePath }proFinanceAction_add">
		ID:<input name="proFinance.proFinanceId" type="hidden" value=""><br/>
		标题:<input name="proFinance.head" type="text" value=""><br/>
		融资领域:<input name="proFinance.industry" type="text" value=""><br/>
		融资金额:<input name="proFinance.financeMoney" type="text" value=""><br/>
		融资方式:
		<select name="proFinance.finance.financeId" >
		<option value="">===请选择===</option>
		<option value="1">短期融资</option>
		<option value="2">银行贷款</option>
		<option value="3">委托贷款</option>
		<option value="4">金融租赁</option>
		<option value="5">个人贷款</option>
		<option value="6">IPO上市</option>
		<option value="7">股权转让</option>
		<option value="8">产权转让</option>
		<option value="9">技术转让</option>
		<option value="10">投资加盟</option>
		
		</select><br/>
		截止日期:<input name="proFinance.endTime" type="text" value=""><br/>
		关键词:<input name="proFinance.searchKey" type="text" value=""><br/>
		融资要求:<input name="proFinance.descri" type="text" value=""><br/>
		
		<input  type="submit" value="提交"/>
	</form>
</body>
</html>