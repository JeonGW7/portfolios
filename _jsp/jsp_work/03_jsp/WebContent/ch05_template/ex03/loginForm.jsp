<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%--loginForm.jsp--%>
<html>
  <head>
    <style type="text/css">
    h2{
    text-align: center;
    }
    table{
    margin: auto;
    border: 1px solid black;
    }
    </style>
  </head>
  <body>
    <h2>로그인</h2>
    <form method="post" action="">
      <table>
        <tr>
          <td>ID</td>
          <td><input type="text" name="id" size="20"></td>
        </tr>
        <tr>
          <td>패스워드</td>
          <td><input type="password" name="pw" size="20"></td>
        </tr>
        <tr>
          <td colspan="2" align="center">
            <input type="submit" value="로그인">
            <input type="reset" value="취소">
          </td>
        </tr>
      </table>
    </form>
  </body>
</html>