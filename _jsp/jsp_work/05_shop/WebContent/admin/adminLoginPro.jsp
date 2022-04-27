<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%--adminLoginPro.jsp--%>
<%
String adminId=request.getParameter("adminId");
String adminPw=request.getParameter("adminPw");

//DB작업~~~
session.setAttribute("adminId", adminId);
%>

<script>
  location.href="Index.jsp"; //ID/PW : admin/12345 로 하기
</script>