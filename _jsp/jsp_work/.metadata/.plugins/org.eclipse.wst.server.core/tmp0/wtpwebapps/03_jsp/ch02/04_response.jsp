<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>04_response.jsp</title>
</head>
<body>
  <%
  //response.setHeader("Refresh","2;URL=https://www.daum.net");
  %>
  2초후에 지정URL로 이동합니다
  <%
  //response.sendRedirect("03_request.jsp");
  //url:http://localhost:9001/03_jsp/ch02/03_request.jsp
  //response.sendRedirect("https://www.naver.com");
  %>
<jsp:forward page="03_request.jsp"/>
<%--url: http://localhost:9001/03_jsp/ch02/04_response.jsp 
외부 url은 안된다, error
<jsp:forward page="www.naver.com"/>
--%>

</body>
</html>