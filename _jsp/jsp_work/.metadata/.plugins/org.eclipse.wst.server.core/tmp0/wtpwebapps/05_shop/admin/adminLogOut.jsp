<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%--adminlogOut.jsp--%>
<%
session.invalidate(); //세션 무효화,인증 해제
%>
<script>
  location.href="Index.jsp"; 
</script>