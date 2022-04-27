<%@page import="com.sun.corba.se.spi.legacy.connection.GetEndPointInfoAgainException"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="mypa.*"
    %>
<%--TestBean2.jsp--%>
<%
request.setCharacterEncoding("UTF-8");
%>
<jsp:useBean id="dto" class="mypa.TestDTO2">
  <jsp:setProperty name="dto" property="*"/>
</jsp:useBean>

ID:<%=dto.getId()%><br>
암호:<%=dto.getPw()%><br>
이름:<%=dto.getName()%><br>
전화:<%=dto.getTel()%><br>
이메일:<%=dto.getEmail()%><br>
주소:<%=dto.getAddr()%><br>