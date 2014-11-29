<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>新增科技成果</title>
<link href="../css/styles.css" rel="stylesheet">
<link href="../bootstrap/css/bootstrap.min.css" rel="stylesheet" media="screen">
</head>
<body>
	
	
	<%@ include file="/head.jsp"%>
	<%@ include file="../inc/menu.jsp"%>
	<form id="form" method="post" action="${basePath }sciAction_add">
	<div id="right" style="position:absolute;top:130px;left:400px;">
	<table width="100%" id="position">
                         <tr>
                             <TD>当前位置：科技成果管理&gt;&gt;新增科技成果</TD>
                             <TD align="right"><a href="${basePath }user_userInit">返回个人中心</a></TD>
                            
                         </tr>
                    </table>
	<table width="100%"  border="0" cellpadding="2" cellspacing="1" class="table_list" >
 	 <caption>发布科技成果</caption>
 	<tbody>
 	<tr>
 	<td>标题		</td>
		<td><input name="sciAchievement.head" type="text" maxlength="50" value=""/><br/></td>
		</tr>
		<tr>
		<td>所属行业</td>
		<td><input name="sciAchievement.industry" maxlength="50" value="" /><br/></td>
		</tr>
		<tr>
		<td>合作方式:</td>
		<td><select name="sciAchievement.cooperation.cooperationId">
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
		</select><br/> </td>
		</tr>
		<tr>
		<td>技术成熟度:</td>
		<td><select name="sciAchievement.maturity.maturityId">
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
		</select><br/> </td>
		</tr>
		<tr>
		<td>技术水平:</td>
		<td><input name="sciAchievement.tecLevel" type="text" maxlength="50" value="" /><br/></td>
		</tr>
		<tr>
		<td> 是否国际技术:</td>
		<td><input name="sciAchievement.interTec" type="radio" value="是" />是
                  <input name="sciAchievement.interTec" type="radio" value="否"/>否<br/>      
		</td>
		</tr>
		<tr>
		<td>预期投资额:</td>
		<td><input name="sciAchievement.expectMoney" type="text" value=""  /><br/></td>
		</tr>
		<tr>
		<td>关键词:</td>
		<td><input name="sciAchievement.searchKey" type="text" value=""  /><br/></td>
		</tr>
		<tr>
		<td>成果介绍:</td>
		<td><input name="sciAchievement.descri" type="text" value="" /><br/></td>
		</tr>
		<tr>
		 <td width="40%" ></td>
		<td><input  type="submit" value="提交"/>
		<input type="button" value="返回 " onclick="home()" /></td>
		
		</tr>
		</tbody>
		</table>
		</div>
	</form>
</body>
<script>
	function home(){
	window.location.href="${basePath}user_userInit";
	}
</script>
</html>