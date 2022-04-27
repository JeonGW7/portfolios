<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/board/header.jsp" %>
<%--index.jsp--%>

index.jsp
<br>
<a href="${ctxpath}/board/writeForm.do">글쓰기</a><br>
<a href="${ctxpath}/board/list.do">리스트</a><br>
<meta http-equiv="Refresh" content="0;url=${ctxpath}/board/list.do">
