<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="..//module/header.jsp" %>
<!DOCTYPE html>
<%--editForm.jsp--%>
<html>
<head>
<meta charset="UTF-8">
<title>editForm.jsp</title>
<style type="text/css">
table{
margin: auto;
width: 80%;
background-color: ivory;
}
</style>
</head>
<body>
  <h2>글수정 폼</h2>
  <form method="post" action="${ctxpath}/board/editPro.do">
	<table border="1">
	  <tr>
	    <td>이름</td>
	    <td>
	    <input type="text" name="writer" id="writer" value="${boardDto.writer}">
	    <input type="hidden" name="num" value="${boardDto.num}">
	    </td>
	  </tr>
	  <tr>
	    <td>글제목</td>
	    <td><input type="text" name="subject" id="subject" value="${boardDto.subject}"></td>
	  </tr>
	  <tr>
	    <td>글내용</td>
	    <td>
	      <textarea name="content" id="content" rows="10" cols="50">${boardDto.content}</textarea>
	    </td>
	  </tr>
	  <tr>
	    <td>암호</td>
	    <td><input type="password" name="pw" id="pw">*필수입력</td>
	  </tr>
	  <tr>
	    <td colspan="2" align="center">
	      <input type="submit" value="글수정">
	      <a href="${ctxpath}/board/list.do?pageNum=${pageNum}">글목록</a>
	    </td>
	  </tr>
	</table>  
  </form>
</body>
</html>