<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--05_for_each.jsp--%>

<%--
설명:
forEach태그는 배열이나 Collection에 저장된 값들을 순차적으로 처리할 때 사용한다
자바의 for,while과 유사하다  

형식
<c:forEach var="변수" items="아이템">
  처리내용
</c:forEach>
item속성에 올수 있는 것들: 배열,Map,Collection
배열일 경우 기본데이터는 랩퍼클래스(Integer,Long,Double)를 사용하여 처리한다
--%>
<%--1~10까지 출력하기--%>
<c:forEach var="i" begin="1" end="10" step="1">
${i}&nbsp;
</c:forEach>
<br>
<%--1~20까지 짝수만 출력 forEach태그 if태그 사용--%>
<c:forEach var="i" begin="1" end="20" step="1">
  <c:if test="${i%2==0}">
    ${i}&nbsp;
  </c:if>
</c:forEach>
<br><br>
<%--1~10까지 합구하기--%>
<c:set var="sum" value="0"/>
<c:forEach var="i" begin="1" end="10">
  <c:set var="sum" value="${sum+i}"/>
</c:forEach>
합: ${sum}