<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.net.*" %>
<%--cookieMake.jsp--%>
<%
request.setCharacterEncoding("UTF-8");
%>
<html>
  <body>
    <%
    //쿠키 심기
    String visitor=request.getParameter("visitor");
    Cookie cookie=new Cookie("visitor",URLEncoder.encode(visitor)); //쿠키생성
    response.addCookie(cookie); //클라이언트에 쿠키 심기
    %>
    <a href="cookieView.jsp">cookieView.jsp</a>
  </body>
</html>