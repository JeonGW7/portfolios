<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%--test05.jsp--%>
<%
request.setAttribute("name", "아이유");
request.setAttribute("addr", "서울");
request.setAttribute("tel", "01012345678");
%>
NAME:${requestScope.name}<br>
ADDR:${requestScope.addr}<br>
TEL:${requestScope.tel}<br>
<br>
요청URI:${pageContext.request.requestURI}<br>
요청URL:${pageContext.request.requestURL}<br>