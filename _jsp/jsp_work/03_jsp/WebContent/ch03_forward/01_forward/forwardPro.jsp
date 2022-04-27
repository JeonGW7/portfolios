<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>forwardPro.jsp</title>
</head>
<body>
<%
request.setCharacterEncoding("UTF-8"); //post요청시 한글처리 하기 위한 인코딩 설정
%>
  <jsp:forward page="forwardPro2.jsp">
    <jsp:param name="id" value="kim"/>
    <jsp:param name="pw" value="kim123"/>
  </jsp:forward>
</body>
</html>