<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>

<table border="1" width="50%" align="center">
  <tr>
    <td>번호</td>
    <td>이름</td>
    <td>이메일</td>
  </tr>
  <c:forEach var="map" items="${list}">
  	<tr>
  	  <td>${map.no}</td>
  	  <td>${map.name}</td>
  	  <td>${map.email}</td>
  	</tr>
  </c:forEach>
</table>
</body>
</html>
