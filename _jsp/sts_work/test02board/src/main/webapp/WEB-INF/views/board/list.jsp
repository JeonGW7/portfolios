<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<%--list.jsp--%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  <table border="1" width="80%" align="center">
      
    <tr>
      <td colspan="5" align="center">
        <font size="5">게시판 리스트</font>
      </td>
    </tr>
    
    <tr align="center">
      <td>글쓴이</td>
      <td>글제목</td>
      <td>글내용</td>
      <td>날짜</td>
      <td>조회수</td>
    </tr>
    
    <c:forEach var="boardDto" items="${list}">
      <tr align="center">
      <%--제목을 클릭하면 글내용 보기로 가기 content.do?num=${} --%>
        <td>${boardDto.writer}</td>
        <td>
        <a href="content.do?num=${boardDto.num}">
        ${boardDto.subject}
        </a>
        </td>
        <td>${boardDto.content}</td>
        <td>${boardDto.wdate}</td>
        <td>${boardDto.readcount}</td>
      </tr>
    </c:forEach>
  </table>
</body>

</html>