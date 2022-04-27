<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.util.*"
    %>
<%--test02.jsp--%>
<%
String id="park";
session.setAttribute("id",id);
session.setAttribute("name","박지성");
%>
표현식:<%=session.getAttribute("id")%><br>
표현언어:${sessionScope.id}<br>

표현식:<%=session.getAttribute("name")%><br>
표현언어:${sessionScope.name}<br>