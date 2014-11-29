<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
pageContext.setAttribute("basePath", basePath);

%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<link href="../css/styles.css" rel="stylesheet">
</head>
<body>
  <div id="left" style="position:absolute;top:130px;left:175px">
    <div id="treemenu" >
      <h5>科技成果管理</h5>
      <ul>
        <li><a href="${basePath }add/add_SciAchievement.jsp">发布科技成果</a></li>
        <li><a href="#">删改科技成果</a></li>
      </ul>
            <h5>专利求购管理</h5>
      <ul>
        <li><a href="${basePath }add/add_PatentBuy.jsp">发布专利求购</a></li>
        <li><a href="#">删改专利求购</a></li>
      </ul>
            <h5>专利转让管理</h5>
      <ul>
        <li><a href="${basePath }add/add_PatentTran.jsp">发布专利转让</a></li>
        <li><a href="#">删改专利转让</a></li>
      </ul>
         <h5>技术专家管理</h5>
      <ul>
        <li><a href="${basePath }add/add_TecExpert.jsp">发布技术专家</a></li>
        <li><a href="#">删改技术专家</a></li>
      </ul>
       <h5>技术难题管理</h5>
      <ul>
        <li><a href="${basePath }add/add_TecExpert.jsp">发布技术难题</a></li>
        <li><a href="#">删改技术难题</a></li>
      </ul>
       <h5>项目投资管理</h5>
      <ul>
        <li><a href="${basePath }add/add_TecExpert.jsp">发布项目投资</a></li>
        <li><a href="#">删改项目投资</a></li>
      </ul>
       <h5>项目融资管理</h5>
      <ul>
        <li><a href="${basePath }add/add_TecExpert.jsp">发布项目融资</a></li>
        <li><a href="#">删改项目融资</a></li>
      </ul>
    </div>
    <ol>
      <li class="exit"><a href="#">退出登录</a></li>
    </ol>
  </div>

</body>
</html>