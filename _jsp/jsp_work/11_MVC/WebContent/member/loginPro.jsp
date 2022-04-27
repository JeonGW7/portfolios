<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/header/header.jsp" %>
<%--loginPro.jsp--%>
<%
/*이전방법
session.setAttribute("id",(String)request.getAttribute("id"));
*/
%>
<%--
x=1 로그인 성공
x=0 암호가 틀림
x=-1 없는 id
--%>
<%--로그인--%>
<c:if test="${x==1}">
  <c:set var="id" value="${id}" scope="session"/>
  <meta http-equiv="Refresh" content="0;url=${ctxpath}/member/main.do">
</c:if>
<%--암호틀릴때--%>
<c:if test="${x==0}">
  <script>
  alert("암호틀림");
  history.back();
  </script>
</c:if>
<%--없는ID--%>
<c:if test="${x==-1}">
  <script>
  alert("없는ID");
  history.back();
  </script>
</c:if>