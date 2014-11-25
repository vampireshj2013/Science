<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>



<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Buysitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form id="form" method="post" action="${basePath }patentBuyAction_add">

		标题:<input name="patentBuy.head" type="text" value=""><br/>
		所属行业：<input name="patentBuy.industry" type="text"	 value=""><br/>
		
		求购方式:
		<select name="patentBuy.buyType.buyTypeId" >
		<option value="">===请选择===</option>
		<option value="1">完全转让</option>
		<option value="2">合作生产</option>
		<option value="3">接受投资</option>
		<option value="4">许可转让</option>
		<option value="5">面议</option>
		</select><br/>
		专利类型:
		<select name="patentBuy.patent.patentId">
		<option value="">===请选择===</option>
		<option value="1">实用新型</option>
		<option value="2">发明</option>
		<option value="3">外观</option>
		</select><br/>
		预算金额：<input name="patentBuy.expectMoney" type="text" value=""><br/>
		关键词：<input name="patentBuy.searchKey" type="text" value=""><br/>
		求购详情：<input name="patentBuy.descri" type="text" value=""><br/>
		
		
		<input  type="submit" value="提交"/>
	</form>
</body>
</html>