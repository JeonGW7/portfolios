<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.net.*"
    %>
<%--hello.jsp--%>
<%
request.setCharacterEncoding("UTF-8");
String name=URLDecoder.decode(request.getParameter("name"));//ajax로 넘겨준 한글 처리
%>
<%=name%>님 안녕하세요. 반갑습니다
