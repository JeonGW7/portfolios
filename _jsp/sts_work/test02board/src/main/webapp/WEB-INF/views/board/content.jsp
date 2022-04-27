<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
h2 {
	text-align: center;
}

table {
	margin: auto;
	border: 1px solid black;
	width: 60%;
}
</style>
</head>
<body>
	<h2>글내용 보기</h2>
	<table border="1">
	  <tr>
	    <td colspan="2" align="right">
	      <a href="editForm.do?num=${boardDto.num}">글수정</a>&nbsp;
	      <a href="deletePro.do?num=${boardDto.num}">글삭제</a>&nbsp;
	      <a href="list.do">리스트</a>&nbsp;
	      <a href="insertForm.do">글쓰기</a>&nbsp;
	    </td>
	  </tr>
	  <tr>
	    <td>글쓴이</td>
		<td>${boardDto.writer}</td>
	  </tr>
	  
	  <tr>
		<td>글제목</td>
		<td>${boardDto.subject}</td>
	  </tr>
	  
	  <tr>
		<td>글내용</td>
		<td><pre>${boardDto.content}</pre></td>
	  </tr>
	  
	  <tr>
		<td>날짜</td>
		<td>${boardDto.wdate}</td>
	  </tr>
	  
	  <tr>
	    <td>조회수</td>
	    <td>${boardDto.readcount}</td>
	  </tr>
	</table>
</body>
</html>