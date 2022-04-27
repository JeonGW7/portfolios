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
    <li>메서드 방식:<%=request.getMethod() %>
    <li>요청URI:<%=request.getRequestURI() %>
    <li>요청URL:<%=request.getRequestURL() %>
    <%--
    request.getRequestURI() : /03_jsp/ch02/03_test.jsp
	request.getRequestURL() : http://localhost:9001/03_jsp/ch02/03_test.jsp
     --%>
     <p>
     <li>프로토콜:<%=request.getProtocol() %><%-- HTTP/1.1 --%>
     <li>서버이름:<%=request.getServerName() %> <!-- localhost -->
     <li>서버포트:<%=request.getServerPort() %> <!-- 9001 -->
     <p>
     <li>사용자 컴퓨터 주소 알아내기:<%=request.getRemoteAddr() %>
     <li>사용자 컴퓨터 이름 알아내기:<%=request.getRemoteHost() %>
     <p>
     <li>현재 사용중인 웹 브라우저:<%=request.getHeader("User-Agent") %>
     <p>
     <li>브라우저를 지원하는 file type:<%=request.getHeader("Accept") %>
     <p>
     <li>이전 URL알아내기:<%=request.getHeader("referer") %>
  </ol>
</body>
</html>