<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>include.jsp</title>
</head>
<body>
<%
request.setCharacterEncoding("UTF-8");
%>
include.jsp<br>
include.jsp<br>
include.jsp<br>
<hr>
  <jsp:include page="top.jsp">
    <jsp:param name="name" value="슈퍼맨"/>
    <jsp:param name="addr" value="서울 강남"/>
  </jsp:include>
<hr>
include.jsp<br>
include.jsp<br>
include.jsp<br>
</body>
</html>