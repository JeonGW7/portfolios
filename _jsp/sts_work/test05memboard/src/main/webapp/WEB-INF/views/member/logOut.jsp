<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../module/header.jsp" %>
<%--logOut.jsp--%>

<c:remove var="id" scope="session"/> <%--세션무효회--%>

<meta http-equiv="Refresh" content="2;url=${ctxpath}/member/loginForm.do">
