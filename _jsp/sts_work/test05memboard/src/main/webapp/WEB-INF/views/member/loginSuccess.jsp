<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../module/header.jsp" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>loginSuccess.jsp</title>
  <script type="text/javascript">
    function updateUser(){
    	//내정보 수정
    	document.updateForm.action="${ctxpath}/member/memberUpdateForm.do";
    	document.updateForm.submit();
    }
    function deleteUser(){
    	//회원탈퇴
    	document.deleteForm.action="${ctxpath}/member/memberDeleteForm.do";
    	document.deleteForm.submit();
    }
  </script>
</head>
<body>
<!-- loginSuccess.jsp -->
<%--EL,JSTL --%>
<c:set var="id" value="${memberDto.id}" scope="session"/>
<a href="${ctxpath}/board/list.do">게시판 리스트</a>&nbsp;
<a href="javaScript:updateUser()">내정보수정</a>&nbsp;
<a href="javaScript:deleteUser()">회원탈퇴</a>&nbsp;
<a href="${ctxpath}/member/logOut.do">로그아웃</a>&nbsp;

<form name="updateForm" method="post">
  <input type="hidden" name="id" id="id" value="${memberDto.id}">
</form>

<form name="deleteForm" method="post">
  <input type="hidden" name="id" id="id" value="${memberDto.id}">
</form>
</body>
</html>