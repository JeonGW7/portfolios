<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.util.*"
    %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--07_for_each.jsp--%>
<c:set var="dto" value="<%=new HashMap()%>"/>
<c:set target="${dto}" property="name" value="홍길동"/>
<c:set target="${dto}" property="id" value="hong"/>
<c:set target="${dto}" property="pw" value="h123"/>

이름:${dto.name}<br>
ID:${dto.id}<br>
PW:${dto.pw}<br>