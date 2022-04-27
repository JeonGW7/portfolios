<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/header/header.jsp" %>
<%--updatePro.jsp--%>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>Insert title here</title>
</head>
<body>
  <table>
    <tr>
      <td>
        <h3>회원 정보 수정 완료</h3>
      </td>
    </tr>
    <tr>
      <td>
        <form>
          <input type="button" value="메인으로" onclick="location='${ctxpath}/member/main.do'">
        </form>
      </td>
    </tr>
  </table>
  <meta http-equiv="Refresh" content="5;url=${ctxpath}/member/main.do">
</body>
</html>