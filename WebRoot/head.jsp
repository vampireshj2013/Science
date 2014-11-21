<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
     <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>首页</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- Bootstrap -->
    <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" media="screen">
	<script src="js/ui/jquery-1.8.0.min.js"></script>
    <script src="bootstrap/js/bootstrap.js"></script>
    <style type="text/css">
    body{
    font-family: "Helvetica Neue",Helvetica,Arial,sans-serif;
    font-size: 16px;}
    .navbar-search .search-btn {
    background-attachment: scroll;
    background-color: #535353;
    background-position: center center;
    background-repeat: repeat;
    border: 0 solid #000000;
    border-radius: 5px;
    font-family: "Helvetica Neue",Helvetica,Arial,sans-serif;
    font-size: 13px;
    font-weight: normal;
    line-height: 1;
    margin-bottom: 0;
    padding: 5px 7px;
    text-align: center;
	}
	
    </style>
</head>
<body>
<div class="navbar  navbar-fixed-top"  >
		
			<div class="navbar-inner">
				
					
				<div class="container" style="width:1000px">
								<a class="brand" href="index.jsp">www.kjcg.com</a>
								<div class="nav-collapse pull-right">
			  <ul class="nav">
			             <li>
			               	 <form class="navbar-search pull-left" id="searchForm" action="" >
			                   <input type="text" name ="key"  id="key" value="<s:property value='key'/>" placeholder="Search" class="search-query">
			                   <input type="hidden" value="1" name="price">
			                   <input type="hidden" value='<s:property value="typeId"/>' name="type">
			                   <button type="button" class="search-btn" onclick="search()"><i class="icon-search icon-white"> &nbsp;</i></button>
			                 </form>
				          </li>
			 </ul>
			 </div>
			 </div>
			 </div>
			 </div>
				                
</body>
</html>