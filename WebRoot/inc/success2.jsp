<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>个人中心</title>
<link rel="stylesheet" type="text/css" href="${basePath}css/styles.css">
<link href="${basePath}bootstrap/css/bootstrap.min.css" rel="stylesheet" media="screen">
</head>
<body>
<%@ include file="../head.jsp"%>
<%@ include file="../inc/menu.jsp"%>
<div id="right" style="margin:50px;padding:100px;width:300px;position:absolute;top:130px;left:400px;">
	 <p>操作成功！</p>
	 <input type="button" value="返回前一页" onclick="home()" />
		
	 </div>
		
</body>
<script>
	function home(){
	window.location.href="${basePath}sciAction_listByUser";
	}
</script>
</html>