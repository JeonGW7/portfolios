<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--04_choose_when.jsp--%>
<%--
-choose~when : switch~case 문과 유사하다
형식
<c:choose>
  <c:when test="${조건1}">
       조건1일때 수행
  </c:when>
  
  <c:when test="${조건1}">
       조건2일때 수행
  </c:when>
  
  <c:when test="${조건1}">
       조건3일때 수행
  </c:when>
  
  <c:otherwise>
       기타처리
  </c:otherwise>
  
</c:choose>

설명
조건이 true이면 when안쪽내용을 처리하고 choose태그를 탈출한다
모든 조건이 false이면 <c:otherwise>태그 안의 내용을 수행한다
--%>
<h2>choose태그 실습</h2>
<c:choose>
  <c:when test="${param.name=='park'}">
       이름:${param.name}<br>
  </c:when>
  
  <c:when test="${param.age>=19}">
        나이는 ${param.age}살이고, 성인입니다
  </c:when>
  
  <c:otherwise>
       당신의 이름은 park아니고, 나이는 19살 이상도 아닙니다
   <br>
       파라미터값이 없습니다
  </c:otherwise>
  
</c:choose>