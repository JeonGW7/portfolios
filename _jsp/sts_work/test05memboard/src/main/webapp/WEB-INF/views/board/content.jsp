<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../module/header.jsp" %>
<!DOCTYPE html>
<%--content.jsp--%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
table{
margin: auto;
width: 80%;
}
</style>
</head>
<body>
  <h2>글내용 보기</h2>
  <table>
    <tr>
      <td align="right">
        <a href="${ctxpath}/board/editForm.do?num=${num}&pageNum=${pageNum}">글수정</a>&nbsp;
        <a href="${ctxpath}/board/delete.do?num=${num}&pageNum=${pageNum}">글삭제</a>&nbsp;
        <a href="${ctxpath}/board/writeForm.do">글쓰기</a>&nbsp;
        <a href="${ctxpath}/board/writeForm.do?num=${num}&ref=${boardDto.ref}&re_step=${boardDto.re_step}&re_level=${boardDto.re_level}&pageNum=${pageNum}">답글쓰기</a>&nbsp;
        <a href="${ctxpath}/board/list.do?pageNum=${pageNum}">글목록</a>&nbsp;
      </td>
    </tr>
  </table>
  <table border="1">
    <tr>
      <td>글번호</td>
      <td>${boardDto.num}</td>
      <td>조회수</td>
      <td>${boardDto.readcount}</td>
    </tr>
    
    <tr>
      <td>작성자</td>
      <td>${boardDto.writer}</td>
      <td>작성일</td>
      <td>${boardDto.regdate}</td>
    </tr>
    
    <tr>
      <td>글제목</td>
      <td colspan="3">
        ${boardDto.subject}
      </td>
    </tr>
    
    <tr>
      <td>글내용</td>
      <td colspan="3">
        <pre>${boardDto.content}</pre>
      </td>
    </tr>
  </table>
</body>
</html>