<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>test12_back.jsp</title>
</head>
<body>
<%
String id=request.getParameter("id");
String pw=request.getParameter("pw");

if(pw.length()<1){
	out.println("<script>");
	out.println("alert('pw를 입력하세요')");
	out.println("history.back()");
	out.println("</script>");
}
%>
</body>
</html>