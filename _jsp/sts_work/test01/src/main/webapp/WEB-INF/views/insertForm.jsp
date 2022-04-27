<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%--insertForm.jsp--%>
<html>
<head>
  <meta charset="UTF-8">
  <title>Insert title here</title>
  <style type="text/css">
  h2{
  text-align: center;
  }
  table{
  margin: auto;
  width: 50%;
  border: 1px solid black;
  }
  </style>
</head>
<body>
  <h2>입력폼</h2>
  <form name="myForm" method="post" action="insertPro.do">
    <table>
      <tr>
        <td>이름</td>
        <td><input type="text" name="name" id="name" size="30"></td>
      </tr>
      <tr>
        <td>이메일</td>
        <td><input type="text" name="email" id="email" size="30"></td>
      </tr>
      <tr>
        <td colspan="2" align="center">
          <input type="submit" value="전송">
          <input type="reset" value="취소">
        </td>
      </tr>
    </table>
  </form>
</body>
</html>