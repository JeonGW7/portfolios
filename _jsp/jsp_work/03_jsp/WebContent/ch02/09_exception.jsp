<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page errorPage="09_err.jsp" %>
<%--에러가 발생하면 09_err.jsp로 이동한다 --%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>09_exception.jsp</title>
</head>
<body>
<%
int a=7;
int b=0;
%>
합:<%=(a+b) %><br>
차:<%=(a-b) %><br>
곱:<%=(a*b) %><br>
나누기:<%=(a/b) %><br>
</body>
</html>