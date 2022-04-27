<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../module/jspheader.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>header.jsp</title>
<script type="text/javascript">
function updateUser() {
	//내정보 수정
	document.modifyForm.action="${ctxpath}/member/modify.do";
	document.modifyForm.submit();
}
</script>
</head>
<body>
<table border="0" style="width:100%;min-width:70%;">
  <tr>
    <td align="left">
      <a href="${ctxpath}">홈으로</a>
    </td>
      
    <td align="right">
      <a href="${ctxpath}/member/shop/productList.do">상품목록</a>&nbsp;
      <a href="${ctxpath}/board/list.do">게시판</a>&nbsp;
      <a href="${ctxpath}/notice/list.do">공지사항</a>&nbsp;
      <a href="${ctxpath}/faq/list.do">FAQ</a>&nbsp;
      <a href="${ctxpath}/review/list.do">리뷰</a>&nbsp;
      <a href="${ctxpath}/ask/list.do">1:1문의</a>
    </td>
  </tr>
  <tr>
    <td colspan="2" align="right">
    <c:if test="${id==null}">
      <a href="${ctxpath}/member/loginForm.do">로그인</a>&nbsp;
      <a href="${ctxpath}/member/insertForm.do">회원가입</a>
    </c:if>
    <c:if test="${id!=null}">
      <a href="${ctxpath}/member/logOut.do">로그아웃</a>&nbsp;
      <a href="javaScript:updateUser()">내정보변경</a>&nbsp;
    </c:if>
    
    </td>
  </tr>
</table>
<form name="modifyForm" method="post">
  <input type="hidden" name="id" value="${id}">
</form>
</body>
</html>