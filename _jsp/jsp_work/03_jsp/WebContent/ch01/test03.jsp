<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>test03.jsp</title>
</head>
<body>
<%
//자바구문
request.setCharacterEncoding("UTF-8"); //post요청시 한글처리 인코딩 
%>
메서드 방식: <%=request.getMethod() %><br>
ID: <%=request.getParameter("id") %><br>
이름: <%=request.getParameter("name") %><br>
</body>
</html>