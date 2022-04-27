<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%--test01.jsp--%>
<h3>메서드 방식 알아보기</h3>

표현식:<%=request.getMethod()%><br>
표현언어:${pageContext.request.method}<br>

표현식:<%=request.getHeader("host")%><br>
표현언어:${header.host}<br>