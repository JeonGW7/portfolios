<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--test03Pro.jsp
param		:request.getParameter()와 같은 기능
--%>   
<%
request.setCharacterEncoding("UTF-8");
%>
<h2>${sessionScope.id}님 환영합니다</h2>
<br>
<c:set var="irum" value="${param.name}"/>
이름:${param.name}<br>
이름:${irum}<br>
전화:${param.tel}<br>
주소:${param.addr}<br>