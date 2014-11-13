<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>



<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Buysitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form id="form" method="post" action="${basePath }patentBuyAction_update">
		ID:<input name="patentBuy.patentBuyId" type="hidden" value="<s:property value="patentBuy.patentBuyId" />"><br/>
		标题:<input name="patentBuy.head" type="text" value="<s:property value="patentBuy.head" />"><br/>
		所属行业：<input name="patentBuy.industry" type="text"	 value="<s:property value="patentBuy.industry" />"><br/>
		
		求购方式:
		<s:select headerKey="0" headerValue="===请选择===" list="#buys"
		                  		name="patentBuy.buyType.buyTypeId" listKey="buyTypeId" listValue="buyTypeDesc">
		</s:select><br/>
		专利类型:
		<s:select headerKey="0" headerValue="===请选择===" list="#patents"
		                  		name="patentBuy.patent.patentId" listKey="patentId" listValue="patentDesc">
		</s:select><br/>
		预算金额：<input name="patentBuy.expectMoney" type="text" value="<s:property value="patentBuy.expectMoney" />"><br/>
		关键词：<input name="patentBuy.searchKey" type="text" value="<s:property value="patentBuy.searchKey" />"><br/>
		求购详情：<input name="patentBuy.descri" type="text" value="<s:property value="patentBuy.descri" />"><br/>
		
		
		<input  type="submit" value="提交"/>
	</form>
</body>
</html>