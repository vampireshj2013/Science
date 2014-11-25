<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form id="form" method="post" action="${basePath }sciAction_add">
		
		标题:<input name="sciAchievement.head" type="text" maxlength="50" value=""/><br/>
		所属行业:<input name="sciAchievement.industry" maxlength="50" value="" /><br/>
		合作方式:
		<select name="sciAchievement.cooperation.cooperationId">
		<%-- <option value="完全转让">完全转让</option>
		<option value="合作生产">合作生产</option>
		<option value="接受投资">接受投资</option>
		<option value="许可转让">许可转让</option>
		<option value="面谈">面谈</option>--%>
		<option value="">===请选择===</option>
		<option value="1">完全转让</option>
		<option value="2">合作生产</option>
		<option value="3">接受投资</option>
		<option value="4">许可转让</option>
		<option value="5">面谈</option>
		</select><br/> 
		技术成熟度:
		<select name="sciAchievement.maturity.maturityId">
		<%--<option value="">===请选择===</option>
		<option value="研发阶段">研发阶段</option>
		<option value="小试阶段">小试阶段</option>
		<option value="中试阶段">中试阶段</option>
		<option value="产业化阶段">产业化阶段</option>--%>
		<option value="">===请选择===</option>
		<option value="1">研发阶段</option>
		<option value="2">小试阶段</option>
		<option value="3">中试阶段</option>
		<option value="4">产业化阶段</option>
		</select><br/> 
		技术水平:<input name="sciAchievement.tecLevel" type="text" maxlength="50" value="" /><br/>
		是否国际技术:<input name="sciAchievement.interTec" type="radio" value="是" />是
                  <input name="sciAchievement.interTec" type="radio" value="否"/>否<br/>      
		预期投资额:<input name="sciAchievement.expectMoney" type="text" value=""  /><br/>
		关键词:<input name="sciAchievement.searchKey" type="text" value=""  /><br/>
		成果介绍:<input name="sciAchievement.descri" type="text" value="" /><br/>
		
		<input  type="submit" value="提交"/>
	</form>
</body>
</html>