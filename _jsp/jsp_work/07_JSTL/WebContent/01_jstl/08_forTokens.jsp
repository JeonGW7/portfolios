<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--08_forTokens.jsp--%>
<%--
■ forTokens 태그는 java.util.StringTokenizer클래스와 같은 기능을 한다
■ 형식
<c:forTokens var="aa" items="문자열",,," delims="토큰구분기호">
${aa}
</c:forTokens>
--%>
<h2>forTokens실습</h2>
<c:forTokens var="token" items="빨강색,주황색,노랑색:남색:파란색:보라색" delims=",:">
  ${token}&nbsp;
</c:forTokens>