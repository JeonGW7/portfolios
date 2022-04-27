<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>        
<%--03_date_Timezone.jsp--%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
  <h2>timeZone</h2>
  <%--
  timeZone : 각 나라별 시간대를 나타낸다
  <fmt:formatDate value="nowDate"/>...이렇게 사용해서 현재 우리나라 시간대를 표시
  <fmt:timeZone value="GMT"/> 로 설정해서 영국시간대를 표시
  GMT(Greenwich Mean Time) 그리니치 평균시.
    런던교외의 그리니치 천문대의 자오선상에서의 평균 태양시를 기준으로 하여 
    전세계의 지방 표준시를 나타낸다
  --%>
  <h2>실습</h2>
  <c:set var="nowDate" value="<%=new java.util.Date()%>"/>
  Korea KST:<fmt:formatDate value="${nowDate}" type="both" dateStyle="full" timeStyle="full"/>
  <br>
  UK GMT:
  <fmt:timeZone value="GMT">
    <fmt:formatDate value="${nowDate}" type="both" dateStyle="full" timeStyle="full"/>
  </fmt:timeZone>
  <br>
  US:
  <fmt:timeZone value="GMT-5">
    <fmt:formatDate value="${nowDate}" type="both" dateStyle="full" timeStyle="full"/>
  </fmt:timeZone>
</body>
</html>