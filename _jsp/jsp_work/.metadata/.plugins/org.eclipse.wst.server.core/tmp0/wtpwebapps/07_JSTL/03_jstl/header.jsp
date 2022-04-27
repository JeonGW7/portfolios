<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--header.jsp--%>
<hr color="red">
  <c:if test="${param.name!=null}">
    [header]${param.name}님 방문을 환영합니다
  </c:if>
<hr color="red">
