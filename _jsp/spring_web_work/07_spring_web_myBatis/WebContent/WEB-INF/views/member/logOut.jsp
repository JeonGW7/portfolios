<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--logOut.jsp--%>
<c:remove var="id" scope="session"/> <%--세션 무효화--%>
<%
//response.sendRedirect("list.do");
%>

<a href="list.do">게시판 리스트</a>
<a href="insertForm.do">회원가입</a>
<a href="loginForm.do">로그인</a>