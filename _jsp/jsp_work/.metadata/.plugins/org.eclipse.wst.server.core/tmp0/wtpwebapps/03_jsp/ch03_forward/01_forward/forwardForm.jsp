<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>forwardForm.jsp</title>
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
  <h2>forwardForm.jsp</h2>
  <form method="post" action="forwardPro.jsp">
    <table>
      <tr>
        <td>이름</td>
        <td><input type="text" name="name" size="20"></td>
      </tr>
      <tr>
        <td>전화</td>
        <td><input type="text" name="tel" size="20"></td>
      </tr>
      <tr>
        <td>주소</td>
        <td><input type="text" name="addr" size="20"></td>
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