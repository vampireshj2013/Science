<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>



<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form id="form" method="post" action="${basePath }patentTranAction_add">
		ID:<input name="patentTran.patentTransferId" type="hidden" value=""><br/>
		标题:<input name="patentTran.head" type="text" value=""><br/>
		所属行业：<input name="patentTran.industry" type="text"	 value=""><br/>
		专利号：<input name="patentTran.patentNum" type="text" value="">	<br/>
		专利类型:
		<select name="patentTran.patent.patentId">
		<option value="">===请选择===</option>
		<option value="1">实用新型</option>
		<option value="2">发明</option>
		<option value="3">外观</option>
		</select><br/>
		专利权人：<input name="patentTran.patentee" type="text" value=""><br/>
		基本法律信息：<input name="patentTran.lawStatus" type="text" value=""><br/>
		合作方式:
		<select name="patentTran.cooperation.cooperationId">
		<option value="">===请选择===</option>
		<option value="1">完全转让</option>
		<option value="2">合作生产</option>
		<option value="3">接受投资</option>
		<option value="4">许可转让</option>
		<option value="5">面谈</option>
		</select><br/> 
		意向转让费：<input name="patentTran.transferFee" type="text" value=""><br/>
		关键词：<input name="patentTran.searchKey" type="text" value=""><br/>
		专利介绍：<input name="patentTran.descri" type="text" value=""><br/>
		
		
		<input  type="submit" value="提交"/>
	</form>
</body>
</html>