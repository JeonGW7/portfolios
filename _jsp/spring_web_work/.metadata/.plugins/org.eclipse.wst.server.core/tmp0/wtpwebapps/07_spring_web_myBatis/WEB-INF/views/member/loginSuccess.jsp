<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--loginSuccess.jsp--%>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>로그인 성공</title>
  <script type="text/javascript">
  function updateUser(){
	  //내정보 수정
	  document.updateForm.action="memberUpdateForm.do"; //내 정보 수정
	  document.updateForm.submit();
  }
  
  function deleteUser(){
	  //회원탈퇴
	  document.deleteForm.action="memberDeleteForm.do";
	  document.deleteForm.submit();
  }
  </script>
</head>
<body>
  ${memberDto.id}님 환영합니다 <br>
  <%
  //session.setAttribute("id", "kim");
  %>
  <%-- --%>
  <c:set var="id" value="${memberDto.id}" scope="session"/>
  
  <a href="list.do">게시판</a>&nbsp;
  <a href="javaScript:updateUser()">내정보수정</a>&nbsp;
  <a href="javaScript:deleteUser()">회원탈퇴</a>&nbsp;
  
  <a href="logOut.do">로그아웃</a>
  
  <form name="updateForm" method="post">
    <input type="hidden" name="id" id="id" value="${memberDto.id}"> 
  </form>
  
  <form name="deleteForm" method="post">
    <input type="hidden" name="id" id="id" value="${memberDto.id}">
  </form>
</body>
</html>