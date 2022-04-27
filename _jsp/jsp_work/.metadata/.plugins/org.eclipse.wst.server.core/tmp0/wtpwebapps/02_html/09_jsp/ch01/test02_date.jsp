<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ page import="java.text.SimpleDateFormat" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>test02_date.jsp</title>
</head>
<body>
  <font size="5"><b>오늘 날짜 출력</b></font><br>
  <%
  Date date=new Date(); //객체 생성
  SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss EEEE a");
  SimpleDateFormat sdf2=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss EEE a");
  SimpleDateFormat sdf3=new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초 EEE a");
  %>
  <%=sdf.format(date) %><br>
  <%=sdf2.format(date) %><br>
  <%=sdf3.format(date) %><br>
  
</body>
</html>