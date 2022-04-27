<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>  
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>detail.jsp</title>
</head>
<body>
 <%--${detail} --%>

<table border="1" align="center">
  <tr>
    <td colspan="2" align="right">
      <a href="/list">리스트</a>
    </td>
  </tr>
  <tr>
    <td>글번호</td> 
    <td>${detail.bno}</td> 
  </tr>
  <tr>
    <td>글쓴이</td> 
    <td>${detail.writer}</td> 
  </tr>
  <tr>
    <td>글제목</td> 
    <td>${detail.subject}</td> 
  </tr>
  <tr>
    <td>글내용</td> 
    <td>
    <textarea rows="10" cols="50">${detail.content}</textarea>
    </td> 
  </tr>
   <tr>
    <td>날짜</td> 
    <td>
    <fmt:formatDate value="${detail.reg_date}" pattern="yyyy-MM-dd"/>
    </td> 
  </tr>
  <tr>
    <td colspan="2" align="center">
    
    <a href="/update/${detail.bno}">글수정</a>
    
    <button onclick="location.href='/update/${detail.bno}'">수정</button> 
    <button onclick="location.href='/delete/${detail.bno}'">삭제</button>
      
    
    </td>
  </tr>
  
  </table>

</body>

</html>