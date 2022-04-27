<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/header/header.jsp" %>
<%--
deletePro.jsp

x=1 삭제성공
x=-1 암호틀림
--%>
<%--세션무효화--%>
<c:remove var="id" scope="session"/>
<c:if test="${x==1}">
  <h3>회원 탈퇴가 완료되었습니다</h3>
  <meta http-equiv="Refresh" content="0;url=${ctxpath}/member/main.do">
</c:if>

<c:if test="${x==-1}">
  <script>
    alert("암호가 틀립니다");
    history.back();
  </script>  
</c:if>