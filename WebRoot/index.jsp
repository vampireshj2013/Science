<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<style type="text/css">
.nav ul{

width:980px;

margin:0 auto;

height:60px;

padding:0;

overflow:hidden;

}

.nav ul li{

float:left;
list-style-type:none;
}

.nav ul li a{

width:120px;

height:38px;

line-height:38px;

background-color:#BEBEBE;

color:#FFF;

font-size:20px;

display:block;

text-align:center;

text-decoration:none;

}

.nav ul li a:hover{

color:#FFF;

background-color:#36C981;

}
#image
{
 background-color:#C3DE81;
 
}
</style>
</head>
<body>
        <table  id="image" height="200" width="100%" border="0" cellspacing="0" cellpadding="0">
                           <tr>
                               <td >
                               <div class="nav" >
                               <ul >
                                   <li><a href="index.jsp">首页面</a></li>
                                   <li><a href="sciAction_list">科技成果</a></li>                             
                                   <li><a href="patentTranAction_list">专利转让</a></li>                               
                                   <li><a href="patentBuyAction_list">专利求购</a></li>                              
                                   <li><a href="tecExpertAction_list">技术专家</a></li>
                                   <li><a href="tecProblemAction_list">技术难题</a></li>
                                   <li><a href="proInvestAction_list">项目投资</a></li>                             
                                   <li><a href="proFinanceAction_list">项目融资</a></li>
                               </ul>
                               </div>
                               </td>
                           </tr>
                          
                      </table>
                      
     </body>                
</html>
