<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%--includeTop.jsp--%>
<html>
  <body>
  includeTop.jsp<br>
  includeTop.jsp<br>
  <%
  String name=request.getParameter("name");//includeActionTag.html에서 보내준 내용을 받음
  %>
  <b><%=name %></b>님 화이팅 <br>
  includeTop.jsp<br>
  includeTop.jsp<br>
  </body>
</html>