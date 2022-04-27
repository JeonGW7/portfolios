<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>test01.jsp</title>
</head>
<body>
  <h2>주석</h2>
  1.java주석<br>
  2.html주석<br>
  3.jsp주석<br>
  <%
  //java주석
  /*java주석*/
  out.println("<h2>자바처리 부분</h2>");
  out.println("<h2>자바처리 부분</h2>");
  out.println("<h2>자바처리 부분</h2>");
  int a=10;
  int b=10;
  int s=a+b;
  out.println("합:"+s);
  %>
  <p>
  <h2>HTML주석</h2>
  <!-- HTML주석 -->
  <!-- HTML주석,소스 보기에서 보여진다,보안 안된다 -->
  
  <h2>JSP주석</h2>
  <%--JSP주석,소스보기에서 안보인다 --%>
  <%--JSP주석 --%>
  <%--JSP주석 --%>
</body>
</html>