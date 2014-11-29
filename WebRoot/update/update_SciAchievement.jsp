<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>更新科技成果</title>
<link href="css/styles.css" rel="stylesheet">
<link href="../bootstrap/css/bootstrap.min.css" rel="stylesheet" media="screen">
</head>


<body>

<%@ include file="/head.jsp"%>


	<form id="form" method="post" action="${basePath }sciAction_update">
	<%@ include file="../inc/menu.jsp"%>
	<div id="right" style="position:absolute;top:130px;left:400px;">
	<TABLE width="100%" id="position">
                         <TR>
                             <TD>当前位置：科技成果管理&gt;&gt;修改科技成果</TD>
                             <TD align="right"><a href="${basePath }sciAction_listByUser">返回科技成果管理</a></TD>
                            
                         </TR>
                    </TABLE>
     <table width="100%"  border="0" cellpadding="2" cellspacing="1" class="table_list" >
 	 	<caption>发布科技成果</caption>
 		<tbody>
 		<tr>
		<td>ID:</td>
		<td><input name="sciAchievement.sciAchievementId" type="hidden" value="<s:property value="sciAchievement.sciAchievementId" />"><br/>
		</td>
		</tr>
		<tr>
		<td>标题:</td>
		<td><input name="sciAchievement.head" type="text" value="<s:property value="sciAchievement.head" />"><br/>
		</td>
		</tr>
		<tr>
		<td>所属行业</td>
		<td>
		<input name="sciAchievement.industry" type="text" value="<s:property value="sciAchievement.industry" />"><br/>
		
		</td>
		</tr>
		<tr>
		<td>合作方式:</td>
		<td>
		<s:select headerKey="0" theme="simple" headerValue="===请选择===" list="#cooperations"
		                  		name="sciAchievement.cooperation.cooperationId" listKey="cooperationId" listValue="cooperationDesc">
		</s:select>
		</td>
		</tr>
		<tr>
		<td>技术成熟度:</td>
		<td><s:select theme="simple" headerKey="0" headerValue="===请选择==="  list="#maturitys"
		              			name="sciAchievement.maturity.maturityId" listKey="maturityId" listValue="maturityDesc">
		              
		</s:select><br/></td>
		</tr>
		<tr>
		<td>技术水平:</td>
		<td><input name="sciAchievement.tecLevel" type="text" value="<s:property value="sciAchievement.tecLevel" />"><br/>
		</td>
		</tr>
		<tr>
		<td>是否国际技术:</td>
				<td><input name="sciAchievement.interTec" type="radio" value="是" <s:if test='sciAchievement.interTec=="是"'>checked="checked"</s:if>> 是
				<input name="sciAchievement.interTec" type="radio" value="否" <s:if test='sciAchievement.interTec=="否"'>checked="checked"</s:if> /> 否
              </td>
                </tr>
        <tr>    
		<td>预期投资额:</td>
		<td><input name="sciAchievement.expectMoney" type="text" value="<s:property value="sciAchievement.expectMoney" />"><br/>
		</td>
		</tr>
		<tr>
		<td>
		关键词:</td>
		<td><input name="sciAchievement.searchKey" type="text" value="<s:property value="sciAchievement.searchKey" />"><br/>
		</td>
		</tr>
		<tr>
		<td>成果介绍:</td>
		<td><input name="sciAchievement.descri" type="text" value="<s:property value="sciAchievement.descri" />"><br/>
		</td>
		</tr>
		<tr><td></td>
		<td><input  type="submit" value="提交"/>
		<input type="button" value="取消" onclick="home()" /></td></tr>
		</tbody>
		</table>
	  </div>
	</form>

</body>
<script>
	function home(){
	window.location.href="${basePath }sciAction_listByUser";
	}
</script>
</html>