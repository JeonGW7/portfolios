<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%--content.jsp--%>
<html>
<head>
<meta charset="UTF-8">
<title>content.jsp</title>
<style type="text/css">
h2{
text-align: center;
}
table{
margin: auto;
width: 60%;
}
</style>
</head>
<body>
  <h2>글내용보기, 글수정폼</h2>
  
  <form name="myForm" method="post" action="modifyPro.do">
    <table>
      <tr>
        <td align="right">
          <a href="list.do">목록보기</a>&nbsp;
          <a href="delete.do?bId=${boardDto.bId}">삭제</a>&nbsp;
          <a href="replyView.do?bId=${boardDto.bId}">답글쓰기</a>&nbsp;
        </td>
      </tr>
    </table>
  
    <table border="1">
      <tr>
        <td>글번호</td>
        <td>
        ${boardDto.bId}
        <input type="hidden" name="bId" value="${boardDto.bId}">
        </td>
      </tr>
      
      <tr>
        <td>조회수</td>
        <td>${boardDto.bHit}</td>
      </tr>
      
      <tr>
        <td>이름</td>
        <td><input type="text" name="bName" size="30" value="${boardDto.bName}"></td>
      </tr>
      
      <tr>
        <td>글제목</td>
        <td><input type="text" name="bTitle" size="50" value="${boardDto.bTitle}"></td>
      </tr>
      
      <tr>
        <td>글내용</td>
        <td>
          <textarea name="bContent" id="bContent" rows="10" cols="50">${boardDto.bContent}</textarea>
        </td>
      </tr>
      
      <tr>
        <td colspan="2" align="center">
          <input type="submit" value="글수정">
          <a href="list.do">글목록보기</a>
          <input type="reset" value="취소">
        </td>
      </tr>
    </table>
  </form>
</body>
</html>