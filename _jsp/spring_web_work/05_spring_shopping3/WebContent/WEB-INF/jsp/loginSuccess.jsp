<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/header.jsp" %>
<%--loginSuccess.jsp--%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>로그인 성공</title>
</head>
<body>
  <div align="center" class="body">
    <h2>로그인 성공 화면</h2>
    환영 합니다. ${userDTO.userName}님
  </div>
</body>
</html>
<%--
프로젝트 실행 login.html 
--%>