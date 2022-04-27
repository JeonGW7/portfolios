<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%--loginForm.jsp--%>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>loginForm.jsp</title>
  <script src="//code.jquery.com/jquery-3.6.0.min.js"></script>
  <script type="text/javascript" src="script.js"></script>
</head>
<body bgcolor="#996600" topmargin="100">
  <%@ include file="top.jsp" %>
  <form method="post" name="login" action="loginPro.jsp">
    <table width="60%" align="center" border="1" bgcolor="ivory">
      <tr>
        <td colspan="2" align="center">
          <font size=5><b>로그인</b></font>
        </td>
      </tr>
      <tr>
        <td>ID</td>
        <td><input type="text" name="memId" id="memId" size="60"></td>
      </tr>
      <tr>
        <td>암호</td>
        <td><input type="password" name="pw" id="pw" size="60"></td>
      </tr>
      <tr>
        <td colspan="2" align="center">
          <input type="button" value="로그인" onclick="loginCheck()">
          <input type="reset" value="취소">
        </td>
      </tr>
    </table>
  </form>
  <%@ include file="bottom.jsp" %>
</body>
</html>