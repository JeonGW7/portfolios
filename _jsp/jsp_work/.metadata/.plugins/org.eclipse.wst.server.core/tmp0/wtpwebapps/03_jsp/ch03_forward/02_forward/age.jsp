<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>age.jsp</title>
</head>
<body>
  <%
  int age=Integer.parseInt(request.getParameter("age"));
  if(age>0 && age<=10){
	  %>
	  <jsp:forward page="aa.jsp"/>
	  <% 
  }else if(age>10 && age <=20){
	  %>
	  <jsp:forward page="bb.jsp"/>
	  <% 
  }else if(age>20 && age<=65){
	  %>
	  <jsp:forward page="cc.jsp"/>
	  <% 
  }else if(age>65){
	  %>
	  <jsp:forward page="dd.jsp"/>
	  <% 
  }
  %>
</body>
</html>