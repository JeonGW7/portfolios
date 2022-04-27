<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/header.jsp" %>
<%--index.jsp--%>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>Insert title here</title>
  <link rel="stylesheet" type="text/css" href="css/shopping1.css">
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
          <td>
          <a href="detail.html?itemId=${itemDTO.itemId}">
          ${itemDTO.itemName}
          </a>
          </td>
          <td>${itemDTO.price}원</td>
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