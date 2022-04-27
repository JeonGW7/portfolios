<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/header.jsp" %>
<%--detail.jsp--%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>상세보기</title>
</head>
<body>
  <div align="center" class="body">
    <h2>상품 상세 화면</h2>
    <table>
      <tr>
        <td>
          <img src="imgs/${itemDTO.pictureUrl}" width="200" height="200">
        </td>
        <td>
          <table>
            <tr height="50">
              <td width="80">상품명</td>
              <td width="160">${itemDTO.itemName}</td>
            </tr>
            <tr height="50">
              <td width="80">가격</td>
              <td width="160">${itemDTO.price}</td>
            </tr>
            <tr height="50">
              <td width="80">설명</td>
              <td width="160">${itemDTO.description}</td>
            </tr>
            <tr>
              <td colspan="2" align="center" width="240">
                <a href="index.html">목록보기로 가기</a>
              </td>
            </tr>
          </table>
        </td>
      </tr>
    </table>
  </div>
</body>
</html>