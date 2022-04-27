<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/header/header.jsp" %>
<%--inputPro.jsp--%>
<h2>회원가입을 축하합니다</h2>
<%
/*이전
String id=(String)request.getAttribute("id");
session.setAttribute("id", id);
*/
%>
<%--자동로그인--%>
<%-- 
<c:set var="id" value="${id}" scope="session"/>
--%>
<meta http-equiv="Refresh" content="0;url=${ctxpath}/member/main.do">