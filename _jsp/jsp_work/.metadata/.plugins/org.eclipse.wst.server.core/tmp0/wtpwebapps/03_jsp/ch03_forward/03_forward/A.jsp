<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>A.jsp</title>
</head>
<body>
  <h2>A.jsp</h2>
  <%
  String bloodType=request.getParameter("bloodType");
  String name=request.getParameter("name");
  %>
  <h3>
  <%=name %>님의 혈액형은 
  <%=bloodType %>형이고 <br>
     성실하고 신중하며 완벽주의자 입니다 
  </h3>
</body>
</html>