<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>  

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>list.jsp</title>
</head>
<body>
 <%--${list} --%>
 
<table border="1"  align="center">
  <tr>
    <td colspan="5" align="right">
      <a href="/insertForm">새글쓰기</a>
    </td>
  </tr>
  <tr>
   <th>글번호</th>
   <th>글쓴이</th>
   <th>글제목</th>
   <th>날짜</th>
   <th>글내용보기</th>
  </tr>
  <c:forEach var="vo" items="${list}">
  <%-- tr onclick="location.href='/detail/${l.bno}'"> <!-- 이 부분 수정! --> --%>
    <tr>
      <td>${vo.bno}</td>
      <td>${vo.writer}</td>
      
      <td>
      <a href="/detail/${vo.bno}">${vo.subject}</a>
      </td>
      <td>
      <fmt:formatDate value="${vo.reg_date}" pattern="yyyy-MM-dd" />
      </td>
     <td>
      <a href="/detail/${vo.bno}">상세보기</a>
      </td>
    </tr>
  </c:forEach>
</table>

 
</body>
</html>