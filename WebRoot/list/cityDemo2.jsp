<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="${basePath}jquery/jquery_1.9.1.js"></script>
<title>Insert title here</title>
</head>
<body>
		
		<div>
			            <span>团购城市：</span>
                        <select id="addProvince">  
                            <option value="0">==请选择所属省==</option>  
                		</select> 
				        <select id="addCity">  
	                        <option value="0">==请选择城市==</option>  
	                 	</select>
	                 	<select id="addArea">  
	                        <option value="0">==请选择城市==</option>  
	                 	</select>
         </div>
</body>
<script>
//******************添加页面的三级联动onchange事件****************************//*
//省份改变的话，市级下拉框内容改变
$("#addProvince").change(function(){
  //当改变省份时需先清空城市列表和区域列表  
  $("#addCity option:not(:first)").remove();  
  $("#addArea option:not(:first)").remove(); 
  //获得选取的省份id
  var provinceID =  $("#addProvince option:selected").val(); 
  
  $.ajax({
          type:'POST',
          url:"city_cityList.action",
          data:{"id":provinceID},
          success:function (result){
              for(var i = 0;i<result.length;i++){
                  $("#addCity").append($("<option value="+result[i].classId+">"+result[i].className+"</option>"));  
              }
          },
          dataType:'json',
          error: function(XMLHttpRequest, textStatus, errorThrown) {
                alert("获取城市失败!");  
           }
  });
 
});	


//城市改变的话，县域级下拉框内容改变 
$("#addCity").change(function(){
  //当改变省份时需先清空城市列表和区域列表  
  $("#addArea option:not(:first)").remove();  
  //获得选取的省份id
  var provinceID =  $("#addCity option:selected").val(); 
  
  $.ajax({
          type:'POST',
          url:"city_cityList.action",
          data:{"id":provinceID},
          success:function (result){
              for(var i = 0;i<result.length;i++){
                  $("#addArea").append($("<option value="+result[i].classId+">"+result[i].className+"</option>"));  
              }
          },
          dataType:'json',
          error: function(XMLHttpRequest, textStatus, errorThrown) {
                alert("获取城市失败!");  
           }
  });
 
});	

//获得省份
$.ajax({
    type:'POST',
    url:"city_cityList.action",
    data:{"id":-1},
    success:function (result){
        for(var i = 0;i<result.length;i++){
            $("#addProvince").append($("<option value="+result[i].classId+">"+result[i].className+"</option>"));  
        }
    },
    dataType:'json',
    error: function(XMLHttpRequest, textStatus, errorThrown) {
          alert("获取省份失败!");  
     }
   });
</script>
</html>