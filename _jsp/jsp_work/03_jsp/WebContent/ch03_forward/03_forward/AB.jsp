<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>AB.jsp</title>
</head>
<body>
  <h2>AB.jsp</h2>
  <%
  String bloodType=request.getParameter("bloodType");
  String name=request.getParameter("name");
  %>
  <h3>
  <%=name %>님의 혈액형은 
  <%=bloodType %>형이고 <br>
    정확한 판단력을 가진 합리주이자 입니다
  </h3>
</body>
</html>