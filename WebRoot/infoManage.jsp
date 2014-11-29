<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
pageContext.setAttribute("basePath", basePath);
/* request.setAttribute("basePath", basePath); */
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>信息管理</title>
<link href="css/styles.css" rel="stylesheet">

</head>
<body>
<%@ include file="head.jsp"%>
<div id="main" >
  <div id="left" style="position:absolute;top:130px;left:175px">
    <div id="treemenu">
      <h5>科技成果管理</h5>
      <ul>
        <li><a href="${basePath }add/add_SciAchievement.jsp">发布科技成果</a></li>
        <li><a href="?file=technology&action=manage&object=demand">删改科技成果</a></li>
      </ul>
            <h5>专利求购管理</h5>
      <ul>
        <li><a href="${basePath }add/add_PatentBuy.jsp">发布专利求购</a></li>
        <li><a href="?file=technology&action=manage&object=business">删改专利求购</a></li>
      </ul>
            <h5>专利转让管理</h5>
      <ul>
        <li><a href="${basePath }add/add_PatentTran.jsp">发布专利转让</a></li>
        <li><a href="?file=technology&action=manage&object=protech">删改专利转让</a></li>
      </ul>
         <h5>技术专家管理</h5>
      <ul>
        <li><a href="${basePath }add/add_TecExpert.jsp">发布技术专家</a></li>
        <li><a href="?file=technology&action=manage&object=invent">删改技术专家</a></li>
      </ul>
       <h5>技术难题管理</h5>
      <ul>
        <li><a href="${basePath }add/add_TecExpert.jsp">发布技术难题</a></li>
        <li><a href="?file=technology&action=manage&object=invent">删改技术难题</a></li>
      </ul>
       <h5>项目投资管理</h5>
      <ul>
        <li><a href="${basePath }add/add_TecExpert.jsp">发布项目投资</a></li>
        <li><a href="?file=technology&action=manage&object=invent">删改项目投资</a></li>
      </ul>
       <h5>项目融资管理</h5>
      <ul>
        <li><a href="${basePath }add/add_TecExpert.jsp">发布项目融资</a></li>
        <li><a href="?file=technology&action=manage&object=invent">删改项目融资</a></li>
      </ul>
    </div>
    <ol>
      <li class="exit"><a href="#">退出登录</a></li>
    </ol>
  </div>
  <div id="right" style="position:absolute;top:130px;left:400px;">

<p id="position" ><strong>当前位置：</strong><a href="#">会员中心</a>&gt;&gt;<a href="#">信息管理</a></p>

		<table cellpadding="0" cellspacing="1" class="table_list">
		  <caption>信息管理</caption>
		  <tr>
		 	<th>栏目</th>
		<th>信息数</th>
		<th>管理操作</th>
		  </tr>
		  <tr>
		  	<td>科技成果</td>
		  	<td><s:property value ="#sciCount" /></td>
		<td><a href="add/add_SciAchievement.jsp">[添加]</a>&nbsp;&nbsp;<a href="sciAction_listByUser">[管理]</a></td>
		  </tr>
		  <tr>
		  	<td>专利求购</td>
		  	<td>0</td>
		<td><a href="add/add_PatentBuy.jsp">[添加]</a>&nbsp;&nbsp;<a href="#">[管理]</a></td>
		  </tr>
		  <tr>
		  	<td>专利转让</td>
		  	<td>0</td>
		<td><a href="add/add_PatentTran.jsp">[添加]</a>&nbsp;&nbsp;<a href="#">[管理]</a></td>
		  </tr>
		  <tr>
		  	<td>技术专家</td>
		  	<td>0</td>
		<td><a href="add/add_TecExpert.jsp">[添加]</a>&nbsp;&nbsp;<a href="#">[管理]</a></td>
		  </tr>
		  <tr>
		  	<td>技术难题</td>
		  	<td>0</td>
		<td><a href="add/add_TecProblem.jsp">[添加]</a>&nbsp;&nbsp;<a href="#">[管理]</a></td>
		  </tr>
		<tr>
		  	<td>项目投资</td>
		  	<td>0</td>
		<td><a href="add/add_ProInvest.jsp">[添加]</a>&nbsp;&nbsp;<a href="#">[管理]</a></td>
		  </tr>
		  <tr>
		  	<td>项目融资</td>
		  	<td>0</td>
		<td><a href="add/add_ProFinance.jsp">[添加]</a>&nbsp;&nbsp;<a href="#">[管理]</a></td>
		  </tr>
		   
		 </table>
		
		
		  </div>
		</div>


</body>
</html>

