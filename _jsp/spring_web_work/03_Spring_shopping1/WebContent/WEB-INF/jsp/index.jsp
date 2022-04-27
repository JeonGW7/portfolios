<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--index.jsp--%>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>Insert title here</title>
  <link rel="stylesheet" type="text/css" href="shopping1.css">
</head>
<body>
  <div align="center" class="body">
    <h2>상품 목록 화면</h2>
    <table border="1">
      <tr class="header">
        <th>상품ID</th>
        <th>상품명</th>
        <th>가격</th>
      </tr>
      <c:forEach var="itemDTO" items="${itemList}">
        <tr class="record">
          <td>${itemDTO.itemId}</td>
          <td>${itemDTO.itemName}</td>
          <td>${itemDTO.price}</td>
        </tr>
      </c:forEach>
    </table>
  </div>
<%--
 프로젝트 실행/index.html
 http://localhost:9000/03_spring_shopping1/
 http://localhost:9000/컨텍스트이름/index.html
--%>
</body>
</html>