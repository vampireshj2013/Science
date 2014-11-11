<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>


        <table  width="100%" bgcolor="#EEEEEE">
                           <tr>
                               <td>
                               <ul class="ulnotab">
                                   <li><a href="#">首页面</a></li>
                               </ul>
                               </td>
                           </tr>
                           <tr>
                           <td>
                               <ul class="ulnotab">
                                   <li><a href="sciAction_list">科技成果</li>
                               </ul>
                           </td>
                           </tr>
                            <tr>
                           <td>
                                <ul>
                                   <li><a href="patentTranAction_list">专利转让</li>
                               </ul>
                               </td>
                           </tr>
                           <tr>
                           <td>
                                <ul>
                                   <li><a href="patentBuyAction_list">专利求购</li>
                               </ul>
                               </td>
                           </tr>
                            <tr>
                           <td>
                                <ul>
                                   <li><a href="tecExpertAction_list">技术专家</li>
                               </ul>
                               </td>
                           </tr>
                           <tr>
                           <td>
                                <ul>
                                   <li><a href="tecProblemAction_list">技术难题</li>
                               </ul>
                               </td>
                           </tr>
                           <tr>
                           <td>
                                <ul>
                                   <li><a href="proInvestAction_list">项目投资</li>
                               </ul>
                               </td>
                           </tr>
                           <tr>
                           <td>
                                <ul>
                                   <li><a href="proFinanceAction_list">项目融资</li>
                               </ul>
                               </td>
                           </tr>
                      </table>
</html>
