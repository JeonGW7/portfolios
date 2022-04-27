<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>test06_input.jsp</title>
</head>
<body>
<%
//get요청 한글처리 인코딩 server.xml
//post요청 한글처리 인코딩 : 프로그램에서 한다
request.setCharacterEncoding("UTF-8");//요청시보낸 한글 인코딩처리
%>
<%-- %--JSP주석처리 --%>
<%-- % 자바구문 --%>
<%-- %=웹으로 응답,출력 --%>
<%= "출력" %><br>
<%= request.getParameter("name") %><br>
<%= request.getParameter("email") %><br>
<%= request.getParameter("url") %><br>
<%= request.getParameter("tel") %><br><br>

<%= request.getParameter("color") %><br>
<%= request.getParameter("date") %><br>
<%= request.getParameter("localdatatime") %><br><br>

<%= request.getParameter("number") %><br>
<%= request.getParameter("range") %><br>
</body>
</html>