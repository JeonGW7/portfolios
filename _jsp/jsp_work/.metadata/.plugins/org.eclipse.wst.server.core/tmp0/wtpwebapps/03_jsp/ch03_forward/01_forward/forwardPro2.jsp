<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>forwardPro2.jsp</title>
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
  <h2>forwardPro2.jsp</h2>
  <table border="1">
    <tr>
      <td>이름</td>
      <td><%=request.getParameter("name") %></td>
    </tr>
    <tr>
      <td>전화</td>
      <td><%=request.getParameter("tel") %></td>
    </tr>
    <tr>
      <td>주소</td>
      <td><%=request.getParameter("addr") %></td>
    </tr>
    <tr>
      <td>ID</td>
      <td><%=request.getParameter("id") %></td>
    </tr>
    <tr>
      <td>암호</td>
      <td><%=request.getParameter("pw") %></td>
    </tr>
  </table>
</body>
</html>