<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<%--list.jsp--%>
<html>
<head>
<meta charset="UTF-8">
<title>list.jsp</title>
<style type="text/css">
h2{
text-align: center;
}
table{
margin: auto;
width:50%;
}
</style>
</head>
<body>
  <h2>리스트</h2>
  <table>
    <tr>
      <td align="right">
        <a href="writeForm.do">글쓰기</a>
      </td>
    </tr>
  </table>
  <table border="1">
    <tr>
      <th>번호</th>
      <th>이름</th>
      <th>글제목</th>
      <th>날짜</th>
      <th>조회수</th>
    </tr>
    
    <c:forEach var="boardDto" items="${list}">
      <tr>
        <td>${boardDto.bId}</td>
        <td>${boardDto.bName}</td>
        <!-- 글제목을 클릭하면 글내용보기로 가기 -->
        <td>
        <!-- 답글 들여 쓰기 -->
        <c:forEach begin="1" end="${boardDto.bIndent}">
                        ☞
        </c:forEach>
        <a href="content.do?bId=${boardDto.bId}">
          ${boardDto.bTitle}
        </a>
        </td>
        <td>${boardDto.bDate}</td>
        <td>${boardDto.bHit}</td>
      </tr>
    </c:forEach>
  </table>
</body>
</html>