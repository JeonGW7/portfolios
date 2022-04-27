<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script>
  function updateMember(){
     document.updateForm.action="memUpdateForm.do";//내정보 수정 
     document.updateForm.submit();//서버로 전송 
  }
  
</script>

</head>
<body>

<a href="list.do">게시판 목록</a>

<c:if test="${mem_id==null}">
  <a href="loginForm.do">로그인</a>
  <a href="insertForm.do">회원가입</a>
</c:if>

<c:if test="${mem_id!=null}">
  <a href="javascript:updateMember()">내정보 수정</a>
  <a href="logOut.do">로그아웃</a>

</c:if>

<form name="updateForm" method="post">
  <input type="hidden" name="id" value="${mem_id}">
</form>

</body>
</html>