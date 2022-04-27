<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--02_set_remove.jsp--%>
<c:set var="name" value="홍길동"/>
<c:set var="now" value="<%=new java.util.Date() %>"/>

NAME:${name}<br>
날짜:${now}<br>
날짜:<fmt:formatDate value="${now}" type="date"/><br>
날짜:<fmt:formatDate value="${now}" type="time"/><br>
날짜:<fmt:formatDate value="${now}" type="both"/><br>
날짜:<fmt:formatDate value="${now}" pattern="yyyy/MM/dd HH:mm:ss"/><br>
