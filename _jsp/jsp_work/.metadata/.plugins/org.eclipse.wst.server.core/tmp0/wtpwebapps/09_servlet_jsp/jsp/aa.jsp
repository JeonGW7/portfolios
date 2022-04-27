<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.util.*"
    %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--aa.jsp--%>
<h2>${user}님의 정보</h2>
ID:${map.id}<br>
암호:${map.pw}<br>
주소:${map.addr}<br>
<br>
<br>
${map}
<br>
<br>
<c:forEach var="m" items="${map}">
  ${m.value}<br>  
</c:forEach>
<%--
서블릿을 실행
 --%>
