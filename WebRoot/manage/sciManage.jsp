<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>科技成果</title>
<link rel="stylesheet" type="text/css" href="./css/styles.css">

</head>
<script language="javascript">
    function delcfm() {
        if (confirm("确认要删除？")) {
        	return true;
        }
        else{  
        	
        	return false;
        }
    }
</script>
<body>
<%@ include file="/head.jsp"%>
<%@ include file="../inc/menu.jsp"%>
<div id="right" style="position:absolute;top:130px;left:400px;">
	<TABLE width="100%" id="position">
                         <TR>
                             <TD>当前位置：科技成果管理&gt;&gt;管理科技成果</TD>
                             <TD align="right"><a href="${basePath }user_userInit">返回个人中心</a></TD>
                            
                         </TR>
                    </TABLE>
	<table cellpadding="0" cellspacing="1" class="table_list">
  	  <caption>科技成果管理</caption>
	  <tr>
		<th>ID</th>
		<th>标题</th>
		<th>关键字</th>
		<th>点击</th>
		<th>管理操作</th>
	  </tr>
	  	<s:iterator value="#result" var="sci">
           <TR>
           	<td><s:property value="#sci.sciAchievementId" /></td>
           	<td><s:property value="#sci.head" /></td>
           	<td><s:property value="#sci.searchKey" /></td>
           	<td><s:property value="#sci.attentionNum" /></td>
            <td><a href="sciAction_updateInit?id=<s:property value="#sci.sciAchievementId" />">修改</a>&nbsp;&nbsp;&nbsp; 
            	<a href=" sciAction_delete?id=<s:property value="#sci.sciAchievementId" />" onClick="return delcfm();">删除</a></td>
            </TR>
            </s:iterator>
	       
	 </table>
	 <div>
			<s:url id="pageAction" includeContext="false" action="sciAction_listByUser" namespace="/">
			</s:url>
		
		    <s:include value="../pageUtil.jsp"></s:include>
		    </div>
    
	 </div>
		
</body>
</html>