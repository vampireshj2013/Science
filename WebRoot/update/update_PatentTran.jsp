<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>



<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form id="form" method="post" action="${basePath }patentTranAction_update">
		ID:<input name="patentTran.patentTransferId" type="hidden" value="<s:property value="patentTran.patentTransferId" />"><br/>
		所属行业：<input name="patentTran.industry" type="text"	 value="<s:property value="patentTran.industry" />"><br/>
		专利号：<input name="patentTran.patentNum" type="text" value="<s:property value="patentTran.patentNum" />">	<br/>
		专利类型:
		<s:select headerKey="0" headerValue="===请选择===" list="#patents"
		                  		name="patentTran.patent.patentId" listKey="patentId" listValue="patentDesc">
		</s:select><br/>
		专利权人：<input name="patentTran.patentee" type="text" value="<s:property value="patentTran.patentee" />"><br/>
		基本法律信息：<input name="patentTran.lawStatus" type="text" value="<s:property value="patentTran.lawStatus" />"><br/>
		合作方式:
		<s:select headerKey="0" headerValue="===请选择===" list="#cooperations"
		                  		name="patentTran.cooperation.cooperationId" listKey="cooperationId" listValue="cooperationDesc">
		</s:select><br/>
		意向转让费：<input name="patentTran.transferFee" type="text" value="<s:property value="patentTran.transferFee" />"><br/>
		关键词：<input name="patentTran.searchKey" type="text" value="<s:property value="patentTran.searchKey" />"><br/>
		专利介绍：<input name="patentTran.descri" type="text" value="<s:property value="patentTran.descri" />"><br/>
		
		
		<input  type="submit" value="提交"/>
	</form>
</body>
</html>