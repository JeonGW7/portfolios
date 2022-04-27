<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%--test03_Encoding.jsp--%>
<%
//request.setCharacterEncoding("UTF-8");
%>
<fmt:requestEncoding value="UTF-8"/>
<html>
<body>
out태그는 웹으로 출력하는 태그입니다<br>
<c:out value="out태그는 웹으로 출력하는 태그"/><br>
파라미터값:<c:out value="${param.name}"/>
<form method="get" action="test03_Encoding.jsp">
<input type="text" name="name" value="슈퍼맨">
<input type="submit" value="전송">
</form>
</body>
</html>