<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>03_test.jsp</title>
</head>
<body>
<%
String ip=request.getRemoteAddr(); //ip얻어냄
if(ip.equals("192.168.0.34")){
	//out.println("이 IP로는 접속할 수 없습니다");
	//return; //더이상 진행 못하게 리턴
}
%>
안녕
  <ol>
    <li>메서드 방식:<%=request.getMethod() %><br>
    <li>요청URI:<%=request.getRequestURI() %><br>
    <li>요청URL:<%=request.getRequestURL() %><br>
  </ol>
</body>
</html>