<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>test21_login.jsp</title>
</head>
<body>
  <%
  //클라이언트가 보내준 데이터받기
  String id=request.getParameter("id");
  String pw=request.getParameter("pw");
  //DB작업

  %>
  <%--jsp주석, 클라이언트 응답하기 --%>
  iD는 <%=id %><br>
  암호는 <%=pw %>
</body>
</html>